package com.gauravkri.algos.javaconcepts.functionalinterface;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExampleCallOfFunctionalInterface {


    public String generateStringOtp(int len){
        ExampleFunctionalInterface exampleFunctionalInterface = (a) -> {
            byte[] array = new byte[a];
            new Random().nextBytes(array);
            return new String(array, Charset.forName("UTF-8"));
        };

        return (String) exampleFunctionalInterface.otp(len);
    }

    public Integer generateStringOtpInt(int len){
        ExampleFunctionalInterface exampleFunctionalInterface = (a) -> {
            Random random = new Random();
            return  random.nextInt(len);
        };
        return (Integer) exampleFunctionalInterface.otp(len);
    }



    /* Supplier<T>:
        1. It has abstract method T get();
        2. It returns value without taking any input.
        3. it commonly used for lazy initialisation or generating values.
     */

    public int SupplerImplementation(){
        Supplier<Integer> randomNumberSupplier = ()-> (int) (Math.random() *100);
        return randomNumberSupplier.get();
    }


    /* Consumer<T>:
       1. It has Abstract Method void accept(T value);
       2. It accepts input value and return no value or result.
       3. It commonly used for saving or printing data or processing.
     */
    public  void ConsumerImplementation(String data){
        Consumer<String> consumer = message -> System.out.println(message);
        consumer.accept(data);
    }

    /*Function<T,R>:
        1. It has Abstract method R apply(T value);
        2. It accepts input value and return processed value or result.
        3. It commonly used for mapping, transforming input to output.
     */

    public Integer functionImplementation(Integer data){
        Function<Integer, Integer> fun = (v) -> v*v;
        return fun.apply(5);
    }


    /*Predicate<T>:
        1. It has Abstract method boolean test(T value);
        2. It accepts input and return true or false.
        3. It commonly used for filter or testing of input value with a condition.
     */
    public boolean predicateImplementation(Integer value){
        Predicate<Integer> predicate = (data) -> data % 2 == 0;
       return predicate.test(4);
    }

    public static void main(String[] args) {

        ExampleCallOfFunctionalInterface ex = new ExampleCallOfFunctionalInterface();
        System.out.println(ex.generateStringOtp(5));

        System.out.println(ex.generateStringOtpInt(10000));

        //SupplerImplementation
        System.out.println("Supplier<T> : "+ex.SupplerImplementation());

        //ConsumerImplementation
        ex.ConsumerImplementation("Consumer<T> : Hey buddy!");

        //Function<T,R>:
        System.out.println("Function<T,R>: square of 5 : "+ex.functionImplementation(5));

        //Predicate<T>:
        System.out.println("Predicate<T>: isEven 4: "+ex.predicateImplementation(4));
    }
}
