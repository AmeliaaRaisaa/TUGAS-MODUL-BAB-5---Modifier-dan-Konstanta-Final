public class Jaket {
    // Harga jaket sebagai konstanta final
    public static final int HARGA_JAKET_A = 100000; // Harga jaket A
    public static final int HARGA_JAKET_B = 125000; // Harga jaket B
    public static final int HARGA_JAKET_C = 175000; // Harga jaket C

    // Method untuk menghitung total harga jaket
    public int hitungTotalHarga(int jumlahA, int jumlahB, int jumlahC) {
        // Menentukan harga berdasarkan jumlah yang dibeli
        int hargaA = (jumlahA > 100) ? 95000 : HARGA_JAKET_A; // Diskon untuk jaket A
        int hargaB = (jumlahB > 100) ? 120000 : HARGA_JAKET_B; // Diskon untuk jaket B
        int hargaC = (jumlahC > 100) ? 160000 : HARGA_JAKET_C; // Diskon untuk jaket C

        // Menghitung total harga berdasarkan jumlah dan harga
        return (hargaA * jumlahA) + (hargaB * jumlahB) + (hargaC * jumlahC);
    }
}