package main.java.algorithm.inflearn.섹션4_Hash;

import java.util.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2022/01/05
 */
public class _04_모든_아나그램_찾기 {


    /**
     * 4. 모든 아나그램 찾기
     * 설명
     *
     * S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
     *
     * 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
     *
     *
     * 입력
     * 첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
     *
     * S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
     *
     *
     * 출력
     * S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.
     *
     *
     * 예시 입력 1
     *
     * bacaAacba
     * abc
     * 예시 출력 1
     *
     * 3
     * 힌트
     *
     * 출력설명: {bac}, {acb}, {cba} 3개의 부분문자열이 "abc"문자열과 아나그램입니다.
     *
     * */

    public static void main(String[] args){
        _04_모든_아나그램_찾기 T = new _04_모든_아나그램_찾기();
        Scanner kb = new Scanner(System.in);
        String a=kb.next();
        String b=kb.next();
        System.out.print(T.solution(a, b));
    }

    public int solution(String a, String b) {
        int cnt = 0;
        HashMap<Character, Integer> aMap = new HashMap<>(); //길문자열
        HashMap<Character, Integer> bMap = new HashMap<>(); //아나그램 비교대상

        for (char c : b.toCharArray()) {
            bMap.put(c , bMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < b.length() - 1; i++){
            aMap.put(a.charAt(i), aMap.getOrDefault(a.charAt(i), 0) + 1);
        }

        int lt = 0;
        for( int rt = b.length() - 1; rt < a.length(); rt++){
            aMap.put(a.charAt(rt), aMap.getOrDefault(a.charAt(rt), 0) + 1);
            if (aMap.equals(bMap)) cnt++;
            aMap.put(a.charAt(lt), aMap.get(a.charAt(lt)) - 1);
            if (aMap.get(a.charAt(lt)) == 0) aMap.remove(a.charAt(lt));
            lt++;
        }
        return cnt;
    }

}