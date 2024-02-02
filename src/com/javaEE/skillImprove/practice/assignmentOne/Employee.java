package com.javaEE.skillImprove.practice.assignmentOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {

    List<EmployeeModel> list = new ArrayList<>();
    List<String> empNameList = new ArrayList<>();

    public Employee(){

    }

    public void processEmployeeData(String data){
        List<String> employeeDataList = Utils.splitEmpData(data);

        for (String s : employeeDataList) {

            String[] sArray = Utils.splitEachEmpData(s);

            String name = "", age = "0", dept = "", salary = "";
            for (int j = 0; j < sArray.length; j++) {
                switch (j) {
                    case 0:
                        name = sArray[j];
                        empNameList.add(name);
                        break;
                    case 1:
                        age = sArray[j];
                        break;
                    case 2:
                        dept = sArray[j];
                        break;
                    case 3:
                        salary = sArray[j];
                        break;
                }

            }

            list.add(new EmployeeModel(name, Integer.parseInt(age), dept, Integer.parseInt(salary)));

        }

        internalDataProcessing();

    }

    int allEmAge = 0; int highestSal = 0; String highestSalEmp = "";
    public void internalDataProcessing(){
        for (EmployeeModel employeeModel : list) {

            allEmAge = allEmAge + employeeModel.getAge();

            if (highestSal<employeeModel.getSalary()){
                highestSal = employeeModel.getSalary();
                highestSalEmp = employeeModel.getName();
            }

        }
    }

    public void printEmployeeData(){
        // output
        System.out.println("Total Employees: " + list.size());
        System.out.println("Average Age: " + (double) allEmAge /list.size());
        System.out.println("Employee with Highest Salary: " + highestSalEmp);

        Collections.sort(empNameList);

        StringBuilder stringBuilder = new StringBuilder();
        for (String e: empNameList){
            stringBuilder.append(e).append(",");
        }

        System.out.println("Sorted Names: " + stringBuilder);

        System.out.println();
    }

}
