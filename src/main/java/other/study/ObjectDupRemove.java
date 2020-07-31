package main.java.other.study;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2020/07/15
 */
public class ObjectDupRemove {


    public static void main(String[] args) {

        final List<Hello> helloList = Arrays.asList(
                new Hello("김상재", "zzaisang@gmail.com"),
                new Hello("짜이상", "zzaisang@gmail.com"),
                new Hello("상자이", "zzaisang@gmail.com"),
                new Hello("상짜이", "zzaisang@gmail.com"),
                new Hello("짜이상", "zzaisang@gmail.com")
        );

        final List<Hello> collect = helloList
                .stream()
                .collect(Collectors.toConcurrentMap(Hello::getName, Function.identity(), (p, g) -> p)).values()
                .stream()
                .collect(Collectors.toList());

        System.out.println(helloList);
        System.out.println(collect);
    }
}

@ToString
@AllArgsConstructor
@Getter
class Hello{
    String name;
    String email;
}

