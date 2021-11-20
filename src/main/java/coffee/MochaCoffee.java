package coffee;

import ingredient.*;
import util.CoffeeUtil;
import util.Constants;

import java.math.BigDecimal;

public class MochaCoffee extends Coffee {

    @Override
    BigDecimal getInitialPrice() {
        return CoffeeUtil.getPrice(Constants.PROP_MOCHA);
    }

    @Override
    Recipe getInitialRecipe() {
        Recipe recipe = new Recipe();
        recipe.items.add(new IngredientItem(1, new Espresso()));
        recipe.items.add(new IngredientItem(1, new SteamedMilk()));
        recipe.items.add(new IngredientItem(1, new MilkFoam()));
        recipe.items.add(new IngredientItem(2, new HotChocolate()));
        return recipe;
    }

    @Override
    String getInitialName() {
        return Constants.NAME_MOCHA;
    }
}
