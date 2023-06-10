import java.util.* ;
import java.io.*; 
import java.util.Scanner;

class Solution {

    static String reverseEachWord(String input)
    {
        // Write your code here
        String[] words = input.split(" ");
        StringBuilder rev = new StringBuilder();

        for(String word:words){
            String reversed = reversed(word);
            rev.append(reversed).append(" ");
        }
        return rev.toString().trim();
    }
    private static String reversed(String word){
        StringBuilder reversed = new StringBuilder();
        for(int i=word.length()-1;i>=0;i--){
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseEachWord(input);
        System.out.println(ans);
    }
}
