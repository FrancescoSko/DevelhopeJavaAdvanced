package JavaAdvanced.DevelhopeJavaAdvanced;

import JavaAdvanced.progettoRistorante.Piatto;

import java.sql.SQLOutput;
import java.util.HashMap;

public class Map {
 public static void main (String [] args){
     HashMap<Integer, String> englishNumbers = new HashMap<Integer, String>();

     englishNumbers.put(1, "One");
     englishNumbers.put(2, "Two");
     englishNumbers.put(3, "Three");
     englishNumbers.put(4, "Four");
     englishNumbers.put(5, "Five");

     HashMap<Integer, String> italianOddNumbers = new HashMap<Integer, String>();

     italianOddNumbers.put(1, "Uno");
     italianOddNumbers.put(3, "Tre");
     italianOddNumbers.put(5, "Cinque");
     italianOddNumbers.put(7, "Sette");
     italianOddNumbers.put(9, "Nove");

      englishNumbers.putAll(italianOddNumbers);
       System.out.println(englishNumbers);

     for (int i = 5; i <= 9 ; i++) {
         if (englishNumbers.containsKey(i)){
             System.out.println(i);
         } else System.out.println("No associated value");

     }


  }


  }

