package SelfStudy;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
    /*
    Java-->Structural Programing--All codes, How to do
    Lambda-->Functional Programing-->Collections, Arrays, Lists, What to do
     */
    public static void main(String[] args) {
        List<Integer> l= new ArrayList<>();
        l.add(12);
        l.add(9);
        l.add(13);
        l.add(4);
        l.add(9);
        l.add(2);
        l.add(4);
        l.add(12);
        l.add(15);

        l.stream().forEach(t-> System.out.print(t+" "));
        //distinct() method, removes repeated ones.
        //reduce() method,















    }
}
