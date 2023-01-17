package SelfStudy;

import java.util.Scanner;

public class SelfStudyDoWhile {
    public static void main(String[] args) {

        /*
        int k=1;
        do{
            System.out.println("do while");     =======================> do while loop
            k++;
        }while(k<1);


        int i=1;
        while(i<1) {
            System.out.println("while loop");    =======================>while loop
            i++;
        }


        Scanner input = new Scanner(System.in);
        int s=0;

        do {
            System.out.println("bie sayı giriniz");
          s= input.nextInt();


        }while(s>=10);
        System.out.println("kazandınız"); */


        Scanner input = new Scanner(System.in);
        System.out.println("enter the row");
        int s=input.nextInt();

        for (int i=1; i<=s; i++){
            for (int k=s-1; k>=i; k--){
                System.out.print(" ");
            }
            for (int m=1; m<=i; m++){
                System.out.print("* ");
            }
            System.out.println();
        }



















    }
}
