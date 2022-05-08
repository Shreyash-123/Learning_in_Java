package Assignment_01;

class ClassOne {
	ClassOne(int ctr) {
		System.out.println("Inside Class One with value "+ctr);
	}
}
class ClassTwo extends ClassOne {
    ClassTwo() {    	
    	super(10);
    	System.out.println("Inside Class Two");
    }
    
}
class ClassThree extends ClassTwo {
	ClassThree(int value) {
		System.out.println("Inside Class Three Containing a Single Parameterized Constructor with value is " + value);
	}
	ClassThree() {
		System.out.println("Inside Class Three Containing Default Constructor");
	}
}
public class Q4 {

	public static void main(String[] args) {
		ClassThree obj = new ClassThree(1);
        ClassThree obj1 = new ClassThree();
	}

}
