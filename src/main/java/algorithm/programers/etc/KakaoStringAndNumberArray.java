package main.java.algorithm.programers.etc;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/11/27
 */
public class KakaoStringAndNumberArray {

    public static void main(String[] args) {

        String s = "one4seveneight";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        String[] numberToWords = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < numberToWords.length; i++) {
            s = s.replaceAll(numberToWords[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }

}
