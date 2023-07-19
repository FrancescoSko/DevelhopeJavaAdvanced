package JavaAdvanced.DevelhopeJavaAdvanced.DefaultMethodsOverride;

import java.util.Objects;

public class Smartphone implements Cloneable {
  private  String brandName;
  private  String modelName;
  private   int batteryMaH;

  private SmartphonePrice producerPrice;
  private SmartphonePrice retailPrice;

    public Smartphone(String brandName, String modelName, int batteryMaH, SmartphonePrice producerPrice, SmartphonePrice retailPrice ) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.batteryMaH = batteryMaH;
        this.producerPrice = producerPrice;
        this.retailPrice = retailPrice;

    }

    public SmartphonePrice getProducerPrice() {
        return producerPrice;
    }

    public void setProducerPrice(SmartphonePrice producerPrice) {
        this.producerPrice = producerPrice;
    }

    public SmartphonePrice getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(SmartphonePrice retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getBatteryMaH() {
        return batteryMaH;
    }

    public void setBatteryMaH(int batteryMaH) {
        this.batteryMaH = batteryMaH;
    }

@Override
    public String toString(){

    return "Smartphone{" +
            "brandName='" + brandName + '\'' +
            ", modelName='" + modelName + '\'' +
            ", batterymAh=" + batteryMaH +
            ", producerPrice=" + producerPrice +
            ", retailPrice=" + retailPrice +
            '}';
}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return batteryMaH == that.batteryMaH && Objects.equals(brandName, that.brandName) && Objects.equals(modelName, that.modelName) && Objects.equals(producerPrice, that.producerPrice) && Objects.equals(retailPrice, that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batteryMaH, producerPrice, retailPrice);
    }


    @Override
    public Smartphone clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone) super.clone();
        clonedSmartphone.producerPrice = producerPrice;
        clonedSmartphone.retailPrice = retailPrice;
        return clonedSmartphone;
    }
}

