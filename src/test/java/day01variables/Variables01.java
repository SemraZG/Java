package day01variables;

import java.sql.SQLOutput;

public class Variables01 {
    public static void main(String[] args) {
          int a =32;
          double priceOfShirt = 1.99;
          long  vari =9223372036854755809l;
        System.out.println(vari);

        // example 1: create an integer variable, and 2 double variables then print their sum on the console
        int anIntegerVariable = 127;
        double doubleVariable1 =21.2121;
        double doubleVariable2 =42.4242;
        double sum=anIntegerVariable+doubleVariable1+doubleVariable2;
        System.out.println("a sum of variable :"+sum);
        System.out.println("a sum of variable :"+(anIntegerVariable+doubleVariable1+doubleVariable2));
        // example 2 : create 2 float variables 3 short variables 2 double variables and print theri sum on the console
        float f1=1222.2222f;
        float f2=3;
    }
}
