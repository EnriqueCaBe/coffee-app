package com.enriquecabe.coffeegql.coffee.application.get_coffee_by_id;

import com.enriquecabe.coffeegql.coffee.domain.Coffee;

public interface GetCoffeeByIdUseCase {
    Coffee execute(GetCoffeeByIdQuery query);
}
