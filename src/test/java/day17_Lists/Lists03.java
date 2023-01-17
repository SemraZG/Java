package day17_Lists;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {
    public static void main(String[] args) {
        //type code to increase the value of every element by 3 expect 7.

        List<Integer> a = new ArrayList<>();
        a.add(11);
        a.add(33);
        a.add(22);
        a.add(7);
        a.add(15);
        a.add(11);

        for (Integer w : a) {
            if (w == 7) {
                continue;
            }
            a.set(a.indexOf(w), w + 3);

        }
        System.out.println(a);

        // Exp: convert all elements to "*" expect the last elements.


        List<String> b = new ArrayList<>();
        b.add("11");
        b.add("31");
        b.add("22");
        b.add("17");
        b.add("31");
        b.add("21");
        b.add("67");

        for (int i = 0; i < b.size()-4; i++) {

            b.set(i, "*");

        }
        System.out.println(b);
















    }
}
