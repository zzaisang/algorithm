package main.java.algorithm.programers.sort;

import java.util.Arrays;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021-12-03
 * K번째 수
 */
public class Knumber {

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};

        for (int i : solution(array, commands)) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int a = 0; a < commands.length; a++){

            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];
            int[] resultArr = new int[j - i > 0 ? j-i+1 : 1];

            int init = 0;
            for(int z = i; z <= j; z++){
                resultArr[init++] = array[z-1];
            }
            Arrays.sort(resultArr);
            answer[a] = resultArr[k-1];
        }
        return answer;
    }

}
