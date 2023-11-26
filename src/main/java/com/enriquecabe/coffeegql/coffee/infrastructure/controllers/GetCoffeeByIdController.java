package com.enriquecabe.coffeegql.coffee.infrastructure.controllers;

import com.enriquecabe.coffeegql.coffee.application.get_coffee_by_id.GetCoffeeByIdQuery;
import com.enriquecabe.coffeegql.coffee.application.get_coffee_by_id.GetCoffeeByIdUseCase;
import com.enriquecabe.coffeegql.coffee.domain.Coffee;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GetCoffeeByIdController {
    private final GetCoffeeByIdUseCase getCoffeeByIdUseCase;

    public GetCoffeeByIdController(GetCoffeeByIdUseCase getCoffeeByIdUseCase) {
        this.getCoffeeByIdUseCase = getCoffeeByIdUseCase;
    }

    @QueryMapping
    public Coffee getCoffeeById(@Argument String id){
        return getCoffeeByIdUseCase.execute(new GetCoffeeByIdQuery(id));
    }
}
