package com.java.functionalComposition;

import java.util.function.Function;

public class FuncCompositionExample3 {
    public static void main(String[] args) {

        //Function returned by compose() will first call the Function passed as parameter to compose(),
        // and then it will call the Function which compose() was called on
        Function<Integer,Integer> multiply = (value) -> value*2;//overriding apply() method of func interface 'Function<t,r>'
        Function<Integer,Integer> add = (value) -> value+2;

        Function<Integer,Integer> addThenMultiply = multiply.compose(add);

        Integer result1 = addThenMultiply.apply(3);//first added 3+2=5 then multiplied 5+2=10
        System.out.println(result1);


        //A Function composed with andThen() will first call the Function that andThen() was called on,
        // and then it will call the Function passed as parameter
        Function<Integer, Integer> multiplyThenAdd = multiply.andThen(add);
        Integer result2 = multiplyThenAdd.apply(3);
        System.out.println(result2);

    }
}
