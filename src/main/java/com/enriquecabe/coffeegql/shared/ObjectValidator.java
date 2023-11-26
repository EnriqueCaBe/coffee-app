package com.enriquecabe.coffeegql.shared;

import com.enriquecabe.coffeegql.shared.exceptions.ValidationException;
import jakarta.validation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ObjectValidator {
    private ObjectValidator() {
    }

    private static final Validator validator;

    static {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    public static <T> void validateObject(T object) {
        Set<ConstraintViolation<T>> violations = validator.validate(object);
        if (!violations.isEmpty()) {
            List<String> messages = new ArrayList<>();
            for (ConstraintViolation<T> violation : violations) {
                messages.add(violation.getMessage());
            }
            throw new ValidationException(messages);
        }
    }
}
