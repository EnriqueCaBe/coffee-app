package com.enriquecabe.coffeegql.coffee.domain.exceptions;

public class CoffeeNotFoundException extends RuntimeException{
    public CoffeeNotFoundException(String message) {
        super(message);
    }
}
