package unit1;

public class P6_Task02_StringInJava {

	public static void main(String[] args) {
		StringInJava obj = new StringInJava();
		obj.StringDefinition();
		obj.charAndString();
	}
}
class StringInJava{
	void StringDefinition(){
		String s = "Hello There";
		String s1 = new String("jkgkgfukuk");
		System.out.println(s);
		//Get length of a string
		System.out.println(s.length());
		//Loop through a string
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		String first = "Vivek";
		String second = "Kumar";
		//add two strings
		String third = first + second;
		System.out.println(third);
		//compare two strings;
		boolean result1 = first.equals(second);
		System.out.println(result1);
		/*
		 * Java Strings are immutable
		 * In java, the JVM maintains a string pool to store all of its strings inside the memory.
		 * The string pool helps in reusing the strings
		 * -If the strings already exists, the new string is not created
		 * Instead, the new reference , example points to the already existing string (Java).
		 * If the String doesn't exist, the new string(Java is creeated)
		 */
		String fourth="Vivek";
		String fifth= new String("Kumar");
	}
	/*
	 * Character array are mutable but string are not
	 */
	void charAndString() {
		char[] ch = {'H','r','t','!','t','o'};
		char[] ch2 = {'!','!'};
		System.out.println(ch);
		
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		String s1 = new String(ch);
		System.out.println(s1);
		
		//Character Arrays are mutable but strings are not
		ch[0]='h';
		//s1.charAt[0]='h';
		
		/*
		 * Join Two Java Strings -'+' can be used to append strings together to form a new string - but not possible in char array
		 */
		s1 = s1 + 'a';//s1 is new object with the memory
		//ch  = ch + ch2;
		//String to char array
		String s2 = "GEEKS";
		char[] ch4 = s2.toCharArray();
		//char array to string
		char[] a2 = {'A','K','A'};
		String s3 = new String(a2);
	}
}