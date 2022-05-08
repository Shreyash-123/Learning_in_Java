package Assignment_01;

import java.util.Scanner;

class Caller {
   static int i = 0;
   void call() {
	   i++;
	   if (i == 1)
	   System.out.println("Function Called " + i + " time");
	   else
	   System.out.println("Function Called " + i + " times");
   }
   void display() {
	   if (i == 1)
	   System.out.println("Total Number of Calls to Member Function are -\n" + i + " time");
	   else
	   System.out.println("Total Number of Calls to Member Function are -\n" + i + " times");
   }
}
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ctr = 0;
       System.out.println("How many times would you like to call member function ?");
        ctr = sc.nextInt();
        Caller[] c = new Caller[ctr];
        for (int i = 0; i < ctr; i++) {
        	c[i] = new Caller();
        	c[i].call();
        }
         c[0].display();
        sc.close();
	}

}
