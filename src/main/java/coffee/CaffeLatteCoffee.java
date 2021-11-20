package coffee;

import ingredient.Espresso;
import ingredient.IngredientItem;
import ingredient.MilkFoam;
import ingredient.SteamedMilk;
import util.CoffeeUtil;
import util.Constants;

import java.math.BigDecimal;

public class CaffeLatteCoffee extends Coffee {

    @Override
    BigDecimal getInitialPrice() {
        return CoffeeUtil.getPrice(Constants.PROP_LATTE);
    }

    @Override
    Recipe getInitialRecipe() {
        Recipe recipe = new Recipe();
        recipe.items.add(new IngredientItem(1, new Espresso()));
        recipe.items.add(new IngredientItem(3, new SteamedMilk()));
        recipe.items.add(new IngredientItem(1, new MilkFoam()));
        return recipe;
    }

    @Override
    String getInitialName() {
        return Constants.NAME_LATTE;
    }
}
