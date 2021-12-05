package main.java.algorithm.inflearn.섹션1_String;

import java.util.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/05
 */
public class _04_단어_뒤집기 {

    public static void main(String[] args) {
        _04_단어_뒤집기 T = new _04_단어_뒤집기();

        Scanner in = new Scanner(System.in);
        int i = Integer.parseInt(in.nextLine());
        String[] stringArr = new String[i];
        for(int n = 0; n < i; n++){
            stringArr[n] = in.nextLine();
        }
        for (String s : T.solution(stringArr)) {
            System.out.println(s);
        }
    }

    public ArrayList<String> solution(String[] stringArr){
        final ArrayList<String> arrayList = new ArrayList<>();
        //reverse
//        for(int n = 0; n < stringArr.length; n++){
//            arrayList.add(new StringBuilder(stringArr[n]).reverse().toString());
//        }
        //for
        for (int i = 0; i < stringArr.length; i++){
            final char[] charArray = stringArr[i].toCharArray();
            for(int n = 0; n < charArray.length / 2; n ++){
                char tmp = charArray[n];
                charArray[n] = charArray[charArray.length - n - 1];
                charArray[charArray.length - n - 1] = tmp;
            }
            arrayList.add(String.valueOf(charArray));
        }
        return arrayList;
    }
}
