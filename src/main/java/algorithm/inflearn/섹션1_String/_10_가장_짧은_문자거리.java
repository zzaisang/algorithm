package main.java.algorithm.inflearn.섹션1_String;

import java.util.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/06
 */
public class _10_가장_짧은_문자거리 {

    public static void main(String[] args) {
        _10_가장_짧은_문자거리 T = new _10_가장_짧은_문자거리();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);
        for (Integer integer : T.solution(str, t)) {
            System.out.print(integer + " ");
        }
    }

    public int[] solution(String str, char t) {
        int[] lenArr = new int[str.length()];
        int p = 1000;
        char[] charArray = str.toCharArray();
        for(int i = 0; i < str.length(); i++){
            if(charArray[i] == t){
                p = 0;
                lenArr[i] = p;
            }else {
                lenArr[i] = ++p;
            }
        }

        p = 1000;
        for (int i = str.length() - 1; i >= 0; i--){
            if (charArray[i] == t){
                p = 0;
            }else {
                lenArr[i] = Math.min(lenArr[i],++p);
            }
        }

        return lenArr;
    }

}