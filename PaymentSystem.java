class Payment {
    void pay() { System.out.println("General payment"); }
}

class CreditCardPayment extends Payment {
    void pay() { System.out.println("Paid using Credit Card"); }
}

class UPIPayment extends Payment {
    void pay() { System.out.println("Paid using UPI"); }
}

class NetBankingPayment extends Payment {
    void pay() { System.out.println("Paid using Net Banking"); }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();  p.pay();
        p = new UPIPayment();         p.pay();
        p = new NetBankingPayment();  p.pay();
    }
}

