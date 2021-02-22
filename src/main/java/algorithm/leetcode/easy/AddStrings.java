package main.java.algorithm.leetcode.easy;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 21. 2. 22.
 */
public class AddStrings {

    /**
     * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
     *
     * Note:
     *
     * The length of both num1 and num2 is < 5100.
     * Both num1 and num2 contains only digits 0-9.
     * Both num1 and num2 does not contain any leading zero.
     * You must not use any built-in BigInteger library or convert the inputs to integer directly.
     *
     * */

    public static void main(String[] args) {

        final AddStrings addStrings = new AddStrings();

        System.out.println(addStrings.sol1("0","-9"));
        System.out.println(addStrings.sol1("10","-9"));
        System.out.println(addStrings.sol1("29","99"));
        System.out.println(addStrings.sol1("-10","-9"));
        System.out.println(addStrings.sol1("-1000","2"));
        System.out.println(addStrings.sol1("-1000","1000"));

    }

    public String sol1(String num1, String num2){
        int i = num1.length() - 1, j = num2.length() - 1;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0)
                sum += num1.charAt(i--) - '0';
            if (j >= 0)
                sum += num2.charAt(j--) - '0';
            carry = sum / 10;
            res.append(sum % 10);

        }
        if (carry != 0) {
            res.append(carry);
        }
        return res.reverse().toString();
    }


}
