public class ContohVariabel14 {
    public static void main(String [] args){
        String Hoby = "Bermain Bola Basket";

        boolean Pandai = true;
        char JenisKelamin = 'L';
        byte Umur = 19;
        double IPK = 3.24, TinggiBadan= 1.78;

        System.out.println(Hoby);
        System.out.println("Apakah saya pandai? " +Pandai);
        System.out.println("Jenis kelamin: " +JenisKelamin);
        System.out.println("Umur saya saat ini: " +Umur);
        System.out.println(String.format("Saya ber IPK %s, dengan tinggi badan %s", IPK, TinggiBadan));
    }
}