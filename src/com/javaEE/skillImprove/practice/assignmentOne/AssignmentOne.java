package com.javaEE.skillImprove.practice.assignmentOne;

public class AssignmentOne {

    public void assignmentMain(){
        String data = "Jhon:30:HR:50000,Alice:28:Finance:60000," +
                "Bob:35:Engineering:75000,Emily:32:HR:55000";

        Employee employee = new Employee();
        employee.processEmployeeData(data);
        employee.printEmployeeData();
    }

}
