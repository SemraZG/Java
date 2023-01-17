package SelfStudy;

public class StringBuilder {
    public StringBuilder(String java) {
    }

    /*
        1) StringBuilder Javada bir classtır.
        2) StringBuilder String oluşturmaya yarar.
        3) String Class varken neden StringBuilder a ihtiyaç duyarız?
            Çünkü String Class "Immutable Class" dır, ama biz bazen "Mutable" Stringlere ihtiyaç duyarız.
            StringBuilder bize "Mutable" String verir.
        4) String Class ların immutable özellikleri güvenlik için önmelidir ve gereklidir.
        Aynı değere sahip birden fazla String olduğunda Java bir tane container oluşturur ve aynı değere sahip Stringlerin bu containeri kullanmasını temin eder.
        Bu memory kullanımı için iyidir.
        Ancak containerdaki değeri birisi için değiştirdiğimizde diğerlerininki de değişmesi tehlikesi vardır.
        Bu sebeple Java Stringleri immutable(değişmez) yapmıştır, herhangi bir variable değiştirilmek istendiğinde o variable için java yeni ibr container oluşturur.
        Böylelikle hem değişim sağlanmış olur hem de diğer değerler korunmuş olur.
         */
    public static void main(String[] args) {
        String str= "Java";
        str= "Super Java";//-->burada Java heap memoryde yeni bir kap oluşturur,
                        //"Super Java"yı yeni kabın içine koyar, stack memorydeki "Java"nın adresini/referansını yeni kaba yönlendirir.

        StringBuilder strb= new StringBuilder("Java");
        strb= new StringBuilder("Super Java");//-->burada ise Java, yeni kap oluşturmaz, "Java"nın kabının içine direk "Super Java"yı koyar.

//StringBuilder nasıl oluşturulur:
        //1.way
        StringBuilder strc= new StringBuilder("Java");
        //2.way





    }

}
