package unit1;

/*
 * The wrapper class in Java provides the mechanism to convert primitive into objects and why?
 * Because we wan to use predefined method of those objects
 *  -boolean data types --> Boolean obj; --> obj.toString();
 */

public class P4_Task02_WrapperClassesInJava {

	public static void main(String[] args) {
		
		//Converting int into Integer
		int a = 20;
		
		String s = ""+ a +"";
		
		Integer i = Integer.valueOf(a); //Converting int into Integer Explicitly
		Integer j = a; //autoboxing, now the compiler will write the Integer.valueOf(a) internally
		
		System.out.println(a + " " + i + " " + j);
		
		System.out.println(i.toString());
		
		//a.toString() cannot be done due to a is int not an object
		
		//Autoboxing converts primitives into objects
		byte b = 10;
		Byte byteobj=b;
		
		System.out.println(byteobj);
		
		//Unboxing  : Converting objects to primitives
		byte bytevalue=byteobj;
		System.out.println(bytevalue);
	}

}
