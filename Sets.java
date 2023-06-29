package JavaAdvanced.DevelhopeJavaAdvanced;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Sets {
    public static void main (String [] args){
        HashSet<String> daysOfTheWeek = new HashSet<>();
        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");
        daysOfTheWeek.add("Thursday");
        daysOfTheWeek.add("Friday");
        daysOfTheWeek.add("Saturday");
        daysOfTheWeek.add("Sunday");

        System.out.println(daysOfTheWeek);

        HashSet<String> daysOfTheWeek1 = new LinkedHashSet<>(daysOfTheWeek);

        System.out.println(daysOfTheWeek1);

        System.out.println("Is the first Set equal to the second one?");

        if (daysOfTheWeek1.equals(daysOfTheWeek)){
            System.out.println("Yes!");
        } else System.out.println("No!");

    }


}
