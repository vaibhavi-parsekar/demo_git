
import java.util.Scanner;

interface Payment{
    void pay();
}

class UPIPayment implements Payment{
    public void pay(){
        System.out.println("Payment using net banking");
    }
}

class NetBankingPayment implements Payment{
    public void pay(){
        System.out.println("Payment using net banking");
    }
}

class Checkout{
    void processpayment(Payment p){
        p.pay();

    }
}

public class LoseCoupling {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Checkout checkout = new Checkout();
        Payment payment;

        System.out.println("Select Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Net Banking");

        int choice = sc.nextInt();

        if (choice == 1) {
            payment = new UPIPayment();
        } else if (choice == 2) {
            payment = new NetBankingPayment();
        } else {
            System.out.println("Invalid choice");
            sc.close();
            return;
        }

        checkout.processPayment(payment);
        sc.close();
    }
    
}
