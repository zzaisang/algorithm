package main.java.algorithm.leetcode.easy;

import java.util.Stack;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021-02-21
 */
public class ValidParentheses {

    /**
     * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     *
     * An input string is valid if:
     *
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     *
     * Example 1:
     *
     * Input: s = "()"
     * Output: true
     * Example 2:
     *
     * Input: s = "()[]{}"
     * Output: true
     * Example 3:
     *
     * Input: s = "(]"
     * Output: false
     * Example 4:
     *
     * Input: s = "([)]"
     * Output: false
     * Example 5:
     *
     * Input: s = "{[]}"
     * Output: true
     *
     * */

    public static void main(String[] args) {
        String s = "[()(){}[]";

        System.out.println(sol1(s));

    }

    // stack 을 활용해서 해결!
    public static boolean sol1(String s){
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if( c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();

    }

}
