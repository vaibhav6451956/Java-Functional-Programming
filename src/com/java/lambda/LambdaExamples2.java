package com.java.lambda;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class LambdaExamples2 {

    public static void main(String[] args) throws FileNotFoundException {
        MyInterface myInterface = (String text) -> {
            System.out.println(text);
        };

        myInterface.printIt("Hello Interface");

        myInterface.printUtf8To("Hello World", new FileOutputStream("data.text"));

        MyInterface.printItToSystemOut("static method");
    }
}
