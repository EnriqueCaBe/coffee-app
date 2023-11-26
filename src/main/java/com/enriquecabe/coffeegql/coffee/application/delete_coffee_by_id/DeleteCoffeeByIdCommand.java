package com.enriquecabe.coffeegql.coffee.application.delete_coffee_by_id;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.UUID;

public record DeleteCoffeeByIdCommand(
        @NotNull(message = "Id cannot be null")
        @NotBlank(message = "Id cannot be empty")
        @UUID(message = "Id needs to be a UUID")
        String id
) {
}
