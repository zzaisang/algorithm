package main.java.algorithm.programers._level_1;

public class _크기가_작은_부분문자열 {

    public static void main(String[] args) {

        System.out.println(solution("3141592","271"));
    }

    public static int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        Long num = Long.parseLong(p);

        for(int i = 0; i < t.length() - len + 1; i++){
            Long diff = Long.parseLong(t.substring(i, i + len));
            if( diff <= num) answer++;
        }

        return answer;
    }
}
