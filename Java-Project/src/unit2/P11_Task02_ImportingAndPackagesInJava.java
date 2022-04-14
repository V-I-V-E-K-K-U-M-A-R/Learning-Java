package unit2;
/*
 * A java package is a group of similar types of classes, interfaces and sub-packages
 * -Package can be caregorized into two parts
 * -Built in package {lang, owt, javax, swing, net, io, util, sql}
 * -User defined package
 * 
 *   -Package also helps to avoid class name collision
 *   -Package also helps us to maintain access protection in java
 *   Packages are named in reverses order of domain names
 *   -unit1.javaproject.com --> "com.javaproject.unit1"
 *   
 *   import java.util.vector; // import the vector class from util package
 *   import java.util.*; // import all the classes from util package
 *   
 *   Static imports :
 *   -Static import is a feature introduced in Java programming language { version 5 and above
 *   that allows members { fields and methods} defined in a class as public static
 *   , to be used in java code without specifying the class in which the field is defined
 */
import static java.lang.System.*;
import static java.lang.Math.*;

import unit1.SampleClass1;
public class P11_Task02_ImportingAndPackagesInJava {

	public static void main(String[] args) {
	out.println("Welcome to Package");
	
	out.println(sqrt(4));
	System.out.println(pow(2,2));
	System.out.println(abs(6.3));
	
	SampleClass1 obj = new SampleClass1();
	System.out.println(obj.a);
	}

}
