package com.java.functionalComposition;

import java.util.function.Predicate;

/*
Functional composition is a technique to combine multiple functions into a single function
which uses the combined functions internally.
* */
public class FuncCompositionExamples {

    public static void main(String[] args) {

        //Example 1

        //Predicate interface is a func interface and has test() abstract method which we are implementing below with lambda exp
        Predicate<String> startsWithA = (text) -> text.startsWith("A");
        Predicate<String> endsWithX = (text) -> text.endsWith("x");

        //After creating the two basic functions, a third Predicate is composed, which calls the test() methods of the two first functions.
        //This third function returns true if both of the basic functions return true, and false otherwise.
        Predicate<String> startsWithAAndEndsWithX = (text) -> startsWithA.test(text) && endsWithX.test(text);

        System.out.println(startsWithAAndEndsWithX.test("A hardworking person must relaX"));
    }
}
