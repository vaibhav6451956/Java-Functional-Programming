package com.java.lambda;

public class LambdaExamples3 {

    static String thirdText = "Hey, a third text";
    public static void main(String[] args) {

        final String otherText = "Hello";

        MyInterface2 myInterface2 = (text)-> {
            System.out.println(otherText+"+"+text+"+"+ thirdText);
        };

        myInterface2.printIt("ABC");

        thirdText ="blablaa";

        myInterface2.printIt("ABC");
    }
}
