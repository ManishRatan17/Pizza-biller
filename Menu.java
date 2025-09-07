package Pizza;


import java.util.*;



public class Menu {

     Menu(Map<String,Integer> veg , Map<String, Integer> nonVeg) {
        printMenu(veg,nonVeg);
    }

    public void printMenu(Map<String, Integer> veg , Map<String, Integer> nonVeg) {
        Iterator<Map.Entry<String, Integer>> vegIt = veg.entrySet().iterator();
        Iterator<Map.Entry<String,Integer>> nonVegIt = nonVeg.entrySet().iterator();

        System.out.printf("%20s %35s%n","Veg Items", "Non Veg Items");
        System.out.println("-------------------------------------------------------------------");

        while(vegIt.hasNext()|| nonVegIt.hasNext()){

            String vegItem="";
            String nonVegItem="";
            if(vegIt.hasNext()){
                Map.Entry<String, java.lang.Integer> vegEntry= vegIt.next();
                vegItem=String.format("%-20s: %6d",vegEntry.getKey(), vegEntry.getValue());
            }

            if(nonVegIt.hasNext()){
                Map.Entry<String, java.lang.Integer> nonVegEntry = nonVegIt.next();
                nonVegItem=String.format("%-20s: %6d",nonVegEntry.getKey(), nonVegEntry.getValue());
            }



//            System.out.println(vegItem+nonVegItem);

            System.out.printf("%-36s  %s %n",vegItem,nonVegItem);
        }
    }



}



