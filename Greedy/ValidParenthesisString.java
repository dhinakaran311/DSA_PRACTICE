import java.util.*;
// Leetcode 678. Valid Parenthesis String
public class ValidParenthesisString {

    public static boolean checkValidString(String s) {
        int minO = 0, maxO = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                minO++;
                maxO++;
            } else if (ch == ')') {
                minO--;
                maxO--;
            } else {
                minO--;
                maxO++;
            }
            if (minO < 0) minO = 0;
            if (maxO < 0) return false;
        }
        return minO == 0;
    }

    public static void main(String[] args) {
        String[] tc = {
            "()",
            "(*)",
            "(*))",
            "((*)",
            "())*"
        };

        for (int i = 0; i < tc.length; i++) {
            System.out.println("Test " + (i + 1) + ": " + checkValidString(tc[i]));
        }
    }
}
