import java.util.Scanner;

interface Payment{
    abstract  double calculateFee(double amount);
}
class CreditCardPayment implements Payment{
    @Override
    public double calculateFee(double amount){
        System.out.println("Payment Amount: "+amount);
        System.out.println("Transaction Fee: "+amount+(amount*0.02));
        return amount+(amount*0.02);
    }

}
class UpiPayment implements Payment{
    @Override
    public double calculateFee(double amount){
       System.out.println("Payment Amount: "+amount);
        System.out.println("Transaction Fee: "+amount+(amount*0.005));
        return amount+(amount*0.005);
    }

}
class Wallet implements Payment{
    @Override
    public double calculateFee(double amount){
        System.out.println("Payment Amount: "+amount);
        System.out.println("Transaction Fee: "+amount+(amount*0.01));
        return amount+(amount*0.01);
    }

}

class Pay{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Double d = sc.nextDouble();
        if(a==1){
            CreditCardPayment c = new CreditCardPayment();
            System.out.println("Final Amount: "+c.calculateFee(d));
        }
        else if(a==2){
            UpiPayment u = new UpiPayment();
            System.out.println("Final Amount: "+u.calculateFee(d));
        }
        else{
            Wallet w = new Wallet();
            System.out.println("Final Amount: "+w.calculateFee(d));
        }
    }
}
