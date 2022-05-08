package unit1;

import java.util.Scanner;

/*When users take input from console :
 * 
 * nextline()      Read user input [To read strings]
 * next()          Read next token from the input entered by the user
 * nextBoolean()   Read a boolean value from the user
 * nextByte()      Reads a Byte value from the user
 * nextDouble()    Reads a Double value from the user
 * nextFloat()     Reads a float value from the user
 * nextInt()       Reads a Int value from the user
 * nextLine()      Reads a string value from the user
 * nextLong()      Reads a Long value from the user
 * nextShort()     Reads a Short value from the user
 */

public class P4_Task03_ScannerClassInJava {

	public static void main(String[] args) {
		
		Scanner myobj1 = new Scanner(System.in); //Create a Scanner object
		Scanner myobj2 = new Scanner(System.in);
		
		//Read the First Token(Space bar)
		String firstname = myobj1.next();
		System.out.println("Name is : " + firstname + "\n");
		
		String name = myobj2.nextLine();//(\n)
        String name2 = myobj2.nextLine();//(\n)
		
		System.out.println("Name is : " + name + "\n");
		System.out.println("Name is : " + name2 + "\n");
		
		boolean b = myobj2.nextBoolean();
		System.out.println(b + "\n");
		
		myobj1.close();
		myobj2.close();

	}

}