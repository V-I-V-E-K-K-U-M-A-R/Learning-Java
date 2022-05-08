package unit2;
/*
 * An interface is a completely(100%) "abstract class",
 * that is used to group related methods with empty bodies
 * 
 * Need of interface?
 * multiple interface can be implemented at the same time in one class?
 * 
 * Can an inteface extends another interface?
 */

//Interface (100% Abstract class)
interface animal {
	public void animalsound(); //Interface method does not have a body
	public void run();         //Interface method does not have a body
}
//Interface
interface human{
	public void humansound(); //Interface method does not have a body
	public void run1();       //Interface method does not have a body
}

public class P12_Task01_InterfaceInJava {

	public static void main(String[] args) {
		C1 obj = new C1();
		obj.funcA();
		obj.funcB();
		species nigga=new species();
		nigga.run1();
	}
	/*public void animalsound() {
		
	}
	public void run() {
		
	}*/
}
//Multiple interfaces can be implemented at the same time
class species implements animal, human{
	public void animalsound() {
		System.out.println("We are inside animalsound method");
	}
	public void run() {
		System.out.println("We are inside the run method");
	}
	public void humansound() {
		System.out.println("We are inside the humansound method");
	}
	public void run1() {
		System.out.println("We are inside the run1 method");
	}
}
interface A1 {
	void funcA();
}
interface B1 extends A1 {
	void funcB();
}
class C1 implements B1 {
	public void funcA() {
		System.out.println("This is funcA from A1");
	}
	public void funcB() {
		System.out.println("This is func from A2");
	}
}