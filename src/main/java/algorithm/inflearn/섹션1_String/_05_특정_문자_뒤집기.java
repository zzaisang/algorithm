package main.java.algorithm.inflearn.섹션1_String;

import java.util.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/05
 */
public class _05_특정_문자_뒤집기 {

    public static void main(String[] args) {
        final _05_특정_문자_뒤집기 T = new _05_특정_문자_뒤집기();
        Scanner in = new Scanner(System.in);
        final String str = in.next();
        System.out.println(T.sol(str));
    }
    public String sol(String str){
        char[] charArray = str.toCharArray();
        int lt = 0, rt = charArray.length - 1;
        while (lt < rt){
            if(!Character.isAlphabetic(charArray[lt])){
                lt++;
            }else if (!Character.isAlphabetic(charArray[rt])){
                rt--;
            }else {
                char temp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = temp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(charArray);
    }

}
