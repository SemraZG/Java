package day13_Arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        String names[]= new String[5];
        System.out.println(Arrays.toString(names));

        names[1]="tom";

        System.out.println(Arrays.toString(names));


    int ages[]=new int[7];
        System.out.println(Arrays.toString(ages));

        ages[6]=12;
        ages[0]=12;
        System.out.println(ages[0] + ages[ages.length-1]);

        double digits[]= new double[4];
        digits[0]=1.2;
        digits[1]=2.3;
        digits[2]=5.0;
        digits[3]=4.51;
        System.out.println(Arrays.toString(digits));

        double sum=0;
        for(int i=0; i<=digits.length-1; i++){
            sum= sum+digits[i];

        }
        System.out.println(sum);

        double sumUp=0;

        for (double w: digits){
            sumUp= sumUp+w;
        }
        System.out.println(sumUp);




















    }
}
