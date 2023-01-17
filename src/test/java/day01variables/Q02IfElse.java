package day01variables;

import java.util.Scanner;

public class Q02IfElse {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        double height= 1.20;
        double squrareOfHeight= height*height;

        double weight= 10.50;
        double bodyMassIndex= weight/squrareOfHeight;
        System.out.println("ıbm:" + bodyMassIndex);

        if(bodyMassIndex<18.5){
            System.out.println("weak");
        }else if(bodyMassIndex>=18.5 && bodyMassIndex<=25){
            System.out.println("ideal");
        }else if(bodyMassIndex>25 && bodyMassIndex<=30){
            System.out.println("fat");
        }else if(bodyMassIndex>30) {
            System.out.println("obese");


        }
    }
}
