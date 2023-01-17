package practiceday15_;

import java.util.Arrays;
import java.util.Scanner;

public class Q02_Arrays_MinandMaxValue {
    public static void main(String[] args) {

        int arr[]={23, 12, 34, 10, 78, 19};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        int minValue= arr[0];
        int maxValue= arr[5];
        System.out.println( minValue+maxValue);


        Scanner input= new Scanner(System.in);
        System.out.println("enter the number of employees ");


        int length= input.nextInt();
        String arrEmployee[]=new String[length];
        for (int i=0; i<length; i++){
            System.out.println("enter" + (i+1) +". employee name.");
            String employeesNamrs= input.next();
            if (!employeesNamrs.equals("Q")){
                arrEmployee[i]=employeesNamrs;
            }else{
                break;
            }
        }

        System.out.println(Arrays.toString(arrEmployee));









    }
}
