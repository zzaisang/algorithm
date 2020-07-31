package main.java.algorithm.programers.hash;

import java.util.*;

import static java.util.stream.Collectors.*;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2020-06-28
 */
public class Camouflage {

    public static void main(String[] args) {

        String[][] arrayLv2 = {{ "yellow_hat", "headgear"},{"blue_sunglasses", "eyewear" },{ "green_turban", "headgear" } };
        //System.out.println(solution2(arrayLv2));
        System.out.println(solution3(arrayLv2));
    }

    public static int solution2(String[][] clothes) {

        HashMap<String, Integer> categories = categorizeClothes(clothes);

        int answer = 1;
        for (Integer value : categories.values())
            answer *= (value + 1);

        answer -= 1;

        return answer;
    }

    public static HashMap<String, Integer> categorizeClothes(String[][] clothes) {
        HashMap<String, Integer> categories = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            String categoryName = clothes[i][1];
            if (categories.containsKey(categoryName))
                categories.replace(categoryName, categories.get(categoryName) + 1);
            else
                categories.put(categoryName, 1);
        }
        return categories;
    }

    //functional 풀이
    public static int solution3(String[][] clothes) {
        return Arrays.stream(clothes)
                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
                .values()
                .stream()
                .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;
    }
}
