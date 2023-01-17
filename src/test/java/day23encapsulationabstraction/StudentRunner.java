package day23encapsulationabstraction;



public class StudentRunner {
    public static void main(String[] args) {

          /*
        Encapsulation;
        Encapsulation is "data hiding".
        To hide a data we make the access modifier "private".
        After "hiding data", you may need to "read" or "update" the data.
        To "read" or "update" the data we will create some methods.
        To "read" "Encapsulation data" you should create "get()" methods, we name it "getters".
        To "update" "Encapsulation data" you should create "set()" methods, we name it "setters".

        "get" and "set" methods are called "Java Beans".


         */

        Student std= new Student();
        std.setDisease("cancer");

        System.out.println( std.getDisease());

        std.setStdGpa(4.8);
        System.out.println(std.getStdGpa());






    }
}
