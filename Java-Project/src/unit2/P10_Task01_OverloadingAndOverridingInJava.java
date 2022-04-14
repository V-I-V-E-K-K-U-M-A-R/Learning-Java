package unit2;

public class P10_Task01_OverloadingAndOverridingInJava {

	public static void main(String[] args) {
		OverloadingAndOverridingInJava obj = new OverloadingAndOverridingInJava();
		
		System.out.println("Add with 2 parameters :");
		System.out.println(obj.add(4,6));
		
		System.out.println("Add with 3 parameters :");
		System.out.println(obj.add(4,6,7));
		
		InheritFirstOne obj2 = new InheritFirstOne();
		System.out.println(obj2.add(1,2));
		//System.out.println(obj2.add(1,2,3));
	}

}
class OverloadingAndOverridingInJava {
	
	//Within the same classes : Method Overloading
	int add(int a,int b) {
		System.out.println("Inside , OverloadingAndOverridingInJava : ");
		return a+b;
	}
	int add(int a,int b,int c) {
		System.out.println("Inside, OverloadingAndOverridingInJava : ");
		return a+b+c;
	}
}

//Overriding in Java : Required Inheritance;
class InheritFirstOne extends OverloadingAndOverridingInJava {
	int add(int a,int b) {
		System.out.println("Inside, InheritFirstOne : ");
		return a+b+1;
	}
	int add(int a,int b,int c) {
		System.out.println("Inside, OverloadingAndOverridingInJava : ");
		return a+b+c;
	}
}