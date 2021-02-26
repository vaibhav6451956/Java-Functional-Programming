package com.java.functionalComposition;

import java.util.function.Predicate;

public class FuncCompositionExample2 {
    public static void main(String[] args) {
        //The Predicate interface (java.util.function.Predicate) contains a few methods that help you compose
        // new Predicate instances from other Predicate instances.

        //This Predicate composition example composes a new Predicate from two other Predicate instances using the and() method of one of the basic Predicate instances.
        Predicate<String> startsWithA = (text) -> text.startsWith("A");
        Predicate<String> endsWithX   = (text) -> text.endsWith("x");

        Predicate<String> composedAnd = startsWithA.and(endsWithX);

        String input = "A hardworking person must relax";
        boolean result = composedAnd.test(input);
        System.out.println(result);

        Predicate<String> composedOr = startsWithA.or(endsWithX);//returns true if either is true

        String inputOr = "A hardworking person must relax sometimes";
        boolean resultOr = composedOr.test(inputOr);
        System.out.println(resultOr);

    }
}
