package com.enriquecabe.coffeegql.coffee.application.edit_coffee_by_id;

import com.enriquecabe.coffeegql.coffee.domain.Coffee;

public interface EditCoffeeByIdUseCase {
    Coffee execute(EditCoffeeByIdCommand command);
}
