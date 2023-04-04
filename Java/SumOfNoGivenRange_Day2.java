package Number;

import java.util.Scanner;

public class SumOfNoGivenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int sum=0;
		
		for(int i=a;i<=b;i++) {
			sum+=i;
		}
		System.out.println("The sum of Given Range: "+sum);
	}
}
