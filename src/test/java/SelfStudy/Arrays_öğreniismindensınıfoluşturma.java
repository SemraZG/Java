package SelfStudy;

import java.util.Scanner;

public class Arrays_öğreniismindensınıfoluşturma {
    public static void main(String[] args) {

 /*       //Çoklu datayı defolayabildiğimiz conteynırlar vardır, bunlardan biri de Arrays dir.
        //Array oluştururken başta kaç elemanlı olduğunu belirtmek zorundayız.
        //Arrayı (her data tipindeki Arrayi yazdırmak için aynı) yazdırmak için sout un içine Arrays.toString() methodunu yazıyoruz,
        // içteki patantezin içine de Arrayin ismini yazıyoruz.

    int stdAges []= new int [7];
        stdAges [0]=12;
        stdAges [1]=11;
        stdAges [2]=13;
        stdAges [3]=14;
        stdAges [4]=10;
        stdAges [5]=12;
        stdAges [6]=12;

        System.out.println(stdAges[4]);//4. indexdedi Array elemanını yazdır
        System.out.println(stdAges.length-1);//son indexdeki Arrayi verir.
        System.out.println(stdAges[0]);//Arraydeki ilk elemanı verir.

        //stdAges Arraydeki tüm elemanların toplamını yazdıran kodu yazınız.


        //1.way
        int sum=0;
    for (int i=0; i<stdAges.length; i++){
    sum=sum+stdAges[i];
}
        System.out.println(sum);


    //2.way
        int sum2=0;
    int i=0;
    while (i<stdAges.length){
        sum2= sum2+stdAges[i];
        i++;
    }
        System.out.println(sum2);


//3.way

        int t=0;
for (int w: stdAges){
    t=t+w;
}
        System.out.println(t);



        //String Array oluşturup 5 isim ekleyin, isimlerdeki karakter sayılarını toplayın.

        //1.way
        String s[]= {"Ali", "Tom", "Veli", "Kemal", "Cem"};//veya; String s[]=new String[5];
        System.out.println(java.util.Arrays.toString(s));

        int sum= s[0].length()+s[1].length()+s[2].length()+s[3].length()+s[4].length();
        System.out.println(sum);

        //2.way

        int sum2=0;
        for (String w: s){
            sum2=sum2+w.length();
        }
        System.out.println(sum2);


  // Char bir Array oluşturun ve 5 eleman ekle, Arraydeki büyük harfleri yazdır.

  char ch[]= {'A', 'c', 'D', 'k', 'm'};

  for (char w: ch){
      if (w>='A'&&w<='Z'){
          System.out.print(w+" ");//A D
      }
  }

        //String bir Array oluştur ve Tom ve ondan önceki elemanları yazdırın.

        String arr[]={"jane", "Mark", "Ali", "Tom", "Rojda"};
        System.out.println(java.util.Arrays.toString(arr));//[jane, Mark, Ali, Tom, Rojda]
        for (String w: arr){
            System.out.print(w+" ");
            if (w.equals("Tom")){
                break;
            }
        }//jane Mark Ali Tom


        //String bir Array oluştur ve Tom ve jane haric diğer elemanları yazdırın.
        String arr[]={"jane", "Mark", "Ali", "Tom", "Rojda"};
        for (String w: arr){
            if (w.equals("Tom") || w.equals("jane")){
                continue;
            }
            System.out.print(w+" ");//Mark Ali Rojda
        }
  */
        //Kullanıcı ile beraber Array oluşturun
        //Bir öğretmenin sınıfındaki öğrencilerin isimlerini application a yükleyen kodu yazın.

        Scanner input= new Scanner(System.in);
        System.out.println("How many students will you enter?");
        int stdNum= input.nextInt();
        String names[]=new String[stdNum];

        for (int i=1; i<=stdNum;i++){
            System.out.println("Enter the "+ i+ ". student's name ");

            names[i-1]=input.next();
            System.out.println("Girişi sonlandırmak için Q harfine basınız, devam etmek için herhangi bir tuşa basın");
            char exit= input.next().charAt(0);
            if (exit=='Q'|| exit=='q'){
                break;
            }
        }
        System.out.println(java.util.Arrays.toString(names));












    }
}
