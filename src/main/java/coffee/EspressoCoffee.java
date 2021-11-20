package coffee;

import ingredient.Espresso;
import ingredient.IngredientItem;
import util.CoffeeUtil;
import util.Constants;

import java.math.BigDecimal;

public class EspressoCoffee extends Coffee {

    @Override
    BigDecimal getInitialPrice() {
        return CoffeeUtil.getPrice(Constants.PROP_ESPRESSO);
    }

    @Override
    Recipe getInitialRecipe() {
        Recipe recipe = new Recipe();
        recipe.items.add(new IngredientItem(1, new Espresso()));
        return recipe;
    }

    @Override
    String getInitialName() {
        return Constants.NAME_ESPRESSO;
    }
}
