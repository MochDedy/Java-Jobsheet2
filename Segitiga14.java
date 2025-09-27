import java.util.Scanner;

public class Segitiga14 {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        int alas, tinggi;
        float Luas;

        System.out.println("Menghitung luas Segitiga!");

        System.out.print("Masukkan ukuran alas (Meter): ");
        alas = sc.nextInt();

        System.out.print("Masukkan ukuran tinggi (Meter): ");
        tinggi = sc.nextInt();

        Luas = alas * tinggi /2;

        System.out.println("Hasil luas Segitiga adalah " +Luas +" m2");
    }
}