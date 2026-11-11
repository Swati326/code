package fiveyrs.factoryPattern;

public class FactoryPattern {

    public Payment getPayment(String paymentType) {
        if (paymentType.equalsIgnoreCase("UPI")) {
            return new UPIPayment();
        } else if (paymentType.equalsIgnoreCase("CREDIT")) {
            return new CreditPayment();

        }
        return null;
    }

}
