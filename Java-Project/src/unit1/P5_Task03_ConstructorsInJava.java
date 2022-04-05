package unit1;

/*
 * It is called when instance of class is created
 * At the time of calling the Constructor, memory for object is allocated in the memory
 * It is a special type of method which is used to initialise object
 * Everytime an object is created using the new() keyword, at least one constructor is called
 * Two types of Constructors in Java
 *    -Parameterized Constructor
 *    -Default Constructor
 */
public class P5_Task03_ConstructorsInJava {

	public static void main(String[] args) {
		ABC4 obj = new ABC4();
		ABC4 obj1 = new ABC4(1);
		System.out.println(obj.a);
		System.out.println(obj1.a);

	}
}
class ABC4 {
	int a;
	/*
	 * className(Constructor Parameter){
	 * All the class and Instance variables can be Initialised here;
	 * }
	 */
	ABC4(){
		a = 10;
	}
	ABC4(int a){
		this.a = a;
	}
	void display() {
		int b = 10;
		System.out.println(a);
		System.out.println(b);
	}
	int display2() {
		System.out.println(a);
		//As a was a total variable so we can not access it outside the method
		//System.out.println(b);
		return a;
	}
}