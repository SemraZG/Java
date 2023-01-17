package day19_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02_ConvertingEleInAList {
    public static void main(String[] args) {

        /*
   If the list has 15 as element, change all 15s to 51
   Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)
   */

        List<Integer> list= Arrays.asList(12,11,15,34,43);   // === >  1.way to create List object

        Integer[] arr= { 12,11,15,34,43};                   // === >  2.way to create List object

        ArrayList<Integer> a = new ArrayList<>();           // === >  2.way to create List object
        a.add(12);
        a.add(11);
        a.add(15);
        a.add(34);
        a.add(43);

        System.out.println(list);                //[12, 11, 15, 34, 43]
        System.out.println(Arrays.toString(arr));//[12, 11, 15, 34, 43]
        System.out.println(a);                   //[12, 11, 15, 34, 43]


        if (list.contains(15)){
            for (int w: list){
                if (w==15){
                    list.set(list.indexOf(15), 51);
                }
            }
        }else{
            System.out.println("list does not contain the expected element");
        }
        System.out.println(list);

























    }
}
