package JavaAdvanced.DevelhopeJavaAdvanced;

import java.util.*;

public class MapAndSet {
 public static void main (String [] args){
     HashMap<String, Integer> months = new LinkedHashMap<String, Integer>();
      months.put("January", 1);
      months.put("February", 2);
      months.put("March", 3);
      months.put("April", 4);
      months.put("May", 5);
      months.put("June", 6);
      months.put("July", 7);
      months.put("August", 8);
      months.put("Semptember", 9);
      months.put("October", 10);
      months.put("November", 11);
      months.put("December", 12);


    Set<String> monthsKeys = months.keySet();
  System.out.println(monthsKeys);

  List<Integer> cardinalMonth = new ArrayList<>(months.values());
  System.out.println(cardinalMonth);
  // Collections <Integer> cardinalMonth =  months.values();    questo e' un modo ulteriore per stampare sottoforma di collection senza convertire in una lista i numeri cardinali dei mesi.

  Integer[] cardinalMonthArray = months.values().toArray(new Integer[0]);
  System.out.println("Array of cardinal numbers: " + Arrays.toString(cardinalMonthArray));

    }
}
