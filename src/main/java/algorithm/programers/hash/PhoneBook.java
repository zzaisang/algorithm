package main.java.algorithm.programers.hash;

import java.util.Arrays;

public class PhoneBook {

    public static void main(String[] args) {


        String[] a = {"119", "97674223", "1195524421"};

        boolean solution = solution(a);
        System.out.println(solution);

        final boolean sol2 = sol2(a);
        System.out.println(sol2);

    }

    //테스트8,9 실패 && 효율성 1,2 실패
    public static boolean solution(String[] phone_book) {

        final String baseStr = phone_book[0];
        int arrayLength = phone_book.length;
        boolean answer = true;

        for (int i = 1; i < arrayLength; i++ ){
            String compareStr = phone_book[i];
            if (compareStr.startsWith(baseStr)){
                answer = false;
            }
        }
        return answer;
    }

    //통과
    public static boolean sol2(String[] phone_book){

        Arrays.sort(phone_book);
        boolean answer = true;

        for (int i = 0; i < phone_book.length - 1; i ++){
            if (phone_book[i + 1].contains(phone_book[i])){
                answer = false;
                break;
            }
        }

        return answer;
    }
}
