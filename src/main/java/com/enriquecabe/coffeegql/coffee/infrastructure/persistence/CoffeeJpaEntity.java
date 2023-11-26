package com.enriquecabe.coffeegql.coffee.infrastructure.persistence;

import com.enriquecabe.coffeegql.coffee.domain.enums.CapsuleType;
import com.enriquecabe.coffeegql.coffee.domain.enums.CoffeeFlavours;
import com.enriquecabe.coffeegql.coffee.domain.enums.CoffeeSize;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "coffee")
public class CoffeeJpaEntity {
    @Id
    private String id;
    private String name;
    private String shortDescription;
    private String description;
    private Integer acidity;
    private Integer body;
    private Integer bitterness;
    private Integer roast;
    private Integer intensity;
    private Float price;
    private Boolean caffeine;
    private CapsuleType capsuleType;
    private List<CoffeeSize> sizes;
    private List<CoffeeFlavours> flavours;

    public CoffeeJpaEntity() {
        // Required for JPA
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAcidity() {
        return acidity;
    }

    public void setAcidity(Integer acidity) {
        this.acidity = acidity;
    }

    public Integer getBody() {
        return body;
    }

    public void setBody(Integer body) {
        this.body = body;
    }

    public Integer getBitterness() {
        return bitterness;
    }

    public void setBitterness(Integer bitterness) {
        this.bitterness = bitterness;
    }

    public Integer getRoast() {
        return roast;
    }

    public void setRoast(Integer roast) {
        this.roast = roast;
    }

    public Integer getIntensity() {
        return intensity;
    }

    public void setIntensity(Integer intensity) {
        this.intensity = intensity;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Boolean isCaffeine() {
        return caffeine;
    }

    public void setCaffeine(Boolean caffeine) {
        this.caffeine = caffeine;
    }

    public CapsuleType getCapsuleType() {
        return capsuleType;
    }

    public void setCapsuleType(CapsuleType capsuleType) {
        this.capsuleType = capsuleType;
    }

    public List<CoffeeSize> getSizes() {
        return sizes;
    }

    public void setSizes(List<CoffeeSize> sizes) {
        this.sizes = sizes;
    }

    public List<CoffeeFlavours> getFlavours() {
        return flavours;
    }

    public void setFlavours(List<CoffeeFlavours> flavours) {
        this.flavours = flavours;
    }
}
