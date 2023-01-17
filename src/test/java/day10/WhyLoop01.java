package day10;

import java.util.Scanner;

public class WhyLoop01 {
    public static void main(String[] args) {


      /*int a=3;
      while (a<7){
          System.out.print(a+ " ");
          a++;
      }

        int m=12;
        int sum=0;
        while (m<68){
            sum= sum+m;
            m++;
        }
        System.out.println(sum);

        Scanner input= new Scanner(System.in);
        System.out.println("enter a ınt");

        int num=input.nextInt();
        int sumOfDigits= 0;

        while (num>0){
            sumOfDigits=sumOfDigits + num%10;
            num=num/10;
        }
        System.out.println(sumOfDigits);*/


        Scanner input= new Scanner(System.in);
        System.out.println("enter a ınt");

        int n=input.nextInt();
        int p= 1;
        while(p<11){
            System.out.println(n+ "x" + p +"="+ n*p);
            p++;
        }






    }
}
