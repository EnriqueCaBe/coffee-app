package com.enriquecabe.coffeegql.coffee.domain;

import com.enriquecabe.coffeegql.coffee.domain.enums.CapsuleType;
import com.enriquecabe.coffeegql.coffee.domain.enums.CoffeeFlavours;
import com.enriquecabe.coffeegql.coffee.domain.enums.CoffeeSize;

import java.util.List;

public class Coffee {
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
    private CapsuleType type;
    private List<CoffeeSize> sizes;
    private List<CoffeeFlavours> flavours;

    private Coffee() {
    }

    public static CoffeeBuilder builder(){
        return new CoffeeBuilder();
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

    public Boolean getCaffeine() {
        return caffeine;
    }

    public void setCaffeine(Boolean caffeine) {
        this.caffeine = caffeine;
    }

    public CapsuleType getType() {
        return type;
    }

    public void setType(CapsuleType type) {
        this.type = type;
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

    public static class CoffeeBuilder {
        private final Coffee coffee = new Coffee();

        private CoffeeBuilder() {
        }

        public CoffeeBuilder id(String id) {
            this.coffee.setId(id);
            return this;
        }

        public CoffeeBuilder name(String name) {
            this.coffee.setName(name);
            return this;
        }

        public CoffeeBuilder shortDescription(String shortDescription) {
            this.coffee.setShortDescription(shortDescription);
            return this;
        }

        public CoffeeBuilder description(String description) {
            this.coffee.setDescription(description);
            return this;
        }

        public CoffeeBuilder acidity(int acidity) {
            this.coffee.setAcidity(acidity);
            return this;
        }

        public CoffeeBuilder body(int body) {
            this.coffee.setBody(body);
            return this;
        }

        public CoffeeBuilder bitterness(int bitterness) {
            this.coffee.setBitterness(bitterness);
            return this;
        }

        public CoffeeBuilder roast(int roast) {
            this.coffee.setRoast(roast);
            return this;
        }

        public CoffeeBuilder intensity(int intensity) {
            this.coffee.setIntensity(intensity);
            return this;
        }

        public CoffeeBuilder price(float price) {
            this.coffee.setPrice(price);
            return this;
        }

        public CoffeeBuilder caffeine(Boolean caffeine) {
            this.coffee.setCaffeine(caffeine);
            return this;
        }
        public CoffeeBuilder capsuleType(CapsuleType capsuleType) {
            this.coffee.setType(capsuleType);
            return this;
        }
        public CoffeeBuilder sizes(List<CoffeeSize> sizes) {
            this.coffee.setSizes(sizes);
            return this;
        }
        public CoffeeBuilder flavors(List<CoffeeFlavours> flavours) {
            this.coffee.setFlavours(flavours);
            return this;
        }
        public Coffee build(){
            return this.coffee;
        }
    }
}
