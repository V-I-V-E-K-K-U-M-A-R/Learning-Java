package assignment_01;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Arthmetic obj = new Arthmetic();
		Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        
        a = (a>b)?obj.add(a,b):obj.sub(a,b);
	}
}

class Arthmetic{
	int add(int a,int b) {
		return a+b;
	}
	int sub(int a,int b) {
		int res = a-b;
		if(res<0) {
			return 0;
		}
		return res;
	}
}