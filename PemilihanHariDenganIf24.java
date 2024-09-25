import java.util.Scanner;

public class PemilihanHariDenganIf24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number of Day: ");
        int angka = input.nextInt();

        String jawaban;

        if(angka <= 5) {
            jawaban = "Weekday";
        } else if ( angka <=7) {
            jawaban = "Weekend";
        } else {
            jawaban = "Invalid Number";
        }

        System.out.printf("Number %s is a %s", angka, jawaban);
    }
}