package main.java.algorithm.inflearn.섹션2_Array;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/08
 */
public class _02_보이는_학생 {

    public static void main(String[] args) {
        _02_보이는_학생 T = new _02_보이는_학생();
        Scanner sc = new Scanner(System.in);
        Integer len = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        List<Integer> integerList = Arrays.stream(s.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(T.solution(integerList));
    }
    //오답
    public Integer solution(List<Integer> integerList) {
        integerList.sort(Comparator.naturalOrder());
        int result = 0;
        for(int i = 0; i < integerList.size() - 1; i++){
            if(integerList.get(i) < integerList.get(i + 1)) result++;
            else return result;
        }
        return result;
    }

}