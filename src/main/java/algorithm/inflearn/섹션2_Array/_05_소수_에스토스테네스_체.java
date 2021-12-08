package main.java.algorithm.inflearn.섹션2_Array;

import java.util.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/08
 */
public class _05_소수_에스토스테네스_체 {

    public static void main(String[] args) {
        _05_소수_에스토스테네스_체 T = new _05_소수_에스토스테네스_체();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }

    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <= n; j = j + i) ch[j] = 1;
            }
        }
        return answer;
    }

}