package SelfStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SelfStudyForLoop {
    public static void main(String[] args) {

       /* String s="Tom Hanks";

        String reserved= "";

        for (int i=s.length()-1; i>=0; i--){

            reserved= reserved+ s.charAt(i);

        }
        System.out.println(reserved);






        Scanner input = new Scanner(System.in);
        System.out.println("enter a number for row");
        int row= input.nextInt();
        System.out.println("enter a number for column");


        int column= input.nextInt();

        for (int i=1; i<=row; i++){
            for (int k=1; k<=column; k++){
                System.out.print("*");
            }
            System.out.println();
        }*/


    /*Scanner input= new Scanner(System.in);
        System.out.println("Enter a digit smaller than 100");
        int digit=input.nextInt();
        boolean a,b;
        String x="", y= "Java", z= "Güzeldir";
        if (digit<100 && digit>0) {

            for (int i = 1; i <digit; i++) {
............................................................          YAPAMADIM             ...............
                a= digit%3==0;
                b=digit%5==0;
                if (a&&b){
                    x=y+z;
                }else if (a){
                    x=y;
                }else if (b){
                    x=z;
                }else{
                    x=digit +"";
                    System.out.println(x);
                }

            }

            }else{
            System.out.println("Digit should be smaller than 100 and bigger than 0");

        }


        Scanner input= new Scanner(System.in);
        System.out.println("Enter a name");
        String name= input.nextLine();
        String reserved= "";

        for (int i=name.length()-1; i>=0; i--){

            reserved= reserved+name.charAt(i);
        }
        System.out.println(reserved);


        Scanner input= new Scanner(System.in);
        System.out.println("Enter a name");
        String name= input.nextLine();
        String reserved= "";
        for (int i=name.length()-1; i>=0; i--){
            reserved+=name.charAt(i);

        }

        if (reserved.equalsIgnoreCase(name)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not palindrome");
        }

         */


        Scanner input= new Scanner(System.in);
        System.out.println("Enter first digit");
        int first=input.nextInt();
        System.out.println("Enter second digit");
        int second= input.nextInt();
        int empty=0;
        if (first < second) {try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

            for (int i=first; i<=second; i++){
               empty+=i;
            }
            System.out.println(empty);
        }else{
            for (int i=first; i>=second; i--){
                empty+=i;
            }
            System.out.println(empty);
        }



























    }

}
