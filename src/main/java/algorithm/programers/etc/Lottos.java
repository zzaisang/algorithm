package main.java.algorithm.programers.etc;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021/11/27
 */
public class Lottos {

    public static void main(String[] args) {

        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        int matchCnt = correctMatchCnt(lottos, win_nums);
        int jokerCnt = jokerCnt(lottos);

        int minRank = rank(matchCnt);
        int maxRank = rank(matchCnt + jokerCnt);

        int[] answer = {maxRank, minRank};
        System.out.println(answer);
    }

    public static int jokerCnt(int[] lottos){
        int cnt = 0;
        for (int lotto : lottos) {
            if (lotto == 0) cnt++;
        }
        return cnt;
    }

    public static int correctMatchCnt(int[] lottos, int[] win_nums){
        int cnt = 0;
        for(int i = 0; i < lottos.length; i ++){
            if(lottos[i] == 0) continue;
            for(int n = 0; n < win_nums.length; n ++){
                if(lottos[i] == win_nums[n]){
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static int rank(int cnt){
        int rank = 0 ;
        switch (cnt){
            case 6 : rank = 1;
            case 5 : rank = 2;
            case 4 : rank = 3;
            case 3 : rank = 4;
            case 2 : rank = 5;
            case 1 : rank = 6;
            case 0 : rank = 6;
        }
        return rank;
    }


}
