package com.java.lambda;

import java.util.Comparator;

public class LambdaExamples {

    public static void main(String[] args) {

        /*1--------------------------------------------------*/

        /* Primitive way of implementing anonymous functions
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        int comparison = stringComparator.compare("world","hello");
        System.out.println(comparison);*/


        //Implementing using Java Lambda Exp. This is functional programming
        //Longer Syntax ->  Comparator<String> stringComparatorLambda = (String o1, String 02) -> { return o1.comapreTo(o2); }
        Comparator<String> stringComparatorLambda =
                ( o1, o2) ->  o1.compareTo(o2); ;

        int comparison2 = stringComparatorLambda.compare("world","hello");
        System.out.println(comparison2);

        /*2--------------------------------------------------*/
        //Lambda func can only be used for impl method of interfaces having only one abstract method
        MyFunction myFunction = (text1,text2) -> {
            System.out.println(text1+"+"+text2);
            return text1+"+"+text2;
        };

        System.out.println(myFunction.apply("First", "Second"));

        MyFunction myFunction2 = myFunction;//Lambda func are objects hence cn be passed or referenced
        System.out.println(myFunction2.apply("Text1","Text2"));

    }
}
