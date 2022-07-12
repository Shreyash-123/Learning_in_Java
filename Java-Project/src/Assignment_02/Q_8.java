package Assignment_02;

class Thread1 extends Thread {
    int run(int data) {     	
    	return data + 10;
    }
}

public class Q_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 10;
        Thread1 t1 = new Thread1();
        t1.start(); 
	}

}
