package com.gauravkri.algos.javaconcepts.functionalinterface;

@FunctionalInterface
public interface MathOperation {

    public int mathOps(int a, int b);

}


/**
 * InnerMathOperation
 */
class InnerMathOperation {

    public static int addition(int a, int b){
        MathOperation mathOperation = (int x, int y)->  a + b;
        return mathOperation.mathOps(a,b);
    }

    public static int multiplication(int a, int b){
        MathOperation mathOperation = (int x, int y)-> a * b;
        return mathOperation.mathOps(a,b);
    }

    public static void main(String[] args) {
       int a = 5, b=10;

       System.out.println(InnerMathOperation.addition(a, b));

       System.out.println(InnerMathOperation.multiplication(a, b));
    }
}