package coffee;

import ingredient.Espresso;
import ingredient.IngredientItem;
import util.CoffeeUtil;
import util.Constants;

import java.math.BigDecimal;

public class DoubleEspressoCoffee extends Coffee {

    @Override
    BigDecimal getInitialPrice() {
        return CoffeeUtil.getPrice(Constants.PROP_DOUBLE_ESPRESSO);
    }

    @Override
    Recipe getInitialRecipe() {
        Recipe recipe = new Recipe();
        recipe.items.add(new IngredientItem(2, new Espresso()));
        return recipe;
    }

    @Override
    String getInitialName() {
        return Constants.NAME_DOUBLE_ESPRESSO;
    }
}
