package day10;

import java.util.Scanner;

public class NestedLoops01 {
    public static void main(String[] args) {



       /* for(int i=1; i<13; i++){
            System.out.println("ay" + i);
            for(int k=1; k<5; k++){
                System.out.println("week" + k);
            }
        }

        Scanner input= new Scanner(System.in);

        System.out.println("enter the number of the rows");

        int row=input.nextInt();
        System.out.println("enter he number of the columns");
        int column= input.nextInt();
        for (int i=1; i<=row; i++){
            for (int k=1; k<= column; k++){
                System.out.print("*");
            }
            System.out.println();
 }*/
        Scanner input= new Scanner(System.in);
        System.out.print("enter yhe num of the rows");
        int numOfRow= input.nextInt();
        for (int i=1;i<=numOfRow; i++){
            for (int k= 1; k<=numOfRow; k++){
                System.out.print(k);
            }
            System.out.println();




        }



















    }
}
