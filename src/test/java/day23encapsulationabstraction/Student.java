package day23encapsulationabstraction;

public class Student {


    String name= "Tom Hanks ";
    private String stdId= "TH123";

    private double stdGpa= 3.8;


    public String getStdId() {
        return stdId;
    }

    private boolean Successful= false;
    private String disease= "Heart Disease";

    public double getStdGpa() {
        return stdGpa;
    }

    public String getDisease(){
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public boolean isSuccessful() {
        return Successful;
    }
    // Note: Is the data types is boolean, get method name starts with "is". In other data types get method name starts with "get".


    public void setStdGpa(double gpa){
        this.stdGpa= gpa;
    }

    public void setSuccessful(boolean successful) {
        Successful = successful;
    }

    //Even the data type is boolean we use "set" at the beginning of the name.

    public static void main(String[] args) {




    }
}
