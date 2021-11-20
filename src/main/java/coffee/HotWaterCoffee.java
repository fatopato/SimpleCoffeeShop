package coffee;

import ingredient.HotWater;
import ingredient.IngredientItem;
import util.CoffeeUtil;
import util.Constants;

import java.math.BigDecimal;

public class HotWaterCoffee extends Coffee {

    @Override
    BigDecimal getInitialPrice() {
        return CoffeeUtil.getPrice(Constants.PROP_HOT_WATER);
    }

    @Override
    Recipe getInitialRecipe() {
        Recipe recipe = new Recipe();
        recipe.items.add(new IngredientItem(5, new HotWater()));
        return recipe;
    }

    @Override
    String getInitialName() {
        return Constants.NAME_HOT_WATER;
    }
}
