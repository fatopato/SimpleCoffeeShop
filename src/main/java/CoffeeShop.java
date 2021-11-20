import display.CoffeeShopDisplay;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CoffeeShop {

    public static void main(String[] args) {
        CoffeeShopDisplay coffeeShopDisplay = new CoffeeShopDisplay();
        coffeeShopDisplay.initializeCoffeeShop();

        Exception caughtException = null;

        while (caughtException == null){
            try {
                coffeeShopDisplay.orderCoffee();
            } catch (InterruptedException e) {
                caughtException = e;
                System.out.println("Çıkış yaptnız. İyi günler");
                Thread.currentThread().interrupt();
            }
        }
    }
}
