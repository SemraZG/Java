package day01variables;

import java.util.Scanner;

public class Q01_SwithCases {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a character");

        char c= input.next().toLowerCase().charAt(0);

        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'r':
            case 't':
            case 'v':
            case 'w':
            case 'y':
            case 'z':
            case 'x':
            case 'q':
                System.out.println("not vowel");
                break;
            default:
                System.out.println("enter a letter");
        }














    }
}
