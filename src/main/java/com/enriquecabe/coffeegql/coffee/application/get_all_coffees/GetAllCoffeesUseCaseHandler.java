package com.enriquecabe.coffeegql.coffee.application.get_all_coffees;

import com.enriquecabe.coffeegql.coffee.domain.Coffee;
import com.enriquecabe.coffeegql.coffee.domain.CoffeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllCoffeesUseCaseHandler implements GetAllCoffeesUseCase{
    private final CoffeeRepository coffeeRepository;

    public GetAllCoffeesUseCaseHandler(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    @Override
    public List<Coffee> execute(GetAllCoffeesQuery query) {
        return coffeeRepository.findAll(query.name(), query.acidity(),query.body(), query.bitterness(), query.roast(), query.intensity(), query.caffeine(), query.type(), query.size(), query.flavours());
    }
}
