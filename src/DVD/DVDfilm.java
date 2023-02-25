package DVD;

import java.util.Scanner;

/**
 *
 * @author NAFFA
 */
public class DVDfilm extends rentalDVD {
    private String pemeran;
    private String sutradara;

    public DVDfilm() {
        super();
        this.pemeran = "";
        this.sutradara = "";
    }
    
    Scanner input = new Scanner(System.in).useDelimiter("\n"); /* useDelimeter digunakan sebagai pembatas inputan. Disini berupa \n sehingga sebelum input-an pindah baris, semua yang diinput akan masuk ke string */
    public void displayDVD(){
        System.out.println("Judul     :  " +getJudul());
        System.out.println("Pemeran   :  " +this.pemeran);
        System.out.println("Sutradara :  " +this.sutradara);
        System.out.println("Publisher :  " +getPublisher());
        switch(getKategori()){
            case "SU" : System.out.println("Kategori  :  Semua Umur (SU)"); break;
            case "D" : System.out.println("Kategori  :  Dewasa (D)"); break;
            case "R" : System.out.println("Kategori  :  Remaja (R)"); break;
            case "A" : System.out.println("Kategori  :  Anak (A)"); break;
        }
        System.out.println("Stok      :  " +getStok());
    }
    
    public void scanDVD(){
        System.out.print("Judul     :  " +getJudul());
        setJudul(input.next());
        System.out.print("Pemeran   :  " +this.pemeran);
        this.pemeran = input.next();
        System.out.print("Sutradara :  " +this.sutradara);
        this.sutradara = input.next();
        System.out.print("Publisher :  " +getPublisher());
        setPublisher(input.next());
        System.out.println("Pilih Kategori (input inisial) : SU = semua umur, D = dewasa, R = remaja, A = anak-anak");
        System.out.print("Kategori  :  " +getKategori());
        setKategori(input.next());
        System.out.print("Stok      :  " +getStok());
        setStok(input.nextInt());
        }
        
    public void setPemeran(String pemeran) {
        this.pemeran = pemeran;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }
    
}
