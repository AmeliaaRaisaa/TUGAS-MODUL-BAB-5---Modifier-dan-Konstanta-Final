import java.util.Scanner; // Mengimpor kelas Scanner untuk input dari pengguna

// Kelas utama untuk menjalankan aplikasi pembelian jaket
public class MainJaket {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner in = new Scanner(System.in);
        
        // Menampilkan banner program
        tampilkanBanner();
        
        // Meminta pengguna untuk memasukkan jumlah jaket yang ingin dibeli
        System.out.print("Masukkan jumlah jaket A: ");
        int jumlahA = in.nextInt(); // Membaca jumlah jaket A
        System.out.print("Masukkan jumlah jaket B: ");
        int jumlahB = in.nextInt(); // Membaca jumlah jaket B
        System.out.print("Masukkan jumlah jaket C: ");
        int jumlahC = in.nextInt(); // Membaca jumlah jaket C
        
        // Menghitung total harga menggunakan objek Jaket
        Jaket jaket = new Jaket(); // Membuat objek Jaket
        int totalHarga = jaket.hitungTotalHarga(jumlahA, jumlahB, jumlahC); // Menghitung total harga
        
        // Menampilkan ringkasan pembelian
        System.out.println("\n===== RINGKASAN PEMBELIAN =====");
        if (jumlahA > 0) {
            int hargaA = Jaket.getHargaJaketA(jumlahA); // Mendapatkan harga jaket A
            System.out.println(Jaket.getInfoPembelian("A", jumlahA, hargaA)); // Menampilkan informasi pembelian jaket A
        }
        if (jumlahB > 0) {
            int hargaB = Jaket.getHargaJaketB(jumlahB); // Mendapatkan harga jaket B
            System.out.println(Jaket.getInfoPembelian("B", jumlahB, hargaB)); // Menampilkan informasi pembelian jaket B
        }
        if (jumlahC > 0) {
            int hargaC = Jaket.getHargaJaketC(jumlahC); // Mendapatkan harga jaket C
            System.out.println(Jaket.getInfoPembelian("C", jumlahC, hargaC)); // Menampilkan informasi pembelian jaket C
        }
        
        // Menampilkan total harga
        System.out.println("----------------------------------");
        System.out.println("TOTAL HARGA: Rp " + totalHarga); // Menampilkan total harga
        System.out.println("==================================");
        
        // Menutup scanner untuk menghindari kebocoran memori
        in.close();
    }
    
    // Metode untuk menampilkan banner program
    public static void tampilkanBanner() {
        System.out.println("╔═══════════════════════════════════════════╗");
        System.out.println("║           CV. LABKOMDAS JAKET             ║");
        System.out.println("║      Sistem Manajemen Penjualan Jaket     ║");
        System.out.println("╠═══════════════════════════════════════════╣");
        System.out.println("║ DAFTAR HARGA:                             ║");
        System.out.println("║   Jaket A: Rp " + Jaket.HARGA_JAKET_A + "                      ║");
        System.out.println("║   Jaket B: Rp " + Jaket.HARGA_JAKET_B + "                      ║");
        System.out.println("║   Jaket C: Rp " + Jaket.HARGA_JAKET_C + "                      ║");
        System.out.println("║                                           ║");
        System.out.println("║ DISKON:                                   ║");
        System.out.println("║   Jaket A > 100 buah: Rp 95.000/buah      ║");
        System.out.println("║   Jaket B > 100 buah: Rp 120.000/buah     ║");
        System.out.println("║   Jaket C > 100 buah: Rp 160.000/buah     ║");
        System.out.println("╚═══════════════════════════════════════════╝");
    }
}