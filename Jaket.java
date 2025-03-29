import java.util.Scanner; // Mengimpor kelas Scanner untuk input dari pengguna

public class Jaket {
    // Harga standar untuk masing-masing jenis jaket
    public static final int HARGA_JAKET_A = 100000; // Harga untuk jaket bahan A
    public static final int HARGA_JAKET_B = 125000; // Harga untuk jaket bahan B
    public static final int HARGA_JAKET_C = 175000; // Harga untuk jaket bahan C
    
    // Harga diskon untuk jaket jika pembelian melebihi batas tertentu
    private static final int DISKON_JAKET_A = 95000;  // Harga diskon untuk jaket A
    private static final int DISKON_JAKET_B = 120000; // Harga diskon untuk jaket B
    private static final int DISKON_JAKET_C = 160000; // Harga diskon untuk jaket C
    
    // Batas pembelian untuk mendapatkan diskon
    private static final int BATAS_DISKON = 100; // Jumlah minimum untuk mendapatkan diskon

    // Metode ini mengembalikan harga jaket A berdasarkan jumlah yang dibeli.
    // Jika jumlah yang dibeli lebih dari batas diskon, maka harga diskon akan diterapkan.
    public static int getHargaJaketA(int jumlah) {
        return (jumlah > BATAS_DISKON) ? DISKON_JAKET_A : HARGA_JAKET_A;
    }
    
    // Metode ini mengembalikan harga jaket B berdasarkan jumlah yang dibeli.
    // Jika jumlah yang dibeli lebih dari batas diskon, maka harga diskon akan diterapkan.
    public static int getHargaJaketB(int jumlah) {
        return (jumlah > BATAS_DISKON) ? DISKON_JAKET_B : HARGA_JAKET_B;
    }
    
    // Metode ini mengembalikan harga jaket C berdasarkan jumlah yang dibeli.
    // Jika jumlah yang dibeli lebih dari batas diskon, maka harga diskon akan diterapkan.
    public static int getHargaJaketC(int jumlah) {
        return (jumlah > BATAS_DISKON) ? DISKON_JAKET_C : HARGA_JAKET_C;
    }
    
    // Metode ini menghitung total harga pembelian jaket berdasarkan jumlah yang dibeli.
    // Menggunakan jumlah jaket A, B, dan C untuk menghitung total harga.
    public int hitungTotalHarga(int jumlahA, int jumlahB, int jumlahC) {
        // Menghitung total harga untuk setiap jenis jaket
        int totalA = getHargaJaketA(jumlahA) * jumlahA; // Total harga jaket A
        int totalB = getHargaJaketB(jumlahB) * jumlahB; // Total harga jaket B
        int totalC = getHargaJaketC(jumlahC) * jumlahC; // Total harga jaket C
        
        // Mengembalikan total harga keseluruhan
        return totalA + totalB + totalC;
    }
    
    // Metode ini menampilkan informasi pembelian dalam format yang mudah dibaca.
    // Menggunakan tipe jaket, jumlah, dan harga satuan untuk membuat string informasi.
    public static String getInfoPembelian(String tipe, int jumlah, int hargaSatuan) {
        return String.format("Jaket %s: %d buah x Rp %d = Rp %d", 
                tipe, jumlah, hargaSatuan, (jumlah * hargaSatuan));
    }
}