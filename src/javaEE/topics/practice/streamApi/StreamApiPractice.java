package com.javaEE.practice.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiPractice {

    public StreamApiPractice(){

    }

    public void practiceStreamApi(){
        Stream<Integer> s1 = Stream.of(10,1,15,20,25,7);
        s1.filter(i -> i>2)
                .forEach(System.out::println);

        List<String> list = new ArrayList<>();
        list.add("Anil");
        list.add("Raja");
        list.add("Rani");
        list.add("Ashok");
        list.add("Akbar");

        Stream<String> s = list.stream();
        s.filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
        s.close();

        System.out.println();
        System.out.println();

        Stream<String> s2 = list.stream();
        s2.map(String::toUpperCase)
                .forEach(System.out::println);
        s2.close();

        System.out.println();
    }

}
