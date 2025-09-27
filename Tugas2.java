import java.util.Scanner;

public class Tugas2 {
    public static void main (String [] args) {
        
        Scanner input = new Scanner(System.in);

        int PanjangTanah, LebarTanah, LuasTanah, DiameterLingkaran, SisiPersegi, JumlahKolamLingkaran, JumlahKolamPersegi, LuasPersegi, TotalKolamPersegi;
        double JariJari, LuasLingkaran, TotalKolamLingkaran, TotalKolam, LuasRumput;

        System.out.println("Menghitung luas tanah!");
        System.out.print("Masukkan panjang tanah (Meter): ");
        PanjangTanah = input.nextInt();

        System.out.print("Masukkan lebar tanah (Meter): ");
        LebarTanah = input.nextInt();

        System.out.print("Masukkan jumlah kolam lingkaran!: ");
        JumlahKolamLingkaran = input.nextInt();
        
        
        System.out.print("Masukkan diameter kolam lingkaran (Meter): ");
        DiameterLingkaran = input.nextInt();

        System.out.print("Masukkan jumlah kolam persegi: ");
        JumlahKolamPersegi = input.nextInt();

        System.out.print("Masukkan panjang sisi kolam persegi (Meter): ");
        SisiPersegi = input.nextInt();

        LuasTanah = PanjangTanah*LebarTanah;

        JariJari = DiameterLingkaran / 2.0;
        LuasLingkaran = 3.14 * JariJari * JariJari;
        TotalKolamLingkaran = LuasLingkaran * JumlahKolamLingkaran;

        LuasPersegi = SisiPersegi * SisiPersegi;
        TotalKolamPersegi = LuasPersegi * JumlahKolamPersegi;

        TotalKolam = TotalKolamLingkaran + TotalKolamPersegi;
        LuasRumput = LuasTanah - TotalKolam;

        System.out.println("HASIL PERHITUNGAN!");
        System.out.println("Luas Tanah: " +LuasTanah +" m2");
        System.out.println("Total Luas Kolam Lingkaran anda adalah: " +TotalKolamLingkaran +" m2");
        System.out.println("Total luas kolam persegi anda adalah: " +TotalKolamPersegi +" m2");
        System.out.println("Total luas kolam keduanya: " +TotalKolam +" m2");
        System.out.println("Luas Tanah untuk rumput:  " +LuasRumput +" m2");
    }
}