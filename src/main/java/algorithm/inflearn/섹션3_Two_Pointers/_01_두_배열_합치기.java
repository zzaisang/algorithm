package main.java.algorithm.inflearn.섹션3_Two_Pointers;

import java.util.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/21
 */
public class _01_두_배열_합치기 {

    /**
     * 설명
     *
     * 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
     *
     *
     * 입력
     * 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
     *
     * 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
     *
     * 세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
     *
     * 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
     *
     * 각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
     *
     * 출력
     * 오름차순으로 정렬된 배열을 출력합니다.
     * */


    public static void main(String[] args) {
        _01_두_배열_합치기 T = new _01_두_배열_합치기();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=kb.nextInt();
        }
        int m=kb.nextInt();
        int[] b=new int[m];
        for(int i=0; i<m; i++){
            b[i]=kb.nextInt();
        }
        for(int x : T.solution(n, m, a, b)) System.out.print(x+" ");
    }

    private ArrayList<Integer> solution(final int n, final int m, final int[] a, final int[] b) {
        ArrayList answer = new ArrayList();
        int p1 = 0,p2 = 0;
        while(p1 < n && p2 < m){
            if(a[p1] < b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        while (p1 < n) answer.add(a[p1++]);
        while (p2 < m) answer.add(b[p2++]);
        return answer;
    }

}