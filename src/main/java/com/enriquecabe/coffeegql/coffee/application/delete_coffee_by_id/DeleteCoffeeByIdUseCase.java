package com.enriquecabe.coffeegql.coffee.application.delete_coffee_by_id;

import com.enriquecabe.coffeegql.coffee.domain.Coffee;

public interface DeleteCoffeeByIdUseCase {
    Coffee execute(DeleteCoffeeByIdCommand command);
}
