import java.util.Scanner;

abstract class Delivery{
    double orderAmount;
    Delivery(double orderAmount){
        this.orderAmount=orderAmount;
    }
    abstract double calculateDeliverCharge();
}

class RegularDelivery extends Delivery{
    double charge = 40.0;
    public RegularDelivery(double amount) {
        super(amount);
    }
    @Override
    public double calculateDeliverCharge(){
        return super.orderAmount+charge;
    }
}
class ExpressDelivery extends Delivery{
    double charge = 80.0;
    public ExpressDelivery(double amount) {
        super(amount);
    }
    @Override
    public double calculateDeliverCharge(){
        return super.orderAmount+charge+(super.orderAmount*(0.05));
    }
}

class food{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        if(a==1){
            RegularDelivery r = new RegularDelivery(b);
            System.out.println(r.calculateDeliverCharge());
        }
        else{
            ExpressDelivery e = new ExpressDelivery(b);
            System.out.println(e.calculateDeliverCharge());
        }
    }
}
