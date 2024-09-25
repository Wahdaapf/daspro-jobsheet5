import java.util.Scanner;

public class Usia24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Usia Anda: ");
        if (input.hasNextInt()) {
            int usia = input.nextInt();

            if (usia >= 0) {
                if (usia <= 12) {
                    System.out.println("Kategori: Anak");
                } else if (usia <= 19) {
                    System.out.println("Kategori: Remaja");
                } else if (usia <= 64) {
                    System.out.println("Kategori: Dewasa");
                } else {
                    System.out.println("Kategori: Lansia");
                }
            } else {
                // Jika Usia Bukan Bil Positif
                System.out.println("Masukkan usia yang valid (angka positif).");
            }
        } else {
            // Jika Usia bukan angka bulat
            System.out.println("Usia tidak valid. Harus berupa angka.");
        }
    }
}