package main.java.algorithm.inflearn.섹션2_Array;

import java.util.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/12/08
 */
public class _03_가위바위보 {

    public static void main(String[] args) {
        _03_가위바위보 T = new _03_가위바위보();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (String s : T.solution(n, a, b)) {
            System.out.println(s);
        }
    }

    public String[] solution(int n, int[] a, int[] b) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) answer[i] = "D";
            else if (a[i] == 1 && b[i] == 3) answer[i] = "A";
            else if (a[i] == 2 && b[i] == 1) answer[i] = "A";
            else if (a[i] == 3 && b[i] == 2) answer[i] = "A";
            else answer[i] = "B";
        }
        return answer;
    }


}