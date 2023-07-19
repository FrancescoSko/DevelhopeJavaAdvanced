package JavaAdvanced.DevelhopeJavaAdvanced.DefaultMethodsOverride;

public class Main {
    public static void main(String[] args) {
    SmartphonePrice retailSmartphonePrice = new SmartphonePrice("Euros", 350);
    SmartphonePrice retailSmartphonePrice2 = new SmartphonePrice("Euros", 580);
    SmartphonePrice producerSmartphonePrice = new SmartphonePrice("Euros", 120);
    SmartphonePrice producerSmartphonePrice2 = new SmartphonePrice("Euros", 150);

    Smartphone smartphone = new Smartphone("Iphone", "8", 3500, retailSmartphonePrice, producerSmartphonePrice);
    Smartphone smartphone1 = new Smartphone("Iphone", "X", 4000, retailSmartphonePrice2, producerSmartphonePrice2);

        System.out.println(smartphone);
        System.out.println(smartphone1);

    if (smartphone.equals(smartphone1)){
        System.out.println("The smartphones are the same");
    } else System.out.println("The smartphones are not the same");


    try { Smartphone clonedSmartphone;
        clonedSmartphone = smartphone1.clone();
        System.out.println("Cloned smartphone: " + clonedSmartphone.toString());
        if (clonedSmartphone.equals(smartphone1)){
            System.out.println("The new smartphone is equal to the other one");
        } else System.out.println("The new smartphone is not equal to the other one");
      } catch (CloneNotSupportedException e) {
        e.printStackTrace();
        throw new RuntimeException(e);
      }


    }
}
