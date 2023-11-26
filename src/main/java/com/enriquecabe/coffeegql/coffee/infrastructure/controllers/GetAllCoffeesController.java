package com.enriquecabe.coffeegql.coffee.infrastructure.controllers;

import com.enriquecabe.coffeegql.coffee.application.get_all_coffees.GetAllCoffeesQuery;
import com.enriquecabe.coffeegql.coffee.application.get_all_coffees.GetAllCoffeesUseCase;
import com.enriquecabe.coffeegql.coffee.domain.Coffee;
import com.enriquecabe.coffeegql.coffee.infrastructure.controllers.input.CoffeeFilters;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GetAllCoffeesController {
    private final GetAllCoffeesUseCase getAllCoffeesUseCase;

    public GetAllCoffeesController(GetAllCoffeesUseCase getAllCoffeesUseCase) {
        this.getAllCoffeesUseCase = getAllCoffeesUseCase;
    }

    @QueryMapping
    public List<Coffee> getAllCoffees(@Argument CoffeeFilters filters) {
        CoffeeFilters result = filters != null ? filters : new CoffeeFilters(null, null, null, null, null, null, null, null, null, null);
        return getAllCoffeesUseCase.execute(
                new GetAllCoffeesQuery(
                        result.name(),
                        result.acidity(),
                        result.body(),
                        result.bitterness(),
                        result.roast(),
                        result.intensity(),
                        result.caffeine(),
                        result.type(),
                        result.size(),
                        result.flavours()
                )
        );
    }
}
