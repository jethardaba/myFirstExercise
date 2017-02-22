package com.JethArdaba.classes;

/**
 * Created by JPMC on 2/20/2017.
 */
public class StaticMethods {
    public static int myTotal(int myNum) {

        int sum = 0;

        for (int i = 1; i <= myNum; i++ ) {
            sum += i;
        }
        return sum;
    }
  }
