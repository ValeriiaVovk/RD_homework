package src.lesson28;

import java.lang.reflect.Field;

public class Validator {
    public static void validate(Object object) {
        Class<?> clazz = object.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(PasswordValidation.class)) {
                PasswordValidation annotation = field.getAnnotation(PasswordValidation.class);
                field.setAccessible(true);

                Object fieldValue;
                try {
                    fieldValue = field.get(object);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }

                if (fieldValue == null || fieldValue.toString().length() != annotation.length()) {
                    throw new IllegalArgumentException(annotation.message());
                }
            }
        }
    }
}

