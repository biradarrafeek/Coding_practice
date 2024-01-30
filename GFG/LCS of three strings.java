// Given 3 strings A, B and C, the task is to find the length of the longest sub-sequence that is common in all the three given strings.

// Example 1:

// Input:
// A = "geeks"
// B = "geeksfor", 
// C = "geeksforgeeks"
// Output: 5
// Explanation: 
// "geeks"is the longest common
// subsequence with length 5.

//   Your Task:
// You don't need to read input or print anything. Your task is to complete the function LCSof3() which takes the strings A, B, C and their lengths n1, n2, n3 as input and returns the length of the longest common subsequence in all the 3 strings.

// Expected Time Complexity: O(n1*n2*n3).
// Expected Auxiliary Space: O(n1*n2*n3).

// Constraints:
// 1 <= n1, n2, n3 <= 20
// Elements of the strings consitutes only of the lower case english alphabets.


  class Solution 
{ 
    static int help(String A,String B,String C,int i,int j,int k,int n1,int n2,int n3,int dp[][][]){
        if(i==n1 || j==n2 || k==n3) return 0;
        if(dp[i][j][k]!=-1) return dp[i][j][k];
        if(A.charAt(i)==B.charAt(j) && A.charAt(i)==C.charAt(k)){
            return dp[i][j][k]=1+help(A,B,C,i+1,j+1,k+1,n1,n2,n3,dp);
        };
        int a = help(A,B,C,i+1,j,k,n1,n2,n3,dp);
        int b = help(A,B,C,i,j+1,k,n1,n2,n3,dp);
        int c = help(A,B,C,i,j,k+1,n1,n2,n3,dp);
        return dp[i][j][k] = Math.max(a,Math.max(b,c));
    }
    int LCSof3(String A, String B, String C, int n1, int n2, int n3) 
    { 
        // code here
        int dp[][][] = new int[n1][n2][n3];
        for(int temp[][]:dp){
            for(int temp2[]:temp){
                Arrays.fill(temp2,-1);
            }
        }
        return help(A,B,C,0,0,0,n1,n2,n3,dp);
    }
}
