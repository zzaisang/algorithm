package main.java.algorithm.programers.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2020-06-28
 */
public class Camouflage {

    public static void main(String[] args) {

        String[][] arrayLv2 = {{"crow_mask", "face"},{"blue_sunglasses","face"},{"smoky_makeup","face"}};
    }

    public int solution(String[][] clothes) {
        int answer = 0;

        final HashMap<String,String> hashMap = new HashMap<>();

        for (String[] clothe : clothes) {
            for (int i = 0; i < clothe.length-1; i ++){
                hashMap.put(clothe[i],clothe[i+1]);
            }
        }

        final Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        final Iterator<Map.Entry<String, String>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()){
            final Map.Entry<String, String> next = entryIterator.next();
            final String value = next.getValue();
        }

        for (Map.Entry<String, String> stringStringEntry : entrySet) {
        }


        return answer;
    }
}
