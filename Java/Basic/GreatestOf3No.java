package Day1;

import java.util.Scanner;

public class GreatestOf3No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=30;
		
		if(a>=b && a>=c) {
			System.out.println(a);
		}
		else if(b>=a && b>=c) {
			System.out.println(b);
		}
		else if(c>=a && c>=b) {
			System.out.println(c);
		}
	}
}
