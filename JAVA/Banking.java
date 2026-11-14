import java.util.Scanner;

abstract class BankAccount{
    int accountNumber ;
    double balance;
    BankAccount(int a,double b){
        this.accountNumber = a;
        this.balance = b;
    }
    abstract double calculateFinalBalance();
}

class SavingsAccount extends BankAccount{
    double interestRate;
    SavingsAccount(int a,double b,double i){
        super(a,b);
        this.interestRate = i;
    }
    @Override 
    double calculateFinalBalance() {
        double b = super.balance;
        return b+(b*(interestRate/100));
    }
}
class CurrentAccount extends BankAccount{
    double overdraftLimit;
    CurrentAccount(int a,double b,double i){
        super(a,b);
        this.overdraftLimit = i;
    }
    @Override 
    double calculateFinalBalance() {
        double b = super.balance;
        return b+overdraftLimit;
    }
}

class Banking{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        if(a==1){
            SavingsAccount s = new SavingsAccount(b, c, d);
            System.out.println(s.calculateFinalBalance());
        }
        else{
            CurrentAccount ca = new CurrentAccount(b,c,d);
            System.out.println(ca.calculateFinalBalance());
        }
    }
}
