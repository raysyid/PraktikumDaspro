public class ContohVariabel21 {
    
    public static void main(String[] args) {

        String nama = "Nama\t\t: Muhammad Rasyid Ridho";
        String hobi = "Hobi\t\t: Menonton film";
        boolean pandai = true;
        char jenisKelamin = 'L';
        byte umur = 18;
        double ipk = 3.8, tinggi = 1.7;

        System.out.println(nama);
        System.out.println(hobi);
        System.out.println("Apakah pandai?\t: " + pandai);
        System.out.println("Jenis kelamin\t: " + jenisKelamin);
        System.out.println("IPK\t\t: " + ipk);
        System.out.println(String.format("Umur\t\t: %s \nTinggi badan\t: %s", umur, tinggi));
    }
}
