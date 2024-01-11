// This method takes a string S and an integer K as parameters and returns a string.

// Here's a breakdown of the code's functionality:

// It first checks if the length of the string S is equal to the value of K. If true, it returns "0" as all the digits can be removed.
// It utilizes a Stack data structure to efficiently process the digits in the input string.
// It iterates through each character in the input string S and performs the following steps: a. While the stack is not empty, and K is greater than 0, and the top element of the stack is greater than the current digit, it pops elements from the stack and decrements K. This ensures that the digits in the stack are in increasing order from left to right. b. It then pushes the current digit onto the stack.
// After processing all the digits, it handles the case where there are still removals left. It pops digits from the stack to ensure the exact number of removals is performed.
// It constructs the resulting string by appending characters popped from the stack to a StringBuilder in reverse order.
// After constructing the result, it removes any leading '0's from the answer string.
// Finally, it returns the resulting string.



class Solution {
    public String removeKdigits(String S, int K) {
        // code here
        int n = S.length();
        if (K == n) {
            return "0";
        }
        Stack<Character> st = new Stack<>();
        for (char digit : S.toCharArray()) {
            while (!st.empty() && K > 0 && st.peek() > digit) {
                st.pop();
                K--;
            }
            st.push(digit);
        }
        while (K > 0) {
            st.pop();
            K--;
        }
        StringBuilder ans = new StringBuilder();
        while (!st.empty()) {
            ans.append(st.pop());
        }
        ans.reverse();
        int len = ans.length();
        int startIndex = len;
        for (int i = 0; i < len; i++) {
            if (ans.charAt(i) != '0') {
                startIndex = i;
                break;
            }
        }
        ans = (startIndex == len) ? new StringBuilder("0") : new StringBuilder(ans.substring(startIndex));
        return ans.toString();
    }
}
