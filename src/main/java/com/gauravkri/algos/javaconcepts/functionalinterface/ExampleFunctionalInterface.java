package com.gauravkri.algos.javaconcepts.functionalinterface;



@FunctionalInterface
public interface ExampleFunctionalInterface {

    /*
        1. A interface has one exactly abstract method.
        2. It can have default methods, because they are not abstract method.
        3. If interface declare public abstract method of Object class then it also not count as abstract method of interface because it has already implemention from java.lang.object.
        4. It can static methods also because it is not count as abstract method.
        5. we can define Functional interface with @FunctionalInterface then if we implement more then one abstract method it gives compile error.
        6. Instance of FunctionalInterface can be created with lamda expression or method refrence or constructor refrence.
        7. FunctionalInterface can be implemented using lamda expression.

     */

    Object otp(int noOfDigit);

    default void  printOtp(Object otp){
        System.out.println("Otp generate :" + String.valueOf(otp));
    }
}

