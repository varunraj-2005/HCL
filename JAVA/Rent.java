import java.util.*;
abstract class Vechile{
    double dailyRate;

    public Vechile(double dailyRate) {
        this.dailyRate=dailyRate;
    }
    abstract double calculateRentalCharge(int rentalDays);
    abstract String getVehicleType();
    
}
class Car extends Vechile{
    Car(){
        super(1500);
    }
    @Override 
    public double calculateRentalCharge(int rentalDays){
        return 1500*rentalDays;
    }
    @Override 
    public String getVehicleType(){
        return "CAR";
    }
}
class Bike extends Vechile{
    Bike(){
        super(600);
    }
    @Override 
    public double calculateRentalCharge(int rentalDays){
        return 600*rentalDays;
    }
    @Override 
    public String getVehicleType(){
        return "BIKE";
    }
}
class Truck extends Vechile{
    Truck(){
        super(3000);
    }
    @Override 
    public double calculateRentalCharge(int rentalDays){
        return 3000*rentalDays;
    }
    @Override 
    public String getVehicleType(){
        return "TRUCK";
    }
}
class Rent{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==1){
            Car c = new Car();
            System.out.println("Vehicle Type: "+c.getVehicleType());
            System.out.println("Rental Charge: "+c.calculateRentalCharge(b));
        }
        else if(a==2){
            Bike c = new Bike();
            System.out.println("Vehicle Type: "+c.getVehicleType());
            System.out.println("Rental Charge: "+c.calculateRentalCharge(b));
        }
        else{
            Truck c = new Truck();
            System.out.println("Vehicle Type: "+c.getVehicleType());
            System.out.println("Rental Charge: "+c.calculateRentalCharge(b));
        }
    }
}
