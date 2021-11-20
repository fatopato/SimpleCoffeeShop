package display;

import coffee.*;
import util.Constants;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CoffeeShopDisplay {
    private static final String TEMPLATE = "%d. %s (%s ₺)\n";
    private String coffeeMenu;

    ArrayList<Coffee> coffees;

    public void initializeCoffeeShop() {
        coffees = new ArrayList<>();
        coffees.add(new EspressoCoffee());
        coffees.add(new DoubleEspressoCoffee());
        coffees.add(new CappuccinoCoffee());
        coffees.add(new CaffeLatteCoffee());
        coffees.add(new MochaCoffee());
        coffees.add(new AmericanoCoffee());
        coffees.add(new HotWaterCoffee());
        StringBuilder coffeeList = new StringBuilder();
        coffees.forEach(coffee -> coffeeList.append(
                String.format(TEMPLATE, coffees.indexOf(coffee) + 1, coffee.getName(), coffee.getPrice().toString())));
        coffeeList.append(Constants.QUIT_INT).append(". Çıkış\n");

        coffeeMenu = coffeeList.toString();
    }

    public void orderCoffee() throws InterruptedException {
        displayMenu();
        int selection = Constants.INVALID_INT;
        try {
            selection = getSelection();
        } catch (InputMismatchException e){
            System.out.println("Lütfen sayı giriniz");
        }
        getCoffeeBySelection(selection);
    }

    private void displayMenu() {
        System.out.println("******MENU******");
        System.out.println(coffeeMenu);
        System.out.println("Lütfen içmek istedğiniz kahvenin numarasını giriniz");
    }

    private void getCoffeeBySelection(int selection) throws InterruptedException {
        if (selection == Constants.QUIT_INT ){
            throw new InterruptedException("Çıkış yaptınız");
        } else if (selection == Constants.INVALID_INT) {
            System.out.println("Yalnızca tam sayı kabul edilir");
            return;
        } else if (selection < 1 || selection > 7) {
            System.out.println("Yanlış bir sayı girdiniz");
            return;
        }
        Coffee coffee = CoffeeEnum.values()[selection].getCoffee();
        String details = coffee.getDetails();
        System.out.println(details);
    }

    private int getSelection() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
