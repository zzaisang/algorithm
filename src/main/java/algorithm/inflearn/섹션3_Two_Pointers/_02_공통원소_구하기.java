package main.java.algorithm.inflearn.섹션3_Two_Pointers;

import java.util.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/21
 */
public class _02_공통원소_구하기 {

    /**
     * 설명
     *
     * A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
     *
     *
     * 입력
     * 첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
     *
     * 두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
     *
     * 세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
     *
     * 네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
     *
     * 각 집합의 원소는 1,000,000,000이하의 자연수입니다.
     *
     *
     * 출력
     * 두 집합의 공통원소를 오름차순 정렬하여 출력합니다.
     *
     * */

    public static void main(String[] args){
        _02_공통원소_구하기 T = new _02_공통원소_구하기();
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

    private ArrayList<Integer> solution(final int n, final int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        while(p1 < n && p2 <m){
            if(a[p1] == b[p2]){
                answer.add(a[p1++]);
                p2++;
            }else {
                if(a[p1] < b[p2]) p1++;
                else p2++;
            }
        }
        return answer;
    }

}