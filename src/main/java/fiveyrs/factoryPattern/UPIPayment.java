package fiveyrs.factoryPattern;

public class UPIPayment implements  Payment{
    @Override
    public String withdraw() {
        return "UPIPayment";
    }

    @Override
    public String toString() {
        return "UPIPayment{}";
    }
}
