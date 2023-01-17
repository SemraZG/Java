package day11;



public class Runner {
    public static void main(String[] args) {

        Car audi= new Car();
        System.out.println(audi.model);
        Car bmw=new Car("BMW", "c300", 2023, 605000);
        System.out.println(bmw.make);

        Car mercedes= new Car("mercedes", "d400", 2020, 50000);
        System.out.println(mercedes.year);
        System.out.println(bmw.price);


        Car itcar=new Car("rolls royse", "h88", 2020);
        System.out.println(itcar.price);


        Static01 obj1= new Static01();
        Static01 obj2= new Static01();
        Static01 obj3= new Static01();
        System.out.println(obj3.b);
        System.out.println(obj3.a);
    }
}
