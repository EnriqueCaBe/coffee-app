package com.enriquecabe.coffeegql.coffee.domain;

import com.enriquecabe.coffeegql.coffee.domain.enums.CapsuleType;
import com.enriquecabe.coffeegql.coffee.domain.enums.CoffeeFlavours;
import com.enriquecabe.coffeegql.coffee.domain.enums.CoffeeSize;

import java.util.List;

public interface CoffeeRepository {
    Coffee save(Coffee coffee);
    List<Coffee> findAll(String name, Integer acidity, Integer body, Integer bitterness, Integer roast, Integer intensity, Boolean caffeine, CapsuleType type, List<CoffeeSize> sizes, List<CoffeeFlavours> flavours);
    Coffee findById(String id);
    void delete(Coffee coffee);
    Coffee update(Coffee coffee);
}
