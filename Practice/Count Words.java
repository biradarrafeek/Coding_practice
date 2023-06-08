import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class Solution {
	
   public static int  countWords(String str) {
        // Write your code here
        int output=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
                output++;
        }
        return output;
    }
    
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int output = countWords(str);
        System.out.print(output);
    }
}
