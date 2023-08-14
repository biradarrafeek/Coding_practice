// Given an array A containing 2*N+2 positive numbers, out of which 2*N numbers exist in pairs whereas the other two number occur exactly once and are distinct. Find the other two numbers. Return in increasing order.

// Example 1:

// Input: 
// N = 2
// arr[] = {1, 2, 3, 2, 1, 4}
// Output:
// 3 4 
// Explanation:
// 3 and 4 occur exactly once.

// Your Task:
// You do not need to read or print anything. Your task is to complete the function singleNumber() which takes the array as input parameter and returns a list of two numbers which occur exactly once in the array. The list must be in ascending order.

// Expected Time Complexity: O(N)
// Expected Space Complexity: O(1)

// Constraints:
// 1 <= length of array <= 106 
// 1 <= Elements in array <= 5 * 106


class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        int n = 0;
        for(int ele : nums){
            n = n^ele;
        }
        int r = n&-n;
        int a = 0;
        int b = 0;
        
        for(int ele : nums){
            if((r&ele) == 0){
                a = a^ele;
            }
            else {
                b = b^ele;
            }
        }
        int[] arr = {a,b};
        Arrays.sort(arr);
        return arr;
    }
}
