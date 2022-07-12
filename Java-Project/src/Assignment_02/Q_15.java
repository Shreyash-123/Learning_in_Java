package Assignment_02;

import java.util.Scanner;

public class Q_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array");
        int n = sc.nextInt(), k, l;
        int[] arr = new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++)
        	arr[i] = sc.nextInt();
        System.out.println("Enter values of K and L");
        k = sc.nextInt();
        l = sc.nextInt();
        k = k % n; // if k > n
        l = l % n; // if l > n
        rightRotate(arr, n, k);
        leftRotate(arr, n, l);
        System.out.println("Array after rotation is -");
        for (int element : arr)
        	System.out.print(element + " ");
        sc.close();
	}
	
    static void rev(int arr[], int start, int end) {
    	for (int i = 0; i < end / 2; i++) {
    		int temp = arr[start];
    		arr[start] = arr[end - 1 - start];
    		arr[end - 1 - start] = temp;
    		start++;
    	}
    }
    
    static void leftRotate(int arr[], int n, int k) {
    	rev(arr, 0, n);
    	rev(arr, 0, n - k);
    	for (int i = 0; i < k/2; i++) {
    		int temp = arr[n - k + i];
    		arr[n - k + i] = arr[n - 1 - i];
    		arr[n - 1 - i] = temp;
    	}
    }
    
    static void rightRotate(int arr[], int n, int k) {
    	rev(arr, 0, n);
    	rev(arr, 0, k);
    	for (int i = 0; i < (n - k)/2; i++) {
    		int temp = arr[k + i];
    		arr[k + i] = arr[n - 1 - i];
    		arr[n - 1 - i] = temp;
    	}
    }
}
