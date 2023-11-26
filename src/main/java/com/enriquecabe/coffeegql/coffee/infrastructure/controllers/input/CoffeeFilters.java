package com.enriquecabe.coffeegql.coffee.infrastructure.controllers.input;

import com.enriquecabe.coffeegql.coffee.domain.enums.CapsuleType;
import com.enriquecabe.coffeegql.coffee.domain.enums.CoffeeFlavours;
import com.enriquecabe.coffeegql.coffee.domain.enums.CoffeeSize;

import java.util.List;

public record CoffeeFilters(
        String name,
        Integer acidity,
        Integer body,
        Integer bitterness,
        Integer roast,
        Integer intensity,
        Boolean caffeine,
        CapsuleType type,
        List<CoffeeSize> size,
        List<CoffeeFlavours> flavours
) {}
