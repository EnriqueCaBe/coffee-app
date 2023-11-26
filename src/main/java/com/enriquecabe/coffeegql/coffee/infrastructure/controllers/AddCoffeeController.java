package com.enriquecabe.coffeegql.coffee.infrastructure.controllers;

import com.enriquecabe.coffeegql.coffee.application.add_coffee.AddCoffeeCommand;
import com.enriquecabe.coffeegql.coffee.application.add_coffee.AddCoffeeUseCase;
import com.enriquecabe.coffeegql.coffee.domain.Coffee;
import com.enriquecabe.coffeegql.coffee.infrastructure.controllers.input.CoffeeInput;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AddCoffeeController {
    private final AddCoffeeUseCase addCoffeeUseCase;

    public AddCoffeeController(AddCoffeeUseCase addCoffeeUseCase) {
        this.addCoffeeUseCase = addCoffeeUseCase;
    }

    @MutationMapping
    public Coffee addCoffee(@Argument CoffeeInput coffee){
        System.out.println(coffee);
        return addCoffeeUseCase.execute( new AddCoffeeCommand(
                coffee.name(),
                coffee.shortDescription(),
                coffee.description(),
                coffee.acidity(),
                coffee.body(),
                coffee.bitterness(),
                coffee.roast(),
                coffee.intensity(),
                coffee.price(),
                coffee.caffeine(),
                coffee.type(),
                coffee.size(),
                coffee.flavours()
        ));
    }
}
