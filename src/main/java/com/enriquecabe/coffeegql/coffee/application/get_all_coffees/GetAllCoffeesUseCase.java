package com.enriquecabe.coffeegql.coffee.application.get_all_coffees;

import com.enriquecabe.coffeegql.coffee.domain.Coffee;

import java.util.List;

public interface GetAllCoffeesUseCase {
    List<Coffee> execute(GetAllCoffeesQuery query);
}
