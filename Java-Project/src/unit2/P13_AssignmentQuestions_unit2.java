package unit2;

public class P13_AssignmentQuestions_unit2 {

	public static void main(String[] args) {
		
		AssignmentQuestions_unit2 obj = new AssignmentQuestions_unit2();
		
		obj.abstractClassCall();
		obj.overloadingAndOverriding();
		obj.accessProtectionInJava();
		obj.interfaceImplementation();
		
	}

}

class AssignmentQuestions_unit2{
	void abstractClassCall() {
		Sample3 obj = new Sample3();
		obj.run();
	}
	void overloadingAndOverriding() {
		Sample3 obj = new Sample3();
		obj.run();
		obj.run(1);
		obj.run(1,2);
		
		obj.display();
	}
	void accessProtectionInJava() {
		Sample3 obj = new Sample3();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		
		obj.showData();
		obj.display();
	}
	void interfaceImplementation() {
		Sample3 obj = new Sample3();
		obj.display1();
		obj.display2();
}
}
abstract class Sample2{
	int a = 10;
	public int b = 20;
	protected int c = 30;
	private int d = 40;
	
	void showData() {
		System.out.println("Inside Sample2 ParentClass");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
	}

public void display() {
	System.out.println("This is a display method inside abstract class Sample2!");
	
}
abstract public void run();
}
class Sample3 extends Sample2 implements A3, B3{
	
	public void display() {
		System.out.println("Inside ChildClass");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
	}
	public void display1() {
		System.out.println("This is a display method from interface A3..!");
	}
	
	public void display2() {
		System.out.println("This is a display from interface B3..!");
		
	}
	public void run() {
		System.out.println("This is a run method from abstract class Sample 2..!");
	}
	public void run(int x) {
		System.out.println("This is a run overloaded method in Sample 3..!");
	}
	
	public void run(int x, int y) {
		System.out.println("This is a run overloaded method in Sample 3..! ");
	}
}
interface A3{
	public void display1();
}
interface B3{
	public void  display2();
}
}