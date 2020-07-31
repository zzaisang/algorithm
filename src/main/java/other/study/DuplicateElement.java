package main.java.other.study;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2020/07/14
 */
public class DuplicateElement {

    public static void main(String[] args) {

        final List<String> nameList = Arrays.asList("김상재", "김상재", "김상재", "짜이상", "상짜이", "짜이상");

        final Set<String> dupRemoveSet = nameList
                .stream()
                .collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting())
                ).entrySet().stream()
                .filter(v -> v.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println(nameList);
        System.out.println(dupRemoveSet);

    }

}

