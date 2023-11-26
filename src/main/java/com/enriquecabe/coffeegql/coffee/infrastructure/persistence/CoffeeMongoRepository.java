package com.enriquecabe.coffeegql.coffee.infrastructure.persistence;

import com.enriquecabe.coffeegql.coffee.domain.Coffee;
import com.enriquecabe.coffeegql.coffee.domain.CoffeeRepository;
import com.enriquecabe.coffeegql.coffee.domain.enums.CapsuleType;
import com.enriquecabe.coffeegql.coffee.domain.enums.CoffeeFlavours;
import com.enriquecabe.coffeegql.coffee.domain.enums.CoffeeSize;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CoffeeMongoRepository implements CoffeeRepository {
    private final CoffeeJpaRepository coffeeJpaRepository;

    public CoffeeMongoRepository(CoffeeJpaRepository coffeeJpaRepository) {
        this.coffeeJpaRepository = coffeeJpaRepository;
    }

    @Override
    public Coffee save(Coffee coffee) {
        CoffeeJpaEntity entity = new CoffeeJpaEntity();
        entity.setId(coffee.getId());
        setCoffeeAttributes(coffee, entity);
        return CoffeeMapper.toDomain(coffeeJpaRepository.save(entity));
    }

    @Override
    public List<Coffee> findAll(String name, Integer acidity, Integer body, Integer bitterness, Integer roast, Integer intensity, Boolean caffeine, CapsuleType type, List<CoffeeSize> sizes, List<CoffeeFlavours> flavours) {
        Example<CoffeeJpaEntity> example = getFiltersExample(name, acidity, body, bitterness, roast, intensity, caffeine, type, sizes, flavours);
        List<CoffeeJpaEntity> entities = coffeeJpaRepository.findAll(example);
        if(entities.isEmpty())
            return new ArrayList<>();
        return CoffeeMapper.toDomain(entities);
    }

    private Example<CoffeeJpaEntity> getFiltersExample(String name, Integer acidity, Integer body, Integer bitterness, Integer roast, Integer intensity, Boolean caffeine, CapsuleType type, List<CoffeeSize> sizes, List<CoffeeFlavours> flavours) {
        CoffeeJpaEntity entity = new CoffeeJpaEntity();
        entity.setName(name);
        entity.setCapsuleType(type);
        entity.setSizes(sizes);
        entity.setFlavours(flavours);

        if (acidity != null) {
            entity.setAcidity(acidity);
        }
        if (body != null) {
            entity.setBody(body);
        }
        if (bitterness != null) {
            entity.setBitterness(bitterness);
        }
        if (roast != null) {
            entity.setRoast(roast);
        }
        if (intensity != null) {
            entity.setIntensity(intensity);
        }
        if (caffeine != null) {
            entity.setCaffeine(caffeine);
        }
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnoreCase()
                .withIgnoreNullValues();

        return Example.of(entity, matcher);
    }

    @Override
    public Coffee findById(String id) {
        CoffeeJpaEntity entity = coffeeJpaRepository.findById(id).orElse(null);
        if(entity == null)
            return null;
        return CoffeeMapper.toDomain(entity);
    }

    @Override
    public void delete(Coffee coffee) {
        coffeeJpaRepository.deleteById(coffee.getId());
    }

    @Override
    public Coffee update(Coffee coffee) {
        Optional<CoffeeJpaEntity> entity = coffeeJpaRepository.findById(coffee.getId());
        if(entity.isPresent()){
            CoffeeJpaEntity coffeeJpaEntity = entity.get();
            setCoffeeAttributes(coffee, coffeeJpaEntity);
            return CoffeeMapper.toDomain(coffeeJpaRepository.save(coffeeJpaEntity));
        }
        return null;
    }

    private void setCoffeeAttributes(Coffee coffee, CoffeeJpaEntity coffeeJpaEntity) {
        coffeeJpaEntity.setName(coffee.getName());
        coffeeJpaEntity.setShortDescription(coffee.getShortDescription());
        coffeeJpaEntity.setDescription(coffee.getDescription());
        coffeeJpaEntity.setAcidity(coffee.getAcidity());
        coffeeJpaEntity.setBody(coffee.getBody());
        coffeeJpaEntity.setBitterness(coffee.getBitterness());
        coffeeJpaEntity.setRoast(coffee.getRoast());
        coffeeJpaEntity.setIntensity(coffee.getIntensity());
        coffeeJpaEntity.setCaffeine(coffee.getCaffeine());
        coffeeJpaEntity.setFlavours(coffee.getFlavours());
        coffeeJpaEntity.setSizes(coffee.getSizes());
        coffeeJpaEntity.setCapsuleType(coffee.getType());
    }
}
