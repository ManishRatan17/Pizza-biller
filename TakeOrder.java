package Pizza;

import java.util.*;
import java.util.Scanner;


public class TakeOrder {
    public static Scanner sc = new Scanner(System.in);

    public Map<String, Integer> getAddOrder() {
        return addOrder;
    }

    private Map<String,Integer> addOrder=new LinkedHashMap<>();



     TakeOrder(Map<String,Integer> combinedMenu) {
         System.out.println("Enter your Order: (Enter done to finish)");
         while(true){
         boolean found=false;
             String order = sc.nextLine().trim();
             if(order.equals("done")) break;

             for (String key : combinedMenu.keySet()) {
                 if(key.equalsIgnoreCase(order)){
                     addOrder.put(key, addOrder.getOrDefault(key, 0) + 1);
                     System.out.println(key+" added Successfully");
                     found=true;
                     break;
                 }
             }
             if(!found){
                 System.out.println("Not Available in the Menu\n"+"Enter your order");
             }

         }

    }
}
