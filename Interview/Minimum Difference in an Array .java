import java.util.* ;
import java.io.*; 
public class Solution {
    static int minDiff(int n, int[] arr) {
        // Write your code here.
        Arrays.sort(arr);
        int minAbsDiff = Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            int absDiff = Math.abs(arr[i]-arr[i-1]);
            minAbsDiff = Math.min(minAbsDiff,absDiff);
        }
        return minAbsDiff;
    }
}
