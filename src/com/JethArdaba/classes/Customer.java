package com.JethArdaba.classes;

/**
 * Created by JPMC on 2/17/2017.
 */
public class Customer extends UserClass{

    public String Address;
    public String TelephoneNumber;
    public String CustomerID;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getTelephoneNumber() {
        return TelephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        TelephoneNumber = telephoneNumber;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }

    public String introduceYourself(String firstName, String lastName){
        return "\nHello I'm " + firstName + " " + lastName;
    }

    public String introduceYourself (String firstName, String lastName, int age, String address){
        return "\nHello I'm " + firstName + " " + lastName + ".I'm " + age + " years old.I live in " + address + " I love apples. ";
    }

}
