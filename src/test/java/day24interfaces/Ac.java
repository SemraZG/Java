package day24interfaces;

public interface Ac {


    /*
    1) An interface cannot have "concrete method".
    2) All methods in an interface are "public" and "abstract"(abstract= there is no body, for exp:public void digital();) as default.
     Because of that even you do not declare the methods "public" and "abstract", they will be abstract and public.
    "public abstract void digital();" = "void digital();"

    3) If parent interfaces have methods with the same name, overriding just one of them will be enough.
    4) Parent interfaces cannot have methods with the same name and the different return types.
    If you do that, Java will give you compile time error.
    5) variables in interfaces are publşc and static and final
    public static final int price=23; = int price=23;
    6) Variables in interfaces are static default, therefore no need to create object to access variables in interfaces.
    7) whenever you need to call any variable use "interface name" to call

    To create concrete method in an interface you have 2 options.
    Use "default" or use "static" keyword

    public default int calculate(){
    return 1200;
    }

    public static boolean climate(){
    return true;
    }

     */

    public void digital();

void price();


}






