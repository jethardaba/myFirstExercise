package com.JethArdaba.classes;

/**
 * Created by JPMC on 2/17/2017.
 */
public class Employee extends UserClass{

    public String Department;
    public String PayGrade;
    public String EmployeeID;

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getPayGrade() {
        return PayGrade;
    }

    public void setPayGrade(String payGrade) {
        PayGrade = payGrade;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }

    public String introduceYourself(String firstName, String lastName){
        return "\nHello I'm " + firstName + " " + lastName;
    }

    public String introduceYourself (String firstName, String lastName, int age, String address){
        return "\nHello I'm " + firstName + " " + lastName + ".I'm " + age + " years old.I live in " + address + ". What's your favorite fruit?";
    }
    public String introduceYourself (String firstName, String lastName, int age, String address, String course){
        return "\nHello I'm " + firstName + " " + lastName + ".I'm " + age + " years old.I live in " + address + ". My course is" + course ;
    }
}
