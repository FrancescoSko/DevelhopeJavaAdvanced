package JavaAdvanced.DevelhopeJavaAdvanced.Enumerations;

public class Main {
    public static void main(String[] args) {

        for (Months month : Months.values()){
        String monthName = month.name();
          if (monthName.toLowerCase().endsWith("y")) {
              System.out.println(monthName.toUpperCase() + " ends with Y");
          }  else if (monthName.toUpperCase().endsWith("Y")){
                  System.out.println(monthName.toUpperCase() + " ends with Y");
          }   else System.out.println(monthName.toUpperCase() + " doesn't end with Y");

        }

    }
}
