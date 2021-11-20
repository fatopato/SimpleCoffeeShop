package coffee;

import ingredient.Espresso;
import ingredient.HotWater;
import ingredient.IngredientItem;
import util.CoffeeUtil;
import util.Constants;

import java.math.BigDecimal;

public class AmericanoCoffee extends Coffee {

    @Override
    BigDecimal getInitialPrice() {
        return CoffeeUtil.getPrice(Constants.PROP_AMERICANO);
    }

    @Override
    Recipe getInitialRecipe() {
        Recipe recipe = new Recipe();
        recipe.items.add(new IngredientItem(1, new Espresso()));
        recipe.items.add(new IngredientItem(4, new HotWater()));
        return recipe;
    }

    @Override
    String getInitialName() {
        return Constants.NAME_AMERICANO;
    }
}
