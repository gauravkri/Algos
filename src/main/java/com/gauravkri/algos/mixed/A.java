package com.gauravkri.algos.mixed;

import java.util.ArrayList;
import java.util.List;

public class A {
    public static void main(String[] args) {

        C obj = new Ce();

        obj.hello();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

//        list.stream().filter(x -> x> 1).forEach(x -> System.out.println(x));

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);

        list.stream().filter(list1::contains).forEach(System.out::println);

        for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i));
            if(list1.contains(list.get(i)) )
                System.out.println("contains ="+ list.get(i));
        }



        String a = "Gaurav";
        System.out.println(a);
    }

}

class C{
    void hello(){
        System.out.println("hello C");
    }
}

class Ce extends C {

    @Override
    void hello(){
        System.out.println("hello Ce");
    }

    void bye() {

        System.out.println("Bye");

    }
}