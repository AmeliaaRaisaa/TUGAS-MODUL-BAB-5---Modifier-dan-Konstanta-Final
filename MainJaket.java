import java.util.Scanner; // Mengimpor kelas Scanner untuk input dari pengguna

public class MainJaket {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner in = new Scanner(System.in);
       
        // Input jumlah jaket
        System.out.print("Masukkan jumlah jaket A: ");
        int jumlahA = in.nextInt(); // Membaca jumlah jaket A
        System.out.print("Masukkan jumlah jaket B: ");
        int jumlahB = in.nextInt(); // Membaca jumlah jaket B
        System.out.print("Masukkan jumlah jaket C: ");
        int jumlahC = in.nextInt(); // Membaca jumlah jaket C
       
        // Menghitung total harga
        Jaket jaket = new Jaket(); // Membuat objek Jaket
        int totalHarga = jaket.hitungTotalHarga(jumlahA, jumlahB, jumlahC); // Menghitung total harga
        
        // Menampilkan total harga untuk pembelian jaket
        System.out.println("Total harga untuk pembelian jaket adalah: Rp " + totalHarga);
       
        // Menutup scanner untuk menghindari kebocoran memori
        in.close();
    }
}