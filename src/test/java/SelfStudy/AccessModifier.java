package SelfStudy;

public class AccessModifier {

    public String stdName="Tom Hanks";
    protected String address="Miami";
    //default String email ="th@gmail.com";-->default yapacaksak default u yazmayız, yazarsask error verir
    String email ="th@gmail.com";//Hicbir sey yazmazsak default demektir Access Moditierı.
    private String stdId= "1234";

    //public: her yerden farklı package lerden bile ulaşılabilir.
    //protected: farklı package lerden ancak inheritance varsa ulaşılabilir,
                //inheritance yoksa aynı package daki classlar arsında ulaşılabilir.
    //default(package private): başka packagelerden kullanılamaz, aynı package daki classlar arasında ulaşılabilir.
    //private: sadece bulunduğu class içinde ulaşıbilirdir.

    //Access Modifier ları sıralayınız
    // public > protected > default > private

   /*
   Protected ile default un farkı nedir?
   protected: farklı package lerden ancak inheritance varsa ulaşılabilir,
   inheritance yoksa aynı package daki classlar arasında ulaşılabilir.
   default ise başka packagelerden kullanılamaz,
   sadece aynı package daki classlar arasında ulaşılabilir.
   defoult a aynı zmanda package private da denilir.
    */

/*
Class lar için hangi Access Modifier lar kullanılabilir?
public veya default kullanılabilir, default için zaten hiçbirşey yazmayacaktık.
 */

    //METHOD NASIL OLUTURULUR:-->Acccess Mod.+return type+method name+()+{}
    public void eat(){
        System.out.println("Animals eat...");
    }










}
