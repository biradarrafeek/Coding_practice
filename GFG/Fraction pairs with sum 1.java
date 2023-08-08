// Given a list of N fractions, represented as two lists numerator and denominator, the task is to determine the count of pairs of fractions whose sum equals 1.

// Example 1:

// Input:
// N = 4
// numerator = [1, 2, 2, 8]
// denominator = [2, 4, 6, 12]
// Output:
// 2
// Explanation:
// Fractions 1/2 and 2/4 sum to 1. Similarly fractions 2/6 and 8/12 sum to 1. So there are 2 pairs of fractions which sum to 1.

// Your task:
// You don't need to read input or print anything. Your task is to complete the function countFractions() which take integer N and arrays numerator and denominator of size N as arguments, and returns an integer.

// Expected Time Complexity: O(N*log(N))
// Expected Auxiliary Space: O(N)

// Constraints:
// 1 <= N <=105
// 1 <= numerator[i] <= denominator[i] <= 109




class Solution {
    public static int countFractions(int n, int[] numerator, int[] denominator) {
        // code here
        int count = 0;
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            int k = gcd(numerator[i],denominator[i]);
            int num = numerator[i]/k;
            int den = denominator[i]/k;
            
            String a = num + "/"+den;
            String d = den-num +"/"+den;
            
            if(map.containsKey(d)){
                count = count+map.get(d);
            }
            int x = map.getOrDefault(a,0)+1;
            map.put(a,x);
        }
        return count;
    }
    static int gcd(int a,int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
}
        
