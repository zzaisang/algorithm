package main.java.algorithm.programers.hash;

import java.util.Arrays;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/11/27
 */
public class NonCompletion {

    public static void main(String[] args) {

    }
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        String temp = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        int i = 0;

        while(i < completion.length){
            if(!completion[i].equals(participant[i])){
                temp = participant[i];
                break;
            }else{
                i++;
            }
        }

        if(!temp.equals("")){
            answer = temp;
        }else{
            answer = participant[participant.length-1];
        }

        return answer;
    }
}
