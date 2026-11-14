import java.util.Scanner;

abstract class Doctor{
    double consultationCharge;
    Doctor(double c){
        this.consultationCharge=c;
    }
    abstract String getDoctorType();
    double calculateTotalBill(double testCharges){
        return consultationCharge;
    }
}
class GeneralPhysician extends Doctor{
     double testcharge;
     int consultationCharge=500;
    public GeneralPhysician( double testcharge) {
        this.testcharge=testcharge;
        super(500);
    }
    @Override 
    String getDoctorType() {
        return "GeneralPhysician";
    }
     double calculateTotalBill(){
        return super.calculateTotalBill(testcharge);
    }

}
class Specialist extends Doctor{
    double testcharge;
    int consultationCharge = 1000;
    public Specialist(double testcharge) {
        this.testcharge=testcharge;
        super(1000);
    }
    @Override 
    String getDoctorType() {
        return "Specialist";
    }
    double calculateTotalBill(){
        return super.calculateTotalBill(testcharge);
    }

}
class EmergencyDoctor extends Doctor{
    double testCharges;
    int consultationCharge=1500;
    public EmergencyDoctor(double testCharges) {
        super(1500);
        this.testCharges=testCharges;
    }
    @Override 
    String getDoctorType() {
        return "EmergencyDoctor";
    }
    @Override 
    double calculateTotalBill(double testCharges){
        return testCharges+super.consultationCharge;
    }

}
class hospital{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double t = sc.nextDouble();
        if(a==1){
            GeneralPhysician g = new GeneralPhysician(t);
            System.out.println("Doctor Type: "+g.getDoctorType());
            System.out.println("Consultation Charge: "+g.consultationCharge);
            System.out.println("Test Charges: "+t);
            System.out.println("Total Bill: "+g.calculateTotalBill());
        }
        if(a==2){
            Specialist g = new Specialist(t);
            System.out.println("Doctor Type: "+g.getDoctorType());
            System.out.println("Consultation Charge: "+g.consultationCharge);
            System.out.println("Test Charges: "+t);
            System.out.println("Total Bill: "+g.calculateTotalBill());
        }
        if(a==3){
            EmergencyDoctor g = new EmergencyDoctor(t);
            System.out.println("Doctor Type: "+g.getDoctorType());
            System.out.println("Consultation Charge: "+g.consultationCharge);
            System.out.println("Test Charges: "+t);
            System.out.println("Total Bill: "+g.calculateTotalBill(t));
        }
    }
}
