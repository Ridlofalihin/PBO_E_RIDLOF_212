import java.util.Scanner;
import java.time.LocalDate;

public class user {
    public static void main(String[] args) {
        // menginput objek user
        Scanner scanner = new Scanner(System.in);

        // meminta input nama user
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        // meminta input jenis kelamin user
        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        // meminta input tahun lahir user
        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // menutup scanner
        scanner.close();

        // menghitung umur tahun lahir
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        // menentukan jenis kelamin
        String jenisKelaminTeks;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminTeks = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminTeks = "Perempuan";
        } else {
            jenisKelaminTeks = "Tidak diketahui";
        }

        // menampilkan output sesuai dengan input dari user
        System.out.println("\nData Diri:");
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis Kelamin   : " + jenisKelaminTeks);
        System.out.println("Umur            : " + umur + " tahun");
    }
}