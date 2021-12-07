package main.java.algorithm.inflearn.섹션2_Array;

import java.util.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/07
 */
public class _01_큰_수_출력하기 {

    public static void main(String[] args) {
        _01_큰_수_출력하기 T = new _01_큰_수_출력하기();
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.nextLine());
        String[] split = sc.nextLine().split(" ");
        int[] intArr = new int[len];
        for(int i = 0; i < len; i++){
            intArr[i] = Integer.parseInt(split[i]);
        }
        for(Integer i : T.solution(intArr)){
            System.out.print(i + " ");
        }
    }

    public ArrayList<Integer> solution(int[] intArr) {
        ArrayList<Integer> resultList = new ArrayList<>();
        resultList.add(intArr[0]);
        for(int i = 1; i < intArr.length ; i++){
            if(intArr[i - 1] < intArr[i]){
                resultList.add(intArr[i]);
            }
        }
        return resultList;
    }

}