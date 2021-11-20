package ingredient;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IngredientItem {
    private int quantity;
    private Ingredient ingredient;

    public String displayItem() {
        return quantity + " doz " + ingredient.getName();
    }
}
