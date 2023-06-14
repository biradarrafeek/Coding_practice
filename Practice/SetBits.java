import java.util.* ;
import java.io.*; 
public class Solution {
	public static int countSetBits(int n) {
		// Write your code here.
		int count=0;
		int binary=Integer.parseInt(Integer.toBinaryString(n));

		while(!(binary<=0)){
			int extracted=binary%10;

			if(extracted/1==1){
				count+=1;
			}
			binary=binary/10;
		}
		return count;
	}
}
