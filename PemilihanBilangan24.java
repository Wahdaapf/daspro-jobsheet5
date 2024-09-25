import java.util.Scanner;

public class PemilihanBilangan24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Sebuah Angka: ");
        int angka = input.nextInt();

        /*
         * if else
        */
        // if(angka % 2 == 0) {
        //     System.out.printf("Angka %s Termasuk Bilangan Genap", angka);
        // } else {
        //     System.out.printf("Angka %s Termasuk Bilangan Ganjil", angka);
        // }

        /*
         * Tenary
        */
        String jawaban = angka % 2 == 0 ? "Genap" : "Ganjil";
        System.out.printf("Angka %s Termasuk Bilangan %s", angka, jawaban);
    }
}