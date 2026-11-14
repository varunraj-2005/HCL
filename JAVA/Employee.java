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
FullTimeEmployee(int e, String s, double monthlySalary){
  super(e,s);
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
ContractEmployee(int e, String s, int workingDays,double dailyRate){
super(e,s);
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
if(a==1){
System.out.println("Employee ID: "+b);
System.out.println("Employee Name: "+s);
double c = sc.nextDouble();
FullTimeEmployee f = new FulltimeEmployee(b,s,c);
System.out.println("Salary: "+f.calculateSalary());
}
else{
System.out.println("Employee ID: "+b);
System.out.println("Employee Name: "+s);
int c = sc.nextInt();
double d = sc.nextDouble();
ContractEmployee ce = new ContractEmployee(b,s,c,d);
System.out.println("Salary: "+ce.calculateSalary());
}
}
}
