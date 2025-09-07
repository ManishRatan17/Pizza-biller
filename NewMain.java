package Pizza;

import java.util.*;

public class NewMain {
    public static void main(String[] args) {

        Map<String, Integer> veg = new LinkedHashMap<>();
        Map<String, Integer> nonVeg = new LinkedHashMap<>();
        Map<String, Integer> combinedMenu = new LinkedHashMap<>();

        veg.put("Margherita", 150);
        veg.put("Farmhouse", 200);
        veg.put("Paneer Makhani", 220);
        veg.put("Corn N Jalapeno", 180);
        veg.put("Cheese N Corn", 200);


        nonVeg.put("Chicken Fiesta", 250);
        nonVeg.put("Spicy Chicken", 260);
        nonVeg.put("Tandoori Chicken", 300);
        nonVeg.put("Mutton Masala", 350);
        nonVeg.put("BBQ Chicken", 280);

        combinedMenu.putAll(veg);
        combinedMenu.putAll(nonVeg);

        Menu menu = new Menu(veg, nonVeg);
        TakeOrder takeOrder = new TakeOrder(combinedMenu);
        CalculateBill calculateBill = new CalculateBill(takeOrder, combinedMenu);

        calculateBill.printBill();

    }

}
