package Assignment_01;

import java.util.Scanner;

class Student {
	String name;
	int age;
	char section;
	float percentage;
	static int i = 1;
	static float average = 0.0f;
	Student(String Name, int Age, char Section, float Percentage) {
		this.name = Name;
		this.age = Age;
		this.section = Section;
		this.percentage = Percentage;
		average += percentage;
	}
	void display() {
		System.out.println("***   Details of Student " + i + "   ***");
		System.out.println("Name of Student is "+name);
		System.out.println("Age of Student is "+age);
		System.out.println("Section of Student is "+section);
		System.out.println("Percentage of Student is "+percentage);
		System.out.println("*****************************************");
		i++;
	}
	void average(int n) {
		System.out.println("Average of class is "+average / n);
	}
}

public class Q1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Number of Students in Class");
		int ctr = sc.nextInt();
		Student[] s = new Student[ctr];
		for (int i = 0; i < ctr; i++) {
			System.out.println("***   Enter Details of Student "+(i+1)+" -    ***");
			System.out.println("Enter Full Name of Student");
			String n = sc.next();
			System.out.println("Enter Age of Student");
			int a = sc.nextInt();
			System.out.println("Enter Section of Student");
			char sec = sc.next().charAt(0);
			System.out.println("Enter Percentage of Student");
			float per = sc.nextFloat();
			System.out.println("***************************");
			s[i] = new Student(n, a, sec, per);
			
		}
		for (int i = 0; i < ctr; i++) {
			s[i].display();
		}
		sc.close();
		s[0].average(ctr);
	}
	
}