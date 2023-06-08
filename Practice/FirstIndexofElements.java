import java.util.Scanner;

class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] =sc.nextInt();
		}

		int x=sc.nextInt();
		int index=firstIndex(arr,x);
		System.out.println(index);
	}
	public static int firstIndex(int[] arr,int x){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==x){
				return i;
			}
		}
		return -1;
	}
}
