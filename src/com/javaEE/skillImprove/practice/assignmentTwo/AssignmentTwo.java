package com.javaEE.skillImprove.practice.assignmentTwo;

import com.javaEE.skillImprove.practice.assignmentTwo.utils.Constants;
import com.javaEE.skillImprove.practice.assignmentTwo.utils.Filter;

import java.util.ArrayList;
import java.util.List;

public class AssignmentTwo {

    public void assignmentMain(){

        showFilterPersons(getPersonList());

    }

    List<Person> getPersonList(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("John",25,"Male"));
        personList.add(new Person("Rick",22,"Male"));
        personList.add(new Person("Jessica",16,"Female"));
        personList.add(new Person("Jane",18,"Female"));
        personList.add(new Person("Cruise",32,"Male"));
        personList.add(new Person("Albert",28,"Male"));
        personList.add(new Person("Mohana",23,"Female"));

        /*Stream<Person> pStream = personList.stream();
        pStream.forEach(
                s -> System.out.println(
                        "Name: " + s.getName()
                                + " Age: " + s.getAge()
                                + " Gender: " + s.getGender()
                )
        );*/

        return personList;
    }

    void showFilterPersons(List<Person> personList){
        System.out.println("Person filter by Age: ");
        Filter.filterByAge(personList);
        System.out.println();

        System.out.println("Using Lambda Person filter by Age: ");
        Filter.filterByAgeUseLambda(personList);
        System.out.println();

        System.out.println("Person filter by Gender(male): ");
        Filter.filterByGender(personList).filterByGender(Constants.GENDER_MALE);
        System.out.println();

        System.out.println("Person filter by Gender(Female): ");
        Filter.filterByGenderAnotherWay(Constants.GENDER_FEMALE, personList);
        System.out.println();
    }

}
