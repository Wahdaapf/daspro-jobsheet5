import java.util.Scanner;

public class Kafe24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;

        System.out.print("Masukkan Menu \t\t:");
        menu = input.nextLine();
        System.out.print("Masukkan Ukuran Cup \t:");
        ukuranCup = input.nextLine().charAt(0);
        System.out.print("Masukkan Jumlah \t:");
        jumlah = input.nextInt();
        System.out.print("Masukkan Keanggotaan \t:");
        keanggotaan = input.nextBoolean();

        double hargaMenu = 0;

        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
        }

        double totalHarga = hargaMenu * jumlah;
        String validUkuranCup = "";

        switch (Character.toUpperCase(ukuranCup)) {
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 * totalHarga;
                break;
            default:
                validUkuranCup = "Tidak Valid";
        }

        double diskon = keanggotaan ? 0.1 : 0;
        double nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.printf("Item Pembelian: %s %s dengan ukuran cup %s\nNominal Bayar: Rp.%s", jumlah, menu, !validUkuranCup.isEmpty() ? validUkuranCup : ukuranCup, nominalBayar);
    }
}