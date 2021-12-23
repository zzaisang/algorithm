package main.java.algorithm.inflearn.섹션3_Two_Pointers;

import java.util.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/21
 */
public class _03_최대_매출 {

    public static void main(String[] args){
        _03_최대_매출 T = new _03_최대_매출();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n, k, arr));
    }

    private int solution(final int n, final int k, final int[] arr) {
        int answer, sum = 0;

        //init
        for(int i = 0; i < k; i++) sum+=arr[i];
        answer = sum;
        for(int i = k; i < n; i++){
            sum+=arr[i] - arr[i - k];
            answer = Math.max(answer,sum);
        }
        return answer;
    }


}