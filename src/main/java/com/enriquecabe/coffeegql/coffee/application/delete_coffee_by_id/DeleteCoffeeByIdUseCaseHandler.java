package com.enriquecabe.coffeegql.coffee.application.delete_coffee_by_id;

import com.enriquecabe.coffeegql.coffee.domain.Coffee;
import com.enriquecabe.coffeegql.coffee.domain.CoffeeRepository;
import com.enriquecabe.coffeegql.coffee.domain.exceptions.CoffeeNotFoundException;
import com.enriquecabe.coffeegql.shared.ObjectValidator;
import org.springframework.stereotype.Service;

@Service
public class DeleteCoffeeByIdUseCaseHandler implements DeleteCoffeeByIdUseCase {
    private final CoffeeRepository coffeeRepository;

    public DeleteCoffeeByIdUseCaseHandler(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    @Override
    public Coffee execute(DeleteCoffeeByIdCommand command) {
        ObjectValidator.validateObject(command);

        Coffee coffee = coffeeRepository.findById(command.id());
        if (coffee == null)
            throw new CoffeeNotFoundException("Coffee with id " + command.id() + " not found");

        coffeeRepository.delete(coffee);
        return coffee;
    }
}
