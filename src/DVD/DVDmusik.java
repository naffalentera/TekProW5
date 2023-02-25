package DVD;

/**
 *
 * @author NAFFA
 */

import java.util.Scanner;

public class DVDmusik extends rentalDVD {
    private String penyanyi;
    private String produser;
    private String top;

    public DVDmusik() {
        super();
        this.penyanyi = "";
        this.produser = "";
        this.top = "";
    }
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");  /* useDelimeter digunakan sebagai pembatas inputan. Disini berupa \n sehingga sebelum input-an pindah baris, semua yang diinput akan masuk ke string */
    public void displayDVD(){
        System.out.println("Judul     :  " +getJudul());
        System.out.println("Penyanyi  :  " +this.penyanyi);
        System.out.println("Produser  :  " +this.produser);
        System.out.println("Publisher :  " +getPublisher());
        System.out.println("Top Hits  :  " +this.top);
        switch(getKategori()){
            case "C" : System.out.println("Kategori  :  Classic (C)"); break;
            case "J" : System.out.println("Kategori  :  Jazz (J)"); break;
            case "P" : System.out.println("Kategori  :  Pop (P)"); break;
            case "R" : System.out.println("Kategori  :  Rock (R)"); break;
            case "O" : System.out.println("Kategori  :  Other (O)"); break;
        }
        System.out.println("Stok      :  " +getStok());
    }
    
    public void scanDVD(){
        System.out.print("Judul     :  " +getJudul());
        setJudul(input.next());
        System.out.print("Penyanyi  :  " +this.penyanyi);
        this.penyanyi = input.next();
        System.out.print("Produser  :  " +this.produser);
        this.produser = input.next();
        System.out.print("Publisher :  " +getPublisher());
        setPublisher(input.next());
        System.out.print("Top Hits  :  " +this.top);
        this.top = input.next();
        System.out.println("Pilih Kategori (input inisial) : C = classic, J = jazz, P = pop, R = rock, O = Other");
        System.out.print("Kategori  :  " +getKategori());
        setKategori(input.next());
        System.out.print("Stok      :  " +getStok());
        setStok(input.nextInt());
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
    }

    public void setProduser(String produser) {
        this.produser = produser;
    }

    public void setTop(String top) {
        this.top = top;
    }
}
