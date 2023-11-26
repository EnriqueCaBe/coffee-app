package com.enriquecabe.coffeegql.coffee.infrastructure.controllers.input;

import com.enriquecabe.coffeegql.coffee.domain.enums.CapsuleType;
import com.enriquecabe.coffeegql.coffee.domain.enums.CoffeeFlavours;
import com.enriquecabe.coffeegql.coffee.domain.enums.CoffeeSize;

import java.util.List;

public record CoffeeInput(
        String name,
        String shortDescription,
        String description,
        Integer acidity,
        Integer body,
        Integer bitterness,
        Integer roast,
        Integer intensity,
        Float price,
        Boolean caffeine,
        CapsuleType type,
        List<CoffeeSize> size,
        List<CoffeeFlavours> flavours) {}
