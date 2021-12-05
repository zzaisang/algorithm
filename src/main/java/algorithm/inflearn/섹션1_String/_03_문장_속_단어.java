package main.java.algorithm.inflearn.섹션1_String;

import java.util.Scanner;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/05
 */
public class _03_문장_속_단어 {

    public static void main(String[] args) {
        _03_문장_속_단어 T = new _03_문장_속_단어();

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(T.solution(str));
    }

    public String solution(String str){
        String[] strings = str.split(" ");
        String answer = "";
        for(int i = 0; i < strings.length; i++){
            if(answer.length() < strings[i].length()) answer = strings[i];
        }
        return answer;
    }
}
