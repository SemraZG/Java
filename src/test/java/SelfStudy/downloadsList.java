package SelfStudy;

import java.io.File;

public class downloadsList {
    public static void main(String[] args) {

        File downloads= new File("C:/Users/semra/Downloads");

        File [] files= downloads.listFiles();

        for (File w: files){
            System.out.println(w.getName());
        }
        
    }
}
