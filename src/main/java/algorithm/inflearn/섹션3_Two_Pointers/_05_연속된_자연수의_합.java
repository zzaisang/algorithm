package main.java.algorithm.inflearn.섹션3_Two_Pointers;

import java.util.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/28
 */
public class _05_연속된_자연수의_합 {

    public static void main(String[] args){
        _05_연속된_자연수의_합 T = new _05_연속된_자연수의_합();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        System.out.print(T.solution(n));
    }

    public int solution(int n) {
        int answer = 0, sum = 0;
        int m = n / 2 + 1;
        int[] arr = new int[m];
        for(int i = 0; i < m; i ++){
            arr[i] = i + 1;
        }
        int lt = 0;
        for( int rt = 0; rt < m; rt++ ){
            sum += arr[rt];
            if(sum==n) answer++;
            while(sum >= n){
                sum -= arr[lt++];
                if(sum == n) answer++;
            }
        }
        return answer;
    }

}