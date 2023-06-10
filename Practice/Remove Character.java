import java.util.* ;
import java.io.*; 
import java.util.Scanner;

class Solution {

    static String removeAllOccurrencesOfChar(String input, char c) {
        // Write your code here
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<input.length();i++){
            char cur = input.charAt(i);
            if(cur!=c){
                sb.append(cur);
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char c = sc.next().charAt(0);
        String ans = removeAllOccurrencesOfChar(input, c);
        System.out.println(ans);
    }
}
