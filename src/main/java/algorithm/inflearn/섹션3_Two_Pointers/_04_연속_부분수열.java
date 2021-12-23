package main.java.algorithm.inflearn.섹션3_Two_Pointers;

import java.util.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/21
 */
public class _04_연속_부분수열 {

    public static void main(String[] args){
        _04_연속_부분수열 T = new _04_연속_부분수열();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int m=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n, m, arr));
    }

    private int solution(final int n, final int m, final int[] arr) {
        int sum = 0, lt = 0, cnt = 0;
        for(int rt = 0; rt < n; rt++){
            sum += arr[rt];
            if(sum == m) cnt++;
            while(sum >= m){
                sum -= arr[lt++];
                if(sum == m) cnt++;
            }
        }
        return cnt;
    }

}