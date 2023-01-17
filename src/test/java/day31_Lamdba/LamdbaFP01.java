package day31_Lamdba;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LamdbaFP01 {
     /*
    The Lambda expression is used to provide the implementation of an interface which has functional interface.
    It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing
     the implementation.
     A lambda expression is a short block of code which takes in parameters and returns a value.
     Lambda expressions are similar to methods, but they do not need a name and they can be implemented
     right in the body of a method.
     functional programming is called lambda . To type codes in functional programming is shorter and it is error free.
     In functional programming, we use the methods that were created by Java.
     The usage of structured programing is a longer way to type codes in Java.
     For ex; substring() is created by Java it is error free bec it was created by Java which means that it was tested
     thousands of times before it was deployed. Functioanl programming can be used for arrays, collections and maps
     but we cannot use maps directly in functional programmine directly. At the beginnig we should convert a map to a
     collection and then we can use maps for functional programming as weel ==>How to convert a map into a collection??

      by using entryset() we can convert a map into a set and set is collection then you can use Collections in functional programming.
     */


    public static void main(String[] args) {
        List<Integer> l= new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        //Create a method to print the elements on the console in the same line with a space
        //between two consecutive elements. (Structered P)

        printEvenElementsStructured(l);
        System.out.println();
        printEvenElementsFunctional(l);
        System.out.println();
        printSquareOfOddElements(l);
        System.out.println();
        printCubeDistinctOddElements(l);
        System.out.println();
        sumOfSquaresOfDistinctEvenElements(l);
        System.out.println();
        productOfCubesOfDistinctEvenElements(l);
        System.out.println();
        maxValueElements01(l);
        System.out.println();
        maxValueElements02(l);
        System.out.println();
        minValueElements(l);



    }

//Create a method to print the even elements in the list on the console in the same line with a space
//between two consecutive elements. (Structered P)
public static void printEvenElementsStructured(List<Integer> list){
        for (Integer w: list){
            if (w%2==0){
                System.out.print(w+ " ");
            }
        }
}
public static void printEvenElementsFunctional(List<Integer> list){
        list.stream().filter(t-> t%2==0).forEach(t-> System.out.print(t+ " "));
}

//Create a method to print the square off odd list elements on the console in the same line with a space between two consecutive elements.
    public static void printSquareOfOddElements(List<Integer> list){
        list.stream().filter(t-> t%2!=0).map(t-> t*t).forEach(t-> System.out.print(t + " "));
    }

    //Create a method to print the cube of distinct odd list elements on the console in the same line with a space
    //between consecutive elements.
    public static void printCubeDistinctOddElements(List<Integer>list){
        list.stream().distinct().filter(t-> t%2!=0).map(t-> t*t*t).forEach(t-> System.out.print(t + " "));
    }

    //Create a method to calculate the sum of the squares of distinct even elements

    public static void sumOfSquaresOfDistinctEvenElements(List<Integer>list){
        Integer sum=list.stream().distinct().filter(t-> t%2==0).map(t-> t*t).reduce(0, (t, u)-> t+u);
        System.out.println(sum);
    }

    //Create a method to calculate the product of the cubes of distinct even elements

    public static void productOfCubesOfDistinctEvenElements(List<Integer>list){
        Integer product= list.stream().distinct().filter(t-> t%2==0).map(t-> t*t*t).reduce(1, (t, u)-> t*u);
        System.out.println(product);
    }

    //Create a method to find the max value from the list elements
//1.way:
public static void maxValueElements01(List<Integer>list){
        Integer max= list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u)-> t>u ? t : u);
        System.out.println(max);//131
    }
    //2.way: this way is sorter.
    public static void maxValueElements02(List<Integer> list){
        Integer max= list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u)-> u);
        //sorted() method always puts the elements in acsending order
        System.out.println(max);//131
    }

    //Create a method to find the min value from the list elements (in 2 ways)

    public static void minValueElements(List<Integer> list){

        Integer min = list.stream().distinct().reduce(Integer.MAX_VALUE,(t,u)->u<t ? u : t);
        System.out.println(min);
    }
    //2.Way
    public static void getMinimumElement02(List<Integer> list1){
        Optional<Integer> min = list1.stream().distinct().sorted().findFirst();
        System.out.println(min);
    }
}

