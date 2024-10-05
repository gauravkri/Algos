package com.gauravkri.algos.javaconcepts;



/*
 * In multiple inheritance, if the same method is present in multiple interfaces or abstract classes, 
 * the compiler gets confused about which method should be called when a child class inherits from them. 
 * We can resolve this issue by overriding the method in the child class, and we can also call the method 
 * from the abstract class using the super keyword.
 */



interface InnerDiamondProblem {

    public default void foo(){
        System.out.println("InnerDiamondProblem interface called");
    }
}


/**
 * InnerDiamondProblem_1
 */
interface InnerDiamondProblem_1 {

    public default void foo(){
        System.out.println("InnerDiamondProblem_1 interface called");
    }
    
}
public class DiamondProblem implements InnerDiamondProblem,InnerDiamondProblem_1{

    public void foo(){
        System.out.println("InnerDiamondProblem_class interface called");
    }


    public static void main(String[] args) {
        DiamondProblem d = new DiamondProblem();
        InnerDiamondProblem d1 = new DiamondProblem();
        InnerDiamondProblem_1 d2 = new DiamondProblem();

        d1.foo();
        d2.foo();
        d.foo();
    }
}

