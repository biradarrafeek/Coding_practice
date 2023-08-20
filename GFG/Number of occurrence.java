// Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.

// Example 1:

// Input:
// N = 7, X = 2
// Arr[] = {1, 1, 2, 2, 2, 2, 3}
// Output: 4
// Explanation: 2 occurs 4 times in the
// given array.

// Example 2:

// Input:
// N = 7, X = 4
// Arr[] = {1, 1, 2, 2, 2, 2, 3}
// Output: 0
// Explanation: 4 is not present in the
// given array.

// Your Task:
// You don't need to read input or print anything. Your task is to complete the function count() which takes the array of integers arr, n, and x as parameters and returns an integer denoting the answer.
// If x is not present in the array (arr) then return 0.

// Expected Time Complexity: O(logN)
// Expected Auxiliary Space: O(1)Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.

// Example 1:

// Input:
// N = 7, X = 2
// Arr[] = {1, 1, 2, 2, 2, 2, 3}
// Output: 4
// Explanation: 2 occurs 4 times in the
// given array.

// Example 2:

// Input:
// N = 7, X = 4
// Arr[] = {1, 1, 2, 2, 2, 2, 3}
// Output: 0
// Explanation: 4 is not present in the
// given array.

// Your Task:
// You don't need to read input or print anything. Your task is to complete the function count() which takes the array of integers arr, n, and x as parameters and returns an integer denoting the answer.
// If x is not present in the array (arr) then return 0.

// Expected Time Complexity: O(logN)
// Expected Auxiliary Space: O(1)




class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int left_index = FindFirstIndex(arr,0,n-1,x);
        int right_index = FindLastIndex(arr,0,n-1,x);
        
        return right_index - left_index;
    }
    int FindFirstIndex(int[] arr,int l,int r,int x){
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]>=x) r= mid-1;
            else l = mid+1;
        }
        return r;
    }
    int FindLastIndex(int[] arr,int l,int r,int x){
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]<=x) l = mid+1;
            else r = mid-1;
        }
        return r;
    }
}
