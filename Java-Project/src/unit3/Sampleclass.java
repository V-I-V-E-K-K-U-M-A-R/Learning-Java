package unit3;

import java.util.InputMismatchException;

/* Exception :
 * If a program can handle the situation by itself 
 * error :
 * undefined cannot be stored
 */
public class Sampleclass {

	public static void main(String[] args) {
		try {
    int b =0;
    int a = 100/b;
    System.out.println(a);
	 } catch( InputMismatchException e) {
		 System.out.println(e.getMessage());
	 }
		catch (ArithmeticException e) {
		 System.out.println("hello there");
		 System.out.println(e.getMessage());
	 }
		catch(Exception e) {
			System.out.println(e.getMessage());	 
		 }
		System.out.println("Done!!");
		}
}