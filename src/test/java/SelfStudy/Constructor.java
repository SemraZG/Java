package SelfStudy;

public class Constructor {
    //for exp: Cat classs ında bir cat objesi nasıl oluşturulur--> Cat cat1= new Cat();
    //Constuctor--> public Mammal(){},
    // Method   --> public void eat(){}

    /*
    1)Javada object oluştururken construclar parentdan child e doğru calışır.
    2)Javada parentdaki constructor super() kodu ile çağrılır.
    3)super() kodu her constructor ın ilk satırında gizli olarak bulunur.


    public Student(){

    }


   Bir class oluşturduğumuzda java otomatik olarak görünmez bir contructor verir.
   Çünkü java, class ın bir kalıp olduğunu ve obje oluşturmak için yaratıldığını,
   ve obje oluşturmak için constructor ın şart olduğunu bilir.
   Javanın otomotik olulturduğu ve görünmez olan bu constructor ın adı default contructor dır.
   Kendimiz bir constructor olulturduğumuzda java default conts. siler ve yazdığımız conts. aktif eder.
   Bir classda birden fazla conts. olabilir ama parametreleri farklı olmalıdır.
   for exp: public Honda(){}, public Honda(int price){}, public Honda(int price, int year){}
   Yukarıdaki örnekte aynı classda üç farklı conts. oluşturduk.

     */

}
