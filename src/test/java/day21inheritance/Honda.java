package day21inheritance;



public class Honda extends Car {
    public void hondaMake(){
        System.out.println("this car was made in Honda Factory ");
    }
    public Honda(){
        System.out.println("Honda class constuctor 1");
    }

    public Honda(boolean isNew){
        super("Hybrid");
        if (isNew){
            System.out.println("Brand new");
        }else{
            System.out.println("Used");
        }
    }

}
