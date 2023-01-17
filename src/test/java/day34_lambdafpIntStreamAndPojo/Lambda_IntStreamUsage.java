package day34_lambdafpIntStreamAndPojo;

import day32_lambdafp.UtilsClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda_IntStreamUsage {
    public static void main(String[] args) {


        System.out.println(getSumFromSevenToHundred01());
        System.out.println(getSumFromSevenToHundred02());
        System.out.println(getMultiplicationFromTwoToEleven());
        System.out.println(getFactorialValue01(-5));
        System.out.println(sumOfIntsInGivenRange(9, -4));
        System.out.println(sumOfDigitsForTheIntegersInTheGivenRange(23, 32));
    }

    //Create a method to find the sum of the integers from 7 to 100.

    public static int getSumFromSevenToHundred01() {

        return IntStream.range(7, 101).reduce(0, Math::addExact);
    }

    public static int getSumFromSevenToHundred02() {
        return IntStream.rangeClosed(7, 100).reduce(0, Math::addExact);
    }

    //Create a method to find the multiplication of the integers from 2 (inc) to 11(inc)
    public static int getMultiplicationFromTwoToEleven() {
        return IntStream.rangeClosed(2, 11).reduce(1, Math::multiplyExact);
    }

    //Create a method to calculate the factorial of a given number. (5!==>1*2*3*4*5)
//1.way
    public static int getFactorialValue01(int x) {
        if (x > 0) {
            return IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact);
        }
        System.out.println("Do not use negative numbers for factorial operations");
        return 0;
    }

    //2.way
    public static Object getFactorialValue02(int x) {
        return x > 0 ? IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact) : "Do not use negative numbers for factorial operations";
    }

    //Create a method to calculate the sum of even integers between given two integers.

    public static int sumOfIntsInGivenRange(int a, int b) {
        int x = 0;
        if (a > b) {
            x = a;
            a = b;
            b = x;
        }
        return IntStream.rangeClosed(a, b).filter(UtilsClass::checkToBeEven).sum();
    }

    //Create a method to calculate the sum of digits of every integers between two given integers.23 24 25.. 32==> 2+3 2+4..3+2

    public static int sumOfDigitsForTheIntegersInTheGivenRange(int a, int b) {
        int x = 0;
        if (a > b) {
            x = a;
            a = b;
            b = x;


        }
        return IntStream.rangeClosed(a, b).map(UtilsClass::getSumOfDigits).sum();

    }


}









