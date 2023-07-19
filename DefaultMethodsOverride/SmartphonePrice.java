package JavaAdvanced.DevelhopeJavaAdvanced.DefaultMethodsOverride;

import java.util.Objects;

public class SmartphonePrice implements Cloneable {
    protected String priceType;
    protected double priceInEuros;

    public SmartphonePrice(String priceType, double priceInEuros) {
        this.priceType = priceType;
        this.priceInEuros = priceInEuros;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public double getPriceInEuros() {
        return priceInEuros;
    }

    public void setPriceInEuros(double priceInEuros) {
        this.priceInEuros = priceInEuros;
    }

    @Override
    public SmartphonePrice clone() throws CloneNotSupportedException {
        SmartphonePrice clonedSmartphonePrice = (SmartphonePrice) super.clone();
        return clonedSmartphonePrice;
    }


    @Override
    public String toString() {
        return "The smartphone price is: " + priceType + " " + priceInEuros;
    }

    @Override
    public boolean equals(Object otherSmartphonePrice) {
        if (this == otherSmartphonePrice) return true;
        if (otherSmartphonePrice == null || getClass() != otherSmartphonePrice.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) otherSmartphonePrice;
        return Double.compare(that.priceInEuros, priceInEuros) == 0 && Objects.equals(priceType, that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }
}
