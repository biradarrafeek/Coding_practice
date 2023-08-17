class Solution{
    
    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for(int i=0;i<sizeOfArray;i++){
            //Finding max value
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }
            //Finding second max value
            else if(arr[i]>secondMax && arr[i]<max){
                secondMax = arr[i];
            }
        }
        //if no second max in the array then print -1 otherwise add second max
        ans.add(max);
        if(secondMax != Integer.MIN_VALUE){
            ans.add(secondMax);
        }
        else{
            ans.add(-1);
        }
        return ans;
    }
}
