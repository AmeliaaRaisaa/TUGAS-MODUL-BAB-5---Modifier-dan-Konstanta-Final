import java.util.Scanner; // Mengimpor kelas Scanner untuk input dari pengguna

public class MainAritmatika {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner in = new Scanner(System.in);
       
        // Input untuk penjumlahan
        System.out.print("Masukkan nilai 1 untuk penjumlahan: ");
        int nil1 = in.nextInt(); // Membaca nilai pertama
        System.out.print("Masukkan nilai 2 untuk penjumlahan: ");
        int nil2 = in.nextInt(); // Membaca nilai kedua
        // Memanggil method static untuk menghitung penjumlahan
        int hasilPenjumlahan = Aritmatika.hitungPenjumlahan(nil1, nil2);
        // Menampilkan hasil penjumlahan
        System.out.println("Nilai penjumlahan adalah: " + hasilPenjumlahan);
       
        // Input untuk pengurangan
        System.out.print("Masukkan nilai 1 untuk pengurangan: ");
        nil1 = in.nextInt(); // Membaca nilai pertama
        System.out.print("Masukkan nilai 2 untuk pengurangan: ");
        nil2 = in.nextInt(); // Membaca nilai kedua
        // Memanggil method static untuk menghitung pengurangan
        int hasilPengurangan = Aritmatika.hitungPengurangan(nil1, nil2);
        // Menampilkan hasil pengurangan
        System.out.println("Nilai pengurangan adalah: " + hasilPengurangan);
       
        // Input untuk perkalian
        System.out.print("Masukkan nilai 1 untuk perkalian: ");
        nil1 = in.nextInt(); // Membaca nilai pertama
        System.out.print("Masukkan nilai 2 untuk perkalian: ");
        nil2 = in.nextInt(); // Membaca nilai kedua
        // Membuat objek Aritmatika untuk memanggil method non-static
        Aritmatika a = new Aritmatika();
        // Memanggil method non-static untuk menghitung perkalian
        int hasilPerkalian = a.hitungPerkalian(nil1, nil2);
        // Menampilkan hasil perkalian
        System.out.println("Nilai perkalian adalah: " + hasilPerkalian);
       
        // Input untuk pembagian
        System.out.print("Masukkan nilai 1 untuk pembagian: ");
        nil1 = in.nextInt(); // Membaca nilai pertama
        System.out.print("Masukkan nilai 2 untuk pembagian: ");
        nil2 = in.nextInt(); // Membaca nilai kedua
        // Memanggil method non-static untuk menghitung pembagian
        int hasilPembagian = a.hitungPembagian(nil1, nil2);
        // Menampilkan hasil pembagian
        System.out.println("Nilai pembagian adalah: " + hasilPembagian);
       
        // Input untuk menyederhanakan pecahan
        System.out.print("Masukkan pembilang: ");
        int pembilang = in.nextInt(); // Membaca pembilang
        System.out.print("Masukkan penyebut: ");
        int penyebut = in.nextInt(); // Membaca penyebut
        // Memanggil method non-static untuk menyederhanakan pecahan
        String pecahanSederhana = a.sederhana(pembilang, penyebut);
        // Menampilkan pecahan yang sudah disederhanakan
        System.out.println("Pecahan sederhana: " + pecahanSederhana);
       
        // Menutup scanner untuk menghindari kebocoran memori
        in.close();
    }
}