package ru.protei.tacocloud.data;

import lombok.Data;

@Data
public class Ingredient {
    private final String id;
    private final String name;
    private final IngredientType type;

    public enum IngredientType {
        WRAP,
        Protein,
        CHEESE,
        SAUCE
    }
}
