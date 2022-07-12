package Assignment_02;

import java.util.Scanner;

public class Q_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
        String str = sc.nextLine(), str2 = "";
        System.out.println("String after removing duplicates is ");
        for (int i = 0; i < str.length(); i++) {
            boolean exist = false;        	
        	for (int j = 0; j < i; j++) {        		
        		if (str.charAt(i) == str.charAt(j)) {
        			exist = true;
        			break;
        		}
        	}
            if (!exist)
        		str2 += str.charAt(i);
        }
        System.out.println(str2);
        sc.close();
	}

}
