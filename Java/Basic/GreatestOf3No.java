package Day1;

import java.util.Scanner;

public class GreatestOf3No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
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
