import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc= new Scanner(System.in);
		int principal =sc.nextInt();
		double rate=sc.nextDouble();
		int time=sc.nextInt();
		double interest=(principal*rate*time)/100;
		int simpleinterest =(int) Math.floor(interest);
		System.out.println(simpleinterest);
	}
}
