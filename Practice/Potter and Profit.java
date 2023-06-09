import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static int getMaxProfit(ArrayList<Integer> time, ArrayList<Integer> profit, int n, int k) {
        // Write your code here.
        int[][] pp=new int[n+1][k+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=k;j++){
                if(i==0 || j==0){
                    pp[i][j]=0;
                }
                else if(time.get(i-1)<=j){
                    pp[i][j]=Math.max(pp[i-1][j],pp[i-1][j-time.get(i-1)]+profit.get(i-1));
                }
                else {
                    pp[i][j]=pp[i-1][j];
                }
            }
        }
        return pp[n][k];
    }
}
