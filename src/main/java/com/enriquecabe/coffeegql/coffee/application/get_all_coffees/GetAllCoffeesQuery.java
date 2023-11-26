package com.enriquecabe.coffeegql.coffee.application.get_all_coffees;

import com.enriquecabe.coffeegql.coffee.domain.enums.CapsuleType;
import com.enriquecabe.coffeegql.coffee.domain.enums.CoffeeFlavours;
import com.enriquecabe.coffeegql.coffee.domain.enums.CoffeeSize;

import java.util.List;

public record GetAllCoffeesQuery(

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
) {

}
