package fiveyrs.factoryPattern;

import java.security.PublicKey;

public class UserPayment {

    public static void main(String[] args) {

        String paymentType="UPI";
        FactoryPattern factoryPattern=new FactoryPattern();
        System.out.println(factoryPattern.getPayment(paymentType));
    }
}
