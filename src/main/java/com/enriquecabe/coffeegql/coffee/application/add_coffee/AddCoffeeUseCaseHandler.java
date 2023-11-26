package com.enriquecabe.coffeegql.coffee.application.add_coffee;

import com.enriquecabe.coffeegql.coffee.domain.Coffee;
import com.enriquecabe.coffeegql.coffee.domain.CoffeeRepository;
import com.enriquecabe.coffeegql.shared.ObjectValidator;
import jakarta.validation.*;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class AddCoffeeUseCaseHandler implements AddCoffeeUseCase {
    private final CoffeeRepository coffeeRepository;

    public AddCoffeeUseCaseHandler(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    @Override
    public Coffee execute(AddCoffeeCommand command) {
        ObjectValidator.validateObject(command);

        Coffee coffee = Coffee.builder()
                .id(UUID.randomUUID().toString())
                .name(command.name())
                .shortDescription(command.shortDescription())
                .description(command.description())
                .acidity(command.acidity())
                .body(command.body())
                .bitterness(command.bitterness())
                .roast(command.roast())
                .intensity(command.intensity())
                .caffeine(command.caffeine())
                .sizes(command.size())
                .capsuleType(command.type())
                .flavors(command.flavours())
                .build();
        return coffeeRepository.save(coffee);
    }
}
