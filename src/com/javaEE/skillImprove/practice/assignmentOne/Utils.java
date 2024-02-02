package com.javaEE.skillImprove.practice.assignmentOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utils {

    public static List<String> splitEmpData(String data){
        String[] employeeData = data.split(",");

        List<String> splitDataList = new ArrayList<>();
        Collections.addAll(splitDataList, employeeData);

        return  splitDataList;
    }

    public static String [] splitEachEmpData(String data){
        return data.split(":");
    }

}
