package day13_Arrays;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;

public class Arrays02 {
    public static void main(String[] args) {

     String cities[]= new String[5];


        cities[0]= "Tokyo";
        cities[1]= "Berlin";
        cities[2]= "Istanbul";
        cities[3]= "JacksonVille";
        cities[4]= "Calgary";

        System.out.println(Arrays.toString(cities));

        Arrays.sort(cities);
        System.out.println(Arrays.toString(cities));

        for (String w: cities){

            System.out.println(w);
        }


        String names[]={"ali", "thomas", "mark", "jackson", "tom", "martin"};
        System.out.println(Arrays.toString(names));
        for (String w: names){
            if (w.length()<5){
                System.out.println(w);
            }

        }

        String student[]= {"Ali", "aisha", "janet", "tom", "john"};
        for (String w: student){
            if(w.equals("tom")){
                break;
            }
            System.out.print(w +" ");
        }

        for (String w: student){
            System.out.println(w);
            if (w.equals("tom")){

                continue;
            }

            System.out.println(w);
        }

    String employee[]= {"Ali", "aisha", "janet", "tom", "john", "michael", "susan"};

        for (String w: employee){
            if (w.equals("tom")){
                continue;
            }
            System.out.println(w);
        }














    }
}
