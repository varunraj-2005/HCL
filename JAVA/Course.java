import java.util.Scanner;

abstract class course{
    double courseFee;
    double discount;
    course(double c){
        this.courseFee = c;
    }
    abstract double calculateDiscount();
    abstract String getCourseType();
    double calculateFinalFee(){
        return courseFee-discount;
    }
}
class ProgrammingCourse extends course{
    ProgrammingCourse(double courseFee){
        super(courseFee);
    }
    @Override 
    public double calculateDiscount(){
        super.discount=(courseFee*0.1);
        System.out.println("Discount: "+discount);
        return super.calculateFinalFee();
    }
    @Override 
    public String getCourseType(){
        return "ProgrammingCourse";
    }
}
class DataScienceCourse extends course{
    DataScienceCourse(double courseFee){
        super(courseFee);
    }
    @Override 
    public double calculateDiscount(){
        super.discount=(courseFee*0.15);
        System.out.println("Discount: "+discount);
        return super.calculateFinalFee();
    }
    @Override 
    public String getCourseType(){
        return "DataScienceCourse";
    }
}
class CloudCourse extends course{
    CloudCourse(double courseFee){
        super(courseFee);
    }
    @Override 
    public double calculateDiscount(){
        super.discount=(courseFee*0.05);
        System.out.println("Discount: "+discount);
        return super.calculateFinalFee();
    }
    @Override 
    public String getCourseType(){
        return "CloudCourse";
    }
}
class courses{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        if(a==1){
            ProgrammingCourse p = new ProgrammingCourse(b);
            System.out.println("Course Type: "+p.getCourseType());
            System.out.println("Final Fee: "+p.calculateDiscount());

        }
        else if(a==2){
            DataScienceCourse p = new DataScienceCourse(b);
            System.out.println("Course Type: "+p.getCourseType());
            System.out.println("Final Fee: "+p.calculateDiscount());
        }
        else{
            CloudCourse p = new CloudCourse(b);
            System.out.println("Course Type: "+p.getCourseType());
            System.out.println("Final Fee: "+p.calculateDiscount());
        }
    }
}
