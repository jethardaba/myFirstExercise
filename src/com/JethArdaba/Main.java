package com.JethArdaba;

import com.JethArdaba.classes.StaticMethods;



public class Main {

    public static void main(String[] args) {

        //LOOPS

        //WHILE LOOP

        int num = 1;

        while (num < 11) {
            System.out.print("[" + num + "]");
            num++;
        }
        System.out.println("\n");

        //DO-WHILE LOOP
        int n = 1;

        do {
            System.out.print("[" + n + "]");
            n++;
        }
        while (n < 11);
        System.out.println("\n");

        //FOR LOOP
        for (int number = 1; number < 11; number++) {
            System.out.print("[" + number + "]");
        }

        System.out.println("\n\n" + "Total: " + StaticMethods.myTotal(6));

        int input = 7;
        int factorial = 1;
        while (input > 0) {
            factorial = factorial * input;
            input--;
        }
        System.out.println("\nFactorial : " + factorial + "\n");

        int limit = 12;

        for (int i = 1; i <= limit; i++) {

            // if the number is divisible by 2 then it is even
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println("\n");

        int fibonacci = 10, first = 0, second = 1, next , i;

        for (i=1; i<fibonacci; i++) {
            if (i <= 1) {
                next = i;
            }
            else {
                next = first + second;
                first = second;
                second = next;
            }
            System.out.print(next + " ");
        }

        System.out.println("\n");


    }
}



        //primitive type of variables
        /*
        byte byteNumber = 126;
        int firstNumber = 1;
        long longNumber = 1L;
        float floatNumber = 3.14f;
        double doubleNumber = 3.23231d;
        char charVariable = 'd';
        boolean booleanVariable = true;
        String stringValue = "This is a String. Okay!";
        */

        /*
        long longNumber2 = 12;

        System.out.println("Test Number: " + longNumber2 ); //long to int
        */

        /*
        System.out.println("Byte Number: " + byteNumber );
        System.out.println("First Number: " + firstNumber );
        System.out.println("Long Number: " + longNumber );
        System.out.println("Float Number: " + floatNumber );
        System.out.println("Double Number: " + doubleNumber );
        System.out.println("Char: " + charVariable );
        System.out.println("Boolean: " + booleanVariable );
        System.out.println("String: " + stringValue );


        System.out.println("\nHello World!");
	    System.out.println("*********************");
        System.out.println("*\t Jeth Ardaba \t*");
        System.out.println("*********************");
        */


        /*//Employee
        Employee firstEmployee = new Employee();

        firstEmployee.setFirstName("Jeth");
        firstEmployee.setDepartment("Programming Department");
        firstEmployee.setPayGrade("16,000");
        firstEmployee.setEmployeeID("101");

        System.out.println("EMPLOYEE NAME: " + firstEmployee.getFirstName());
        System.out.println("DEPARTMENT: " + firstEmployee.getDepartment());
        System.out.println("PAY GRADE: " + firstEmployee.getPayGrade());
        System.out.println("EMPLOYEE ID: " + firstEmployee.getEmployeeID());


        //Customer
        Customer firstCustomer = new Customer("Cyrll","Carungay");

        firstCustomer.setAddress("San Jose, Cebu City");
        firstCustomer.setTelephoneNumber("346-1611");
        firstCustomer.setCustomerID("123");

        System.out.println("\nCUSTOMER NAME: " + firstCustomer.getFirstName() + " " + firstCustomer.getLastName() );
        System.out.println("ADDRESS: " + firstCustomer.getAddress());
        System.out.println("TELEPHONE NUMBER: " + firstCustomer.getTelephoneNumber());
        System.out.println("CUSTOMER ID: " + firstCustomer.getCustomerID());*/

        //One Object
        /*UserClass Person = new UserClass();

        Person.setFirstName("Juan");
        Person.setLastName("Dela Cruz");
        Person.setAge(25);
        Person.setEmail("delacruz.jn@gmail.com");
        Person.setUsername("delacruz.jn");
        Person.setPassword("*********");

        String fName = Person.getFirstName();
        String lName = Person.getLastName();
        String eml = Person.getEmail();
        String uname = Person.getUsername();
        String pword = Person.getPassword();
        int age2 = Person.getAge();

        System.out.println("\n\nFIRST NAME: " + fName);
        System.out.println("LAST NAME: " + lName);
        System.out.println("AGE: " + age2);
        System.out.println("EMAIL: " + eml);
        System.out.println("USERNAME: " + uname);
        System.out.println("PASSWORD: " + pword);

        //Multiple Objects
        UserClass firstPerson = new UserClass();
        UserClass lastPerson = new UserClass();
        UserClass ageNumber = new UserClass();
        UserClass newEmail = new UserClass();
        UserClass uName = new UserClass();
        UserClass pWord = new UserClass();


        firstPerson.setFirstName("Jeth Cyrll");
        lastPerson.setLastName("Ardaba");
        ageNumber.setAge(21);
        newEmail.setEmail("jethardaba@gmail.com");
        uName.setUsername("ardaba.jc");
        pWord.setPassword("***********");

        String firstName = firstPerson.getFirstName();
        String lastName = lastPerson.getLastName();
        String email = newEmail.getEmail();
        String username = uName.getUsername();
        String password = pWord.getPassword();
        int age = ageNumber.getAge();

        System.out.println("\n\nFIRST NAME: " + firstName);
        System.out.println("LAST NAME: " + lastName);
        System.out.println("AGE: " + age);
        System.out.println("EMAIL: " + email);
        System.out.println("USERNAME: " + username);
        System.out.println("PASSWORD: " + password);*/

        //Introduce Yourself
        /*Customer customOne = new Customer("Jeth","Ardaba");
        System.out.println(customOne.introduceYourself("Donald","Pritos"));
        System.out.println(customOne.introduceYourself("Donald","Pritos",21,"Candumnan, Mandaue City."));


        Employee employOne = new Employee();
        System.out.println(employOne.introduceYourself("Kulot", "Ka"));
        System.out.println(employOne.introduceYourself("Kulot","Pritos",23,"Talamban, Cebu City"));
        System.out.println(employOne.introduceYourself("Neil","Agbay",32,"San Jose, Cebu City", " Information Technology(IT)."));
        */


