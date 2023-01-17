package day15multidimensionalarrayLists;

import java.util.Arrays;

public class MultiDimensional {
    public static void main(String[] args) {

        String brr[][]=new String[3][4];
        System.out.println(Arrays.deepToString(brr));

        String crr[][]= {{"tom", "Jim"}, {"Angie"}, {"Carl", "Chris", "ali"}};
        System.out.println(Arrays.deepToString(crr));
        System.out.println(crr[2][1]);
        System.out.println(Arrays.deepToString(crr[0]));

        int srr[][]={{12, 54},{3,2,7},{21}};
        int sum=0;
        for (int[] w: srr){
            for (int u: w){
               sum=sum+u;
            }
        }
        System.out.println(sum);


















    }
}
