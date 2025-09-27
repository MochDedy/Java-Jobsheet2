import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int GajiPokok;
        int TunjanganAnak;
        int JumlahAnak;
        double GajiBersih;
        double PotonganGaji =0.05;

        System.out.println("Menghitung gaji bersih!");
        
        System.out.println("Masukkan Gaji Pokok!");
        GajiPokok = input.nextInt();

        System.out.println("Masukkan jumlah anak!");
        JumlahAnak = input.nextInt();

        System.out.println("Masukkan Tunjangan anak: ");
        TunjanganAnak = input.nextInt();

        System.out.println("Potongan gaji anda 5% dari gaji pokok!");

        GajiBersih = GajiPokok+(TunjanganAnak * JumlahAnak)-(GajiPokok * PotonganGaji);

        System.out.println("Total Gaji Bersih anda adalah " + (int) GajiBersih);

    }
}