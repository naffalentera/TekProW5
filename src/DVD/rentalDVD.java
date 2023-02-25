package DVD;

import java.util.Scanner;


/**
 *
 * @author NAFFA
 */
public class rentalDVD {
    private String judul;
    private String kategori;
    private String publisher;
    private int stok;
    
    public rentalDVD(){
        this.judul = "";
        this.kategori = "";
        this.publisher = "";
        this.stok = 0;
}
    Scanner input = new Scanner(System.in).useDelimiter("\n");
        
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }


}
