package main.java.algorithm.programers._level_1;

import java.util.*;

public class _가장_가까운_같은_글자 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("banana")));
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if(!map.containsKey(c)){
                answer[i] = -1;
                map.put(c, i);
            }else {
                int before = map.get(c);
                answer[i] = i - before;
                map.put(c, i);
            }
        }
        return answer;
    }
}
