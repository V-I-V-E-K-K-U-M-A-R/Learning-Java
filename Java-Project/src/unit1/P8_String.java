package unit1;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		int r,sum=0,temp;    
		  int n=75457;//It is the number variable to be checked for palindrome  

		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("Yes it is palindrome ");    
		  else    
		   System.out.println("No it is not a palindrome"); 

	}

	void reverseOfAString(String s) {
		// declaring variable

				String stringinput = "Independent";

				        // convert String to character array

				        // by using toCharArray

				        char[] resultarray = stringinput.toCharArray();

				        //iteration

				        for (int i = resultarray.length - 1; i >= 0; i--)

				         // print reversed String

				            System.out.print(resultarray[i]);
	}
	
	void stringEqualOrNot(String s1,String s2) {
		Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;

        String s11 = new String("Vivek");
        String s21 = new String("Vivek");

        System.out.println(t1 == t3);
        System.out.println(t1 == t2);
        System.out.println(s11 == s21);

        System.out.println(t1.equals(t2));
        System.out.println(s11.equals(s21));		
	}
}