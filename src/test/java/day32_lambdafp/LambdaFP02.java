package day32_lambdafp;

import java.util.ArrayList;
import java.util.List;

public class LambdaFP02 {
    /*
        1) "variable or variables"==> "logic" ==> this structure is called "Lambda Expression"

        2) In Functional Programing, we can use "lambda Expression", it is allowed but not recommended.
        Instead of "Lambda Expression", we prefer "method reference".

        3)"method reference" is Class Name::Method Name".
        for exp; "String :: length" (Do not type method paranthesis, type just method name
                   "Arrays :: toString"
        You can use your oen class to create the required methods for your application.
        for exp; you created "Animal" class and you have eat() in animal class ==> "Animal :: eat"
     */
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        printEvenElementsStructured(l);
        System.out.println();
        printSquareOfOddElements(l);
    }

    //Create a method to print the even elements in the list on the console in the same line with a space
    //between two consecutive elements. (Structered P)

    public static void printEvenElementsStructured(List<Integer> list){
        list.stream().forEach(UtilsClass::printInTheSameLinaWithASpace);
    }
    //Create a method to print the square off odd list elements on the console in the same line with a space between two consecutive elements.
    public static void printSquareOfOddElements(List<Integer> list){
        list.stream().filter(UtilsClass::checkToBeOdd).map(UtilsClass::getSquare).forEach(UtilsClass::printInTheSameLinaWithASpace);

    }


























}
