package day19_Practice;

import day20accessmodifiersinheritance.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q01_TernaryPractice {
    public static void main(String[] args) {

        //Ask user to enter an integer and print "even" on the console for even integers, increase the value by 3
        //for odd integers and print it on the console by using ternary.

       /* Scanner input= new Scanner(System.in);
        System.out.println("enter an integer");
        int num=input.nextInt();
        System.out.println( num%2 == 0 ? "Even" : num + 3);



        /*
         * Type code to find the common elements between two String Arrays
         * (without case sensitivity)
         * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
         * Output : [brad,sofia,emily]
         */
    //1.way
       /* List<Integer> al= new ArrayList<>();
        al.add(24);
                                                        // 1.way result and 2. way result are same.
        //2.way
        ArrayList<Integer> bl= new ArrayList<>();
        bl.add(24);*/

        String [] arr= {"John","Brad","Angel","Sofia","Emily" };
        String[] brr= {"sofia","brad","grace","emily","hazel"};

        List<String > list= new ArrayList<>();

        for (String w: arr){

            for (String u: brr){
                if (w.equalsIgnoreCase(u)){
                    list.add(u);
                }
            }
        }
        System.out.println(list);















    }
}
