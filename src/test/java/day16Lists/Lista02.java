package day16Lists;

import java.util.ArrayList;
import java.util.List;

public class Lista02 {
    public static void main(String[] args) {

    //["shoes", "tv", "radio", "laptop", "shoes", "book", "shoes"]

        List<String> a= new ArrayList<>();
    a.add("shoes");
        a.add("tv");
        a.add("radio");
        a.add("laptop");
        a.add("shoes");
        a.add("book");
        a.add("shoes");
        System.out.println(a);

        a.remove("shoes");
        System.out.println(a);
        List<String> b= new ArrayList<>();
        b.add("shoes");

        a.removeAll(b);
        System.out.println(a);

        List<String> c= new ArrayList<>();
        c.add("shoes");
        c.add("tv");
        c.add("radio");
        c.add("laptop");
        c.add("shoes");
        c.add("book");
        c.add("shoes");

        c.remove(4);
        c.remove(0);

        System.out.println(c);


        List<Integer> x= new ArrayList<>();
        x.add(12);
        x.add(4);
        x.add(13);
        x.add(25);
        x.add(432);

        x.remove(3);
        System.out.println(x);

        x.remove(Integer.valueOf(432));
        System.out.println(x);

        List<Double> g= new ArrayList<>();
        g.add(12.99);
        g.add(5.02);
        g.add(11.23);

        boolean isExist= g.contains(5.02);
        System.out.println(isExist);


        g.set(1, 9.99);
        System.out.println(g);


        List<Double> y= new ArrayList<>();
        y.add(5000.0);
        y.add(6000.0);
        y.add(4500.0);
        y.add(3900.0);
        y.add(7200.0);

        for (int i=0; i<y.size(); i++){
            y.set(i, y.get(i)*1.1);

        }
        System.out.println(y);

        List<Character> m= new ArrayList<>();

        m.add('x');
        m.add('y');
        m.add('q');


        List<Character> n= new ArrayList<>();

        n.add('x');
        n.add('y');
        n.add('z');

        if (m.equals(n)){
            System.out.println("the lists are same");
        }else{
            System.out.println("the lists are not same");
        }

        List<Integer> p= new ArrayList<>();
        p.add(12);
        p.add(23);
        p.add(32);
        p.add(14);
        p.add(24);
        p.add(56);

        List<Integer> q= new ArrayList<>();
        q.add(20);
        q.add(56);
        q.add(24);

        boolean areEsixt= p.containsAll(q);
        System.out.println(areEsixt);






    }
}
