
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static ArrayList<Integer> icerık = new ArrayList<Integer>();
    public static void dosyaOku() {
        try {
            FileInputStream in = new FileInputStream("Reynmen Leila.mp3");
            
            int oku;
            
            while((oku = in.read()) != -1){
                icerık.add(oku);
            }
            
             } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
    
    public static void Kopyala(String dosyaismi){
        try {
            FileOutputStream out = new FileOutputStream(dosyaismi);
            
            for(int değer : icerık){
                out.write(değer);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    public static void resimOku(){
        try {
            FileInputStream a = new FileInputStream("Folder.jpg");
            
            int o;
            
            while((o = a.read())!= -1){
                icerık.add(o);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void resimKopyala(String dosyaad){
        try {
            FileOutputStream t = new FileOutputStream(dosyaad);
            
            for(int d : icerık){
                t.write(d);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****************************");
        String işlemler = "1. Mp3 Kopyala\n"
                         +"q. Uygulamadan Çık\n"
                         +"2. Resim Kopyala";
        System.out.println(işlemler);
        System.out.println("*****************************");
        while (true) {            
            System.out.println("Kopyalama Programına Hoşgeldiniz");
            System.out.print("İşlemi Seçiniz : ");
            String işlem = scanner.nextLine();
            if (işlem.equals("q")) {
                break;
            }
            else if (işlem.equals("1")){
             dosyaOku();
                if (true) {
                    System.out.print("Kopyalamak istediğiniz dosyanın adı ne olsun : ");
                    String ad = scanner.nextLine();
                    Kopyala(ad);
                    System.out.println("İşleminiz Gerçekleştirilmiştir...");
                }
                else{
                    System.out.println("Geçersiz işlem");
                }
            }
            else if (işlem.equals("2")){
                resimOku();
                 if (true) {
                    System.out.println("Kopyalamak istediğiniz dosyanın adı ne olsun : ");
                    String s = scanner.nextLine();
                     resimKopyala(s);
                    System.out.println("İşleminiz Gerçekleştirilmiştir...");
                }
            }
            else{
                System.out.println("Geçersiz İşlem");
            }
        } 
}
}
