import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
	public static int minValue(ArrayList<Integer> arr, int n, int k)
	{
		// Write your code here.
		Collections.sort(arr);
		int min = Integer.MAX_VALUE;
		for(int i=0;i<=n-k;i++){
			int diff=arr.get(i+k-1)-arr.get(i);
			if(diff<min){
				min=diff;
			}
		}
		return min;
	}
}
