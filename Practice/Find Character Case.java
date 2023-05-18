import java.util.*;
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		//  int ans;



		if(ch>='A'&& ch<='Z'){
			System.out.println("1");
		}
		else if(ch>='a'&& ch<='z'){
			System.out.println("0");
		}
		else{
			System.out.println("-1");
		}



		// if(Character.isUpperCase(ch)){
		// 	ans= 1;
		// }
		// else if(Character.isLowerCase(ch)){
		// 	ans= 0;
		// }
		// else{
		// 	ans= -1;
		// }
		// System.out.println(ans);
	}
}
