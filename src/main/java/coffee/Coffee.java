package coffee;

import lombok.Data;

import java.math.BigDecimal;

@Data
public abstract class Coffee {
    private String name;
    private Recipe recipe;
    private BigDecimal price;

    abstract BigDecimal getInitialPrice();

    abstract Recipe getInitialRecipe();

    abstract String getInitialName();

    private void initialize() {
        this.setPrice(getInitialPrice());
        this.setRecipe(getInitialRecipe());
        this.setName(getInitialName());
    }

    protected Coffee() {
        initialize();
    }

    public String getDetails() {
        StringBuilder details = new StringBuilder(getName());
        details.append(" seçtiniz. ");
        details.append(recipe.getRecipeDetails());
        return details.toString();
    }
}
