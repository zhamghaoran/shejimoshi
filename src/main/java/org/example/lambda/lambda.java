package org.example.lambda;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

public class lambda {
    public static void main(String[] args) {
        //new Thread(()-> System.out.println("test")).start();
//        int i = calculateNum((int le, int ri) -> {
//            return le + ri;
//        });
//        System.out.println(i);
//        printNum(val -> val % 2 == 0);
        typeConver(s -> Integer.parseInt(s));
    }
    public static int calculateNum(IntBinaryOperator operator) {
        int a = 10;
        int b = 20;
        return operator.applyAsInt(a,b);
    }
    public static void printNum(IntPredicate predicate) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i : arr) {
            if (predicate.test(i))
                System.out.println(i);
        }
    }
    public static <R> R typeConver(Function<String ,R> function) {
        String str = "1235";
        return function.apply(str);
    }
}
