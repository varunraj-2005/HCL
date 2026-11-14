import java.util.*;
abstract class Employee{
private int employeeId;
private String employeeName;
Employee(int employeeId,String employeeName){
this.employeeId=employeeId;
this.employeeName = employeeName;
}
abstract double calculateSalary();
}
class FullTimeEmployee extends Employee{
double monthlySalary;
FullTimeEmployee(double monthlySalary){
this.monthlySalary = monthlySalary;
}
@Override
double calculateSalary(){
return monthlySalary;
}
}

class ContractEmployee extends Employee{
int workingDays;
double dailyRate;
ContractEmployee(int workingDays,double dailyRate){
this.workingDays = workingDays;
this.dailyRate = dailyRate;
}
@Override
double calculateSalary(){
return workingDays*dailyRate;}
}
class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
String s = sc.nextLine();
Employee e = new Employee(b,s);
if(a==1){
System.out.println("Employee ID: "+b);
System.out.println("Employee Name: "+s);
double c = sc.nextDouble();
FullTimeEmployee f = new FulltimeEmployee(c);
System.out.println("Salary: "+f.calculateSalary());
}
else{
System.out.println("Employee ID: "+b);
System.out.println("Employee Name: "+s);
int c = sc.nextInt();
double d = sc.nextDouble();
ContractEmployee ce = new ContractEmployee(c,d);
System.out.println("Salary: "+ce.calculateSalary());
}
}
}
