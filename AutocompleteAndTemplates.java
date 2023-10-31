import java.util.Scanner;

/**
 * Program sederhana untuk menghitung luas dan keliling kubus.
 */
public class AutocompleteAndTemplates {

    /**
     * Menghitung luas dan keliling kubus berdasarkan panjang sisi yang diberikan.
     */
    public double[] hitungLuasKelilingKubus (double sisi) {
        double[] hasil = new double[2];

        double rumusl = 6 * Math.pow(sisi, 2);
        double rumusk = 12 * sisi;

        hasil[0] = rumusl;
        hasil[1] = rumusk;

        return hasil;
    }

    /**
     * Metode utama untuk menjalankan program.
     */
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input.nextDouble();

        // Membuat objek HitungLuasKelilingKubus
        AutocompleteAndTemplates kubus = new AutocompleteAndTemplates();

        // Memanggil metode hitungLuasKelilingKubus untuk menghitung luas dan keliling kubus
        double[] hasil = kubus.hitungLuasKelilingKubus(sisi);

        System.out.println("Luas kubus adalah: " + hasil[0]);
        System.out.println("Keliling kubus adalah: " + hasil[1]);
    }
}