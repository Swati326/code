package fiveyrs.factoryPattern;

public class CreditPayment implements Payment{
    @Override
    public String withdraw() {
        return "CreditPayment";
    }

    @Override
    public String toString() {
        return "CreditPayment{}";
    }
}
