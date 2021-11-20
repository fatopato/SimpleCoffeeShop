package coffee;

import ingredient.IngredientItem;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    List<IngredientItem> items;

    public Recipe() {
        this.items = new ArrayList<>();
    }

    public String getRecipeDetails() {
        StringBuilder recipe = new StringBuilder("Bu içeceğimiz ");
        for (IngredientItem item : items) {
            recipe.append(item.displayItem());
            if (!isLast(item)) {
                recipe.append(" + ");
            }
        }
        recipe.append(" içermektedir.");
        return recipe.toString();
    }

    private boolean isLast(IngredientItem item) {
        return this.items.indexOf(item) == (this.items.size() - 1);
    }
}
