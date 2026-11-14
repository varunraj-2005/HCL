import java.util.*;
abstract class Employee{
    String employeeName;
    Employee(String e){
        this.employeeName = e;
    }
    abstract double calculateBonus();
    abstract double calculateBonus(double amount);
}
class TechnicalEmployee extends Employee{
    double basicSalary;
    int rating;

    public TechnicalEmployee(String e,double b,int r) {
        super(e);
        this.basicSalary=b;
        this.rating=r;
    }
    @Override 
    public double calculateBonus(){
        return calculateBonus(basicSalary);
    }
    @Override 
    public double calculateBonus(double amount){
        return amount*rating*(2.0/100);
    }
    
}
class SalesEmployee extends Employee{
    double salesAmount;

    public SalesEmployee(String e,double s) {
        super(e);
        this.salesAmount=s;
    }
    @Override 
    public double calculateBonus(){
        return calculateBonus(salesAmount);
    }
    @Override 
    public double calculateBonus(double amount){
        return amount*(3.0/100);
    }
    
}

class Bonus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String sa[] = s.split(" ");
        s= sa[0];
        double b = Double.parseDouble(sa[1]);
        //System.out.println(b+" "+c);
        double d;
        System.out.println("Employee Name: "+s);
        if(a==1){
            int c = Integer.parseInt(sa[2]);
            TechnicalEmployee t = new TechnicalEmployee(s, b, c);
            d = t.calculateBonus();
        }
        else{
            SalesEmployee se = new SalesEmployee(s, b);
            d = se.calculateBonus();
        }
        System.out.println("Bonus: "+d);
        System.out.println("Total Earnings: "+(b+d));
    }
}
