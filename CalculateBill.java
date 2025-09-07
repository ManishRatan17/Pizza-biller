package Pizza;

import java.util.LinkedHashMap;
import java.util.Map;

public class CalculateBill {
    private Map<String, Integer> combinedMenu;
    TakeOrder takeOrder ;
//
    public CalculateBill(TakeOrder takeOrder, Map<String, Integer> combinedMenu) {
        this.takeOrder = takeOrder;
        this.combinedMenu = combinedMenu;
    }


    public int calculateBill() {


        int total = 0;
        for (Map.Entry<String, Integer> e : takeOrder.getAddOrder().entrySet()) {
            String pizzaName = e.getKey();
            int quantity = e.getValue();
            int price = combinedMenu.get(pizzaName);
            total += price * quantity;

        }
        return total;
    }


    public void printBill() {
        int total = calculateBill();
        int i=0;

        for (Map.Entry<String, Integer> e : takeOrder.getAddOrder().entrySet()) {
            String pizzaName = e.getKey();
            int quantity = e.getValue();
            int price = combinedMenu.get(pizzaName);
            i++;
            System.out.printf("%-1d. %-20s %10dx%d %n", i, pizzaName, quantity, price);
        }

        System.out.println("--------------------------------------");
        System.out.printf("  Total Bill: %24d ", total);

    }
}
