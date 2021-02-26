package com.java.lambda;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public interface MyInterface {

    void printIt(String text);

    default public void printUtf8To(String text, OutputStream outputStream) {
        try{
            outputStream.write(text.getBytes(StandardCharsets.UTF_8));
        }
        catch (IOException e) {
            throw new RuntimeException("Error writing string as UTF-8 to OutputStream", e);
        }
    }

    static void printItToSystemOut(String text) {
        System.out.println(text);
    }
}
