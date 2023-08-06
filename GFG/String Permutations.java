// Given a string S. The task is to find all permutations (need not be different) of a given string.

// Example 1:

// Input:
// S = AAA
// Output: AAA AAA AAA AAA AAA AAA
// Explanation: There are total 6 permutations, as given in the output.

// Your Task:
// This is a function problem. You only need to complete the function permutation that takes S as parameter and returns the list of permutations in lexicographically increasing order. The newline is automatically added by driver code.

// Constraints:
// 1 ≤ size of string ≤ 5

// Expected Time Complexity: O(N * N!), N = length of string.
// Expected Auxiliary Space: O(1)

class Solution
{
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        ArrayList<String> list = new ArrayList<>();
        solve(S,"",list);
        Collections.sort(list);
        return list;
    }
	   static void solve(String str,String ans,ArrayList<String> list){
	       if(str.length()==0){
	           list.add(ans);
	           return;
	       }
	       for(int i=0;i<str.length();i++){
	           char c = str.charAt(i);
	           String s1 = str.substring(0,i)+str.substring(i+1);
	           solve(s1,ans+c,list);
	       }
	   }
}
