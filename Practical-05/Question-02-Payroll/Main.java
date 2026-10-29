abstract class Employee { String name,id; Employee(String name,String id){this.name=name;this.id=id;} abstract double monthlySalary(); }
class FullTime extends Employee { double salary; FullTime(String n,String id,double s){super(n,id);salary=s;} double monthlySalary(){return salary;} }
class PartTime extends Employee { int hours; double rate; PartTime(String n,String id,int h,double r){super(n,id);hours=h;rate=r;} double monthlySalary(){return hours*rate;} }
class Intern extends Employee { double stipend; Intern(String n,String id,double s){super(n,id);stipend=s;} double monthlySalary(){return stipend;} }
public class Main { public static void main(String[] args){Employee[] staff={new FullTime("Asha","E1",50000),new PartTime("Jay","E2",40,300),new Intern("Mira","E3",8000)};double total=0;for(Employee e:staff){double s=e.monthlySalary();System.out.println(e.name+" ("+e.id+"): "+s+(e instanceof Intern?" - Intern":""));total+=s;}System.out.println("Total payroll: "+total);} }
