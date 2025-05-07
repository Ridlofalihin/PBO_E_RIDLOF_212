package Perpustakaan;

public class Nonfiksi extends Buku{

    public Nonfiksi(String judul, String penulis, String genre){
        super(judul, penulis, genre);
    }

    @Override
    public void displayInfo(){
        System.out.println("Buku Non-Fiksi: " + judul + " oleh " + penulis + " (Bidang: " + genre + ")");
    }
}