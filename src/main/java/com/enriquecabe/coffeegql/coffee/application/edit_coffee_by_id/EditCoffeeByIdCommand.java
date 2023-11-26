package com.enriquecabe.coffeegql.coffee.application.edit_coffee_by_id;

import com.enriquecabe.coffeegql.coffee.domain.enums.CapsuleType;
import com.enriquecabe.coffeegql.coffee.domain.enums.CoffeeFlavours;
import com.enriquecabe.coffeegql.coffee.domain.enums.CoffeeSize;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.UUID;

import java.util.List;

public record EditCoffeeByIdCommand(
        @NotNull(message = "Id cannot be null")
        @NotBlank(message = "Id cannot be empty")
        @UUID(message = "Id needs to be a UUID")
        String id,
        @NotNull(message = "Name cannot be null")
        @NotBlank(message = "Name cannot be empty")
        String name,

        @NotNull(message = "Short description cannot be null")
        @NotBlank(message = "Short description cannot be empty")
        String shortDescription,

        @NotNull(message = "Description cannot be null")
        @NotBlank(message = "Description cannot be empty")
        String description,

        @NotNull(message = "Acidity cannot be null")
        @Min(value = 1, message = "Acidity has to be between 1 and 5")
        @Max(value = 5, message = "Acidity has to be between 1 and 5")
        Integer acidity,

        @NotNull(message = "Body cannot be null")
        @Min(value = 1, message = "Body has to be between 1 and 5")
        @Max(value = 5, message = "Body has to be between 1 and 5")
        Integer body,

        @NotNull(message = "Bitterness cannot be null")
        @Min(value = 1, message = "Bitterness has to be between 1 and 5")
        @Max(value = 5, message = "Bitterness has to be between 1 and 5")
        Integer bitterness,

        @NotNull(message = "Roast cannot be null")
        @Min(value = 1, message = "Roast has to be between 1 and 5")
        @Max(value = 5, message = "Roast has to be between 1 and 5")
        Integer roast,

        @NotNull(message = "Intensity cannot be null")
        @Min(value = 1, message = "Intensity has to be between 1 and 13")
        @Max(value = 13, message = "Intensity has to be between 1 and 13")
        Integer intensity,

        @NotNull(message = "Price cannot be null")
        @DecimalMax(value = "9999.99")
        Float price,

        @NotNull(message = "Caffeine cannot be null")
        Boolean caffeine,

        @NotNull(message = "Type cannot be null")
        CapsuleType type,

        @NotNull(message = "Size cannot be null")
        @NotEmpty(message = "Size list cannot be empty")
        List<CoffeeSize> size,

        @NotNull(message = "Flavours cannot be null")
        @NotEmpty(message = "Flavours list cannot be empty")
        List<CoffeeFlavours> flavours
) {
}
