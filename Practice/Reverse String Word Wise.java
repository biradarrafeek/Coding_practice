import java.util.Scanner;

class Solution {

    static String reverseStringWordWise(String input) {
        // Write your code here
        String[] word=input.split(" ");
        StringBuilder sb= new StringBuilder();

        for(int i=word.length-1;i>=0;i--){
            sb.append(word[i]);

            if(i>0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}
