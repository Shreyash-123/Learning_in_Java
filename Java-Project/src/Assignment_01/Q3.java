package Assignment_01;

import java.util.Scanner;

class in1 {
	void display(int num) {
		if (num == 1) {
			System.out.println("It is not a prime number");
			return;
		}
		if (num != 2 && num % 2 == 0) {
			System.out.println("It is not a prime number");
		}
		for (int i = 3; i * i <= num; i+=2) {
              if (num % i == 0) {
            	  System.out.println("It is not a Prime Number");
            	  return;
              }
		}
		System.out.println("It is a prime number");
	}
}
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ctr = 0, num = 0;
		System.out.println("Total Numbers you would like to Enter - ");
        ctr = sc.nextInt();
        in1[] val = new in1[ctr];
        for (int i = 0; i < ctr; i++) {
        	val[i] = new in1();
        	System.out.println("Enter " + (i + 1) + " number");
        	num = sc.nextInt();
        	val[i].display(num);
        }
        sc.close();
	}

}
