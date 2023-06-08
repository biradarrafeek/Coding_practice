import java.util.Scanner;

class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		//create an array size n
		int[] arr = new int[n];

		//Read elements of the array
		for(int i=0;i<n;i++){
			arr[i] =sc.nextInt();
		}

		int x=sc.nextInt();
		int index=LastIndex(arr,x);
		System.out.println(index);
	}
	public static int LastIndex(int[] arr,int x){
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i]==x){
				return i;
			}
		}
		return -1;
	}
}
