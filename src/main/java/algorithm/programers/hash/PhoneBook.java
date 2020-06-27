package main.java.algorithm.programers.hash;

public class PhoneBook {

    public static void main(String[] args) {


        String[] a = {"119", "97674223", "1195524421"};

        boolean solution = solution(a);
        System.out.println(solution);

    }

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

    public static boolean sol2(String[] phone_book){

        boolean answer = true;






        return answer;
    }
}
