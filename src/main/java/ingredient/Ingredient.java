package ingredient;

import lombok.Data;

@Data
public abstract class Ingredient {
    protected String name;

    protected Ingredient() {
    }

    protected Ingredient(String name) {
        this.name = name;
    }
}
