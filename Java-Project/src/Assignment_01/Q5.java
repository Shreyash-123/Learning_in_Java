package Assignment_01;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] ep = new Employee[8];
		String n;
		int a;
		char dep;
		float sal;
		
		for (int i = 0; i < 8; i++) {
			System.out.println("Enter details of Employee "+(i+1));
			System.out.println("Enter name of employee");
			n = sc.next();
			System.out.println("Enter age of employee");
			a = sc.nextInt();
			System.out.println("Enter department of employee");
			dep = sc.next().charAt(0);
			System.out.println("Enter salary of employee");
			sal = sc.nextFloat();
			ep[i] = new Employee(n, a, dep, sal);
		}
        for (int i = 0; i < 8; i++) {
        	ep[i].print();
        }
	}

}
class Employee
{
	String name;
	int age;
	char department;
	float salary;
	  Employee(String n, int a, char dep, float sal) {
		  this.name = n;
		  this.age = a;
		  this.department = dep;
		  this.salary = sal;
		  if (salary > 30000)
			  salary = 25000;
	  }
	  void print() {
		  System.out.println("***   Details of Employee   ***");
		  System.out.println("Name of Employee - "+name);
		  System.out.println("Age of Employee - "+age);
		  System.out.println("Department of Employee - "+department);
		  System.out.println("Salary of Employee - "+salary);
	  }
	  
}
