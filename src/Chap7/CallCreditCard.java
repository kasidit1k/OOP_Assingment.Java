package Chap7;

public class CallCreditCard {

    public static void main(String[] args) {
       CreditCard cc = CreditCard.createInstance(15500);
        System.out.println("Object : "+cc.getMinSalary());
    }
}
