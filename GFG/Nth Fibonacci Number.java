// Given a positive integer n, find the nth fibonacci number. Since the answer can be very large, return the answer modulo 1000000007.

// Example 1:

// Input: 
// n = 2
// Output: 
// 1 
// Explanation: 
// 1 is the 2nd number of fibonacci series.

// Your Task:  
// You dont need to read input or print anything. Complete the function nthFibonacci() which takes n as input parameter and returns nth fibonacci number.

// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(n)

// Constraints:
// 1<= n <=105


class Solution {
    static int nthFibonacci(int n){
        int mod = 1000000007;
        int first_number = 0;
        int second_number = 1;
        int next_number = first_number + second_number;
        
        for(int i = 2;i<=n;i++){
            next_number = (first_number + second_number)%mod;
            first_number = second_number;
            second_number = next_number;
        }
        return next_number;
    }
}
