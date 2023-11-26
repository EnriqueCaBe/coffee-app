package com.enriquecabe.coffeegql.coffee.application.get_coffee_by_id;

import com.enriquecabe.coffeegql.coffee.domain.Coffee;
import com.enriquecabe.coffeegql.coffee.domain.CoffeeRepository;
import com.enriquecabe.coffeegql.coffee.domain.exceptions.CoffeeNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class GetCoffeeByIdUseCaseHandler implements GetCoffeeByIdUseCase {
    private final CoffeeRepository coffeeRepository;

    public GetCoffeeByIdUseCaseHandler(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    @Override
    public Coffee execute(GetCoffeeByIdQuery query) {
        Coffee coffee = coffeeRepository.findById(query.id());
        if (coffee == null)
            throw new CoffeeNotFoundException("Coffee with id " + query.id() + " not found");
        return coffee;
    }
}
