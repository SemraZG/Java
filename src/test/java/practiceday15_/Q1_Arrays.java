package practiceday15_;

import java.util.Arrays;

public class Q1_Arrays {
    public static void main(String[] args) {

   String str[]= {"Ellie", "Susan", "George", "George", "Tom"};

   String name= "George";
   int counter=0;
   for (String w: str){
       if (w.equals(name)){
    counter++;
       }
   }

    if (counter>0){
        System.out.println(name);
    }else{
        System.out.println("tehere is no");
    }

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        int idx=Arrays.binarySearch(str, "George");
        System.out.println(idx);
        int ids=Arrays.binarySearch(str, "Ali");
        System.out.println(ids);
        int idm=Arrays.binarySearch(str, "Sally");
        System.out.println(idm);















    }
}
