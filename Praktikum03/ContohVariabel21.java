public class ContohVariabel21 {
    
    public static void main(String[] args) {

        String nama = "Nama         : Muhammad Rasyid Ridho";
        String hobi = "Hobi         : Menonton film";
        boolean pandai = true;
        char jenisKelamin = 'L';
        byte umur = 18;
        double ipk = 3.8, tinggi = 1.7;

        System.out.println(nama);
        System.out.println(hobi);
        System.out.println("Apakah pandai? " + pandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("IPK          : " + ipk);
        System.out.println(String.format("Umur         : %s \nTinggi badan : %s", umur, tinggi));
    }
}
