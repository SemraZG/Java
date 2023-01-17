package day23_Practice;

public class Q03_CalculateOfCube {
    //Create a method to calculate of cube, square prism and rectangular prism.
    public double volumeOfCube(double a){//a*a*a ==> gives you the required outcome.Only one edge lenght is enough to calculate.
        return a*a*a;

    }
    public static double volumeOfSquarePrism(double a, double b){//a*a*b
        return a*a*b;

    }
    public static double volumeOfRectangularPrism(double a, double b, double c){
        return a*b*c;
    }
}
