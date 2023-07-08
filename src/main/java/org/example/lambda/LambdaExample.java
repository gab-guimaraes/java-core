package org.example.lambda;

import java.util.function.Function;

public class LambdaExample {
    public static void main(String[] args) {
        Function<Integer, Integer> adder1 = x -> x + 1;
        Function<Integer, Integer> adder2 = x -> x + 2;
        Function<Integer[], Double> average = x -> {
            double sum = 0;
            for (Integer integer : x) {
                sum += integer;
            }
            return sum / x.length;
        };
        double avg = average.apply(new Integer[]{1, 2, 3, 4, 5});
        System.out.println(avg);
    }

    public static void printResult(Function<Integer, Integer> adder, int x) {
        System.out.println(adder.apply(x));
    }

}

