package main.java.algorithm.inflearn.섹션2_Array;

import java.util.Scanner;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/08
 */
public class _02_보이는_학생 {

    public static void main(String[] args) {
        _02_보이는_학생 T = new _02_보이는_학생();
        Scanner sc = new Scanner(System.in);
        Integer len = sc.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(len,arr));
    }
    public Integer solution(final Integer len, int[] integerList) {
        int max = integerList[0];
        int result = 1;
        for(int i = 1; i < len; i++){
            if(max < integerList[i]){
                result++;
                max = integerList[i];
            }
        }
        return result;
    }

}