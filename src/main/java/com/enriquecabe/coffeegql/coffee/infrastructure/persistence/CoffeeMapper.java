package com.enriquecabe.coffeegql.coffee.infrastructure.persistence;

import com.enriquecabe.coffeegql.coffee.domain.Coffee;

import java.util.List;

public class CoffeeMapper {
    private CoffeeMapper() {
    }

    public static Coffee toDomain(CoffeeJpaEntity entity) {
        return Coffee.builder()
                .id(entity.getId())
                .name(entity.getName())
                .shortDescription(entity.getShortDescription())
                .description(entity.getDescription())
                .acidity(entity.getAcidity())
                .bitterness(entity.getBitterness())
                .body(entity.getBody())
                .roast(entity.getRoast())
                .caffeine(entity.isCaffeine())
                .flavors(entity.getFlavours())
                .capsuleType(entity.getCapsuleType())
                .sizes(entity.getSizes())
                .intensity(entity.getIntensity())
                .build();
    }

    public static List<Coffee> toDomain(List<CoffeeJpaEntity> entities) {
        return entities.stream().map(CoffeeMapper::toDomain).toList();
    }
}
