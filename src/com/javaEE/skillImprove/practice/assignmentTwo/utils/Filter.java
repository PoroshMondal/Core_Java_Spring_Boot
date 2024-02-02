package com.javaEE.skillImprove.practice.assignmentTwo.utils;

import com.javaEE.skillImprove.practice.assignmentTwo.Person;
import com.javaEE.skillImprove.practice.assignmentTwo.interfaces.IFilterByAge;
import com.javaEE.skillImprove.practice.assignmentTwo.interfaces.IFilterByGender;

import java.util.List;

public class Filter {

    /*
     * Functional Interface
     * implement without using Lambda on Functional Interface
     * used as usual Anonymous class
     * */
    public static void filterByAge(List<Person> personList){
        IFilterByAge filterByAge = new IFilterByAge() {
            @Override
            public void filterByAge(int age) {
                personList.stream()
                        .filter(person -> person.getAge() > age)
                        .forEach(
                                person -> System.out.println(
                                        "Name: " + person.getName()
                                                + " Age: " + person.getAge()
                                                + " Gender: " + person.getGender()
                                )
                        );
            }
        };

        filterByAge.filterByAge(24);
    }

    public static void filterByAgeUseLambda(List<Person> personList){
        IFilterByAge filterByAge = age ->
                personList.stream()
                        .filter(person -> person.getAge()>age)
                        .forEach( person ->
                                System.out.println(
                                        "Name: " + person.getName()
                                                + " Age: " + person.getAge()
                                                + " Gender: " + person.getGender()
                                )
                        );
        filterByAge.filterByAge(26);
    }

    /*
     * Filter using the
     * Functional Interface object as return type
     * to call the interface
     * */
    public static IFilterByGender filterByGender(List<Person> personList){
        return gender ->
                personList.stream()
                        .filter(person -> person.getGender().equals(gender))
                        .forEach(
                                person -> System.out.println(
                                        "Name: " + person.getName()
                                                + " Age: " + person.getAge()
                                                + " Gender: " + person.getGender()
                                )
                        );
    }

    public static void filterByGenderAnotherWay(String genderType, List<Person> personList){
        IFilterByGender filterByGender = gender ->
                personList.stream()
                        .filter(person -> person.getGender().equals(gender))
                        .forEach(
                                person -> System.out.println(
                                        "Name: " + person.getName()
                                                + " Age: " + person.getAge()
                                                + " Gender: " + person.getGender()
                                )
                        );

        filterByGender.filterByGender(genderType);
    }

}
