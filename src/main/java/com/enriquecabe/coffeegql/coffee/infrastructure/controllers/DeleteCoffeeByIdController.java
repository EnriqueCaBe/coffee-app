package com.enriquecabe.coffeegql.coffee.infrastructure.controllers;

import com.enriquecabe.coffeegql.coffee.application.delete_coffee_by_id.DeleteCoffeeByIdCommand;
import com.enriquecabe.coffeegql.coffee.application.delete_coffee_by_id.DeleteCoffeeByIdUseCase;
import com.enriquecabe.coffeegql.coffee.domain.Coffee;
import org.springframework.graphql.data.method.annotation.Arguments;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class DeleteCoffeeByIdController {
    private final DeleteCoffeeByIdUseCase deleteCoffeeByIdUseCase;

    public DeleteCoffeeByIdController(DeleteCoffeeByIdUseCase deleteCoffeeByIdUseCase) {
        this.deleteCoffeeByIdUseCase = deleteCoffeeByIdUseCase;
    }

    @MutationMapping
    public Coffee deleteCoffeeById(@Arguments String id){
        return deleteCoffeeByIdUseCase.execute(new DeleteCoffeeByIdCommand(id));
    }
}
