package main.java.algorithm.inflearn.섹션4_Hash;

import java.util.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/01/05
 */
public class _05_K번째_큰_수 {

    public static void main(String[] args){
        _05_K번째_큰_수 T = new _05_K번째_큰_수();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.println(T.solution(arr, n, k));
    }

    private int solution(int[] arr, int n, int k) {
        int answer = -1;

        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for(int i = 0; i < n; i++){
            for (int l = i + 1; l < n; l++){
                for (int x = l + 1; x < n; x++){
                    treeSet.add(arr[i] + arr[l] + arr[x]);
                }
            }
        }
        int cnt = 1;
        for (Integer i : treeSet) {
            if (cnt == k) return i;
            cnt++;
        }
        return answer;
    }

}