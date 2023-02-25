package DVD;

import java.util.Scanner;


/**
 *
 * @author NAFFA
 */
public class MainrentalDVD {
    public static void main(String[] args){
        System.out.print("1. DVD Musik \n2. DVD Film \nData DVD apa yang akan dimasukkan?(pilih angka) ");
        Scanner input = new Scanner(System.in);
        byte i = input.nextByte();
        switch (i){
            case 1 : 
                DVDmusik M1 = new DVDmusik();
                System.out.println("\nContoh data yang diinput ");
                M1.setJudul("MOTS 'Persona'");
                M1.setPenyanyi("BTS");
                M1.setProduser("Bang Si Hyuk");
                M1.setPublisher("BigHit");
                M1.setTop("Boy With Luv, Home, Persona");
                M1.setKategori("P");
                M1.setStok(130);
                M1.displayDVD();
                System.out.println("\n\nMasukkan data DVD Musik ");
                DVDmusik M2 = new DVDmusik();
                M2.scanDVD();
                System.out.println("\nData DVD Musik yang telah diinput adalah sebagai berikut : ");
                M2.displayDVD();
                break;
            case 2 :
                DVDfilm F1 = new DVDfilm();
                System.out.println("\nContoh data yang diinput ");
                F1.setJudul("Mencuri Raden Saleh");
                F1.setPemeran("Iqbaal, Umay, Angga, Ari, Rachel, Aghniny");
                F1.setSutradara("Angga Dwimas Sasongko");
                F1.setPublisher("Visinema Pictures");
                F1.setKategori("R");
                F1.setStok(100);
                F1.displayDVD();
                System.out.println("\n\nMasukkan data DVD Musik ");
                DVDfilm F2 = new DVDfilm();
                F2.scanDVD();
                System.out.println("\nData DVD Film yang telah diinput adalah sebagai berikut : ");
                F2.displayDVD();
                break;
        }
    }
}
