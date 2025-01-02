package com.stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {

    public static void main(String[] args) {
        System.out.println("Starting test Stream apis");

        /**
         *filter,consumer,supplier and predicate
         * */

        List<Integer> x = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> y = x.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(y);



    }


}
