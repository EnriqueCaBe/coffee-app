package com.enriquecabe.coffeegql.coffee.application.add_coffee;

import com.enriquecabe.coffeegql.coffee.domain.Coffee;

public interface AddCoffeeUseCase {
    Coffee execute(AddCoffeeCommand command);
}
