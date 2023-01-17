package day17_Lists;

import java.util.*;

public class Lists02 {
    public static void main(String[] args) {

        List<Integer> a= new ArrayList<>();
        a.add(12);
        a.add(15);
        a.add(10);
        a.add(21);

        Collections.sort(a);
        System.out.println(a);

        int minDiff= Integer.MAX_VALUE;
        for (int i=1;i<a.size(); i++){
           minDiff= Math.min(minDiff, a.get(i) - a.get(i-1));
        }
        System.out.println(minDiff);













    }
}
