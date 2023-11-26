package com.enriquecabe.coffeegql.coffee.application.edit_coffee_by_id;

import com.enriquecabe.coffeegql.coffee.domain.Coffee;
import com.enriquecabe.coffeegql.coffee.domain.CoffeeRepository;
import com.enriquecabe.coffeegql.coffee.domain.exceptions.CoffeeNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class EditCoffeeByIdUseCaseHandler implements EditCoffeeByIdUseCase{
    private final CoffeeRepository coffeeRepository;

    public EditCoffeeByIdUseCaseHandler(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    @Override
    public Coffee execute(EditCoffeeByIdCommand command) {
        Coffee coffee = coffeeRepository.findById(command.id());
        if(coffee == null)
            throw new CoffeeNotFoundException("Coffee with id "+command.id()+" not found");

        coffee.setName(command.name());
        coffee.setShortDescription(command.shortDescription());
        coffee.setDescription(command.description());
        coffee.setAcidity(command.acidity());
        coffee.setBitterness(command.bitterness());
        coffee.setAcidity(command.acidity());
        coffee.setRoast(command.roast());
        coffee.setCaffeine(command.caffeine());
        coffee.setIntensity(command.intensity());
        coffee.setPrice(command.price());
        coffee.setType(command.type());
        coffee.setSizes(command.size());
        coffee.setFlavours(command.flavours());

        return coffeeRepository.update(coffee);
    }
}
