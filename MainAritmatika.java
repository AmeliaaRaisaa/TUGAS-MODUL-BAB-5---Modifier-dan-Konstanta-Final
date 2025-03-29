import java.util.Scanner; // Mengimpor kelas Scanner untuk membaca input dari pengguna

public class MainAritmatika {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);
        // Membuat objek Aritmatika untuk memanggil method non-static
        Aritmatika aritmatika = new Aritmatika();
        
        int pilihan = 0; // Variabel untuk menyimpan pilihan menu pengguna
        boolean lanjutkan = true; // Variabel untuk mengontrol loop program
        
        // Menampilkan judul program
        System.out.println("=================================================");
        System.out.println("|           PROGRAM KALKULATOR JAVA             |");
        System.out.println("=================================================");
        
        // Loop untuk menampilkan menu dan meminta input pengguna
        while (lanjutkan) {
            tampilkanMenu(); // Menampilkan menu operasi
            
            System.out.print("Pilihan Anda [1-6]: "); // Meminta pengguna untuk memilih operasi
            pilihan = input.nextInt(); // Membaca pilihan pengguna
            
            // Menggunakan switch untuk menentukan operasi yang dipilih
            switch (pilihan) {
                case 1:
                    operasiPenjumlahan(input); // Memanggil metode untuk operasi penjumlahan
                    break;
                case 2:
                    operasiPengurangan(input); // Memanggil metode untuk operasi pengurangan
                    break;
                case 3:
                    operasiPerkalian(input, aritmatika); // Memanggil metode untuk operasi perkalian
                    break;
                case 4:
                    operasiPembagian(input, aritmatika); // Memanggil metode untuk operasi pembagian
                    break;
                case 5:
                    operasiSederhana(input, aritmatika); // Memanggil metode untuk penyederhanaan pecahan
                    break;
                case 6:
                    // Menampilkan pesan terima kasih dan keluar dari program
                    System.out.println("\nTerima kasih telah menggunakan program ini!");
                    System.out.println("=================================================");
                    lanjutkan = false; // Mengubah nilai untuk keluar dari loop
                    break;
                default:
                    // Menampilkan pesan jika pilihan tidak valid
                    System.out.println("\nPilihan tidak valid. Silakan pilih 1-6.");
                    break;
            }
            
            // Menanyakan kepada pengguna apakah ingin melakukan operasi lain
            if (lanjutkan && pilihan >= 1 && pilihan <= 5) {
                System.out.print("\nIngin melakukan operasi lain? (y/n): ");
                String jawaban = input.next(); // Membaca jawaban pengguna
                if (jawaban.equalsIgnoreCase("n")) {
                    // Jika pengguna memilih 'n', keluar dari program
                    System.out.println("\nTerima kasih telah menggunakan program ini!");
                    System.out.println("=================================================");
                    lanjutkan = false; // Mengubah nilai untuk keluar dari loop
                }
                System.out.println(); // Menambahkan baris kosong untuk tampilan yang lebih rapi
            }
        }
        
        // Menutup scanner untuk menghindari kebocoran resource
        input.close();
    }
    
    // Method untuk menampilkan menu operasi
    private static void tampilkanMenu() {
        System.out.println("\n-------------------------------------------------");
        System.out.println("|                  MENU UTAMA                   |");
        System.out.println("-------------------------------------------------");
        System.out.println("| 1. Penjumlahan (Static Method)                |");
        System.out.println("| 2. Pengurangan (Static Method)                |");
        System.out.println("| 3. Perkalian (Non-Static Method)              |");
        System.out.println("| 4. Pembagian (Non-Static Method)              |");
        System.out.println("| 5. Sederhana Pecahan (Non-Static Method)      |");
        System.out.println("| 6. Keluar                                     |");
        System.out.println("-------------------------------------------------");
    }
    
    // Method untuk operasi penjumlahan
    private static void operasiPenjumlahan(Scanner input) {
        System.out.println("\n--- OPERASI PENJUMLAHAN (STATIC METHOD) ---");
        System.out.print("Masukkan nilai pertama: ");
        int a = input.nextInt(); // Membaca nilai pertama
        System.out.print("Masukkan nilai kedua  : ");
        int b = input.nextInt(); // Membaca nilai kedua
        
        // Memanggil method static untuk menghitung penjumlahan
        int hasil = Aritmatika.hitungPenjumlahan(a, b);
        
        // Menampilkan hasil penjumlahan
        System.out.println("\nHasil: " + a + " + " + b + " = " + hasil);
    }
    
    // Method untuk operasi pengurangan
    private static void operasiPengurangan(Scanner input) {
        System.out.println("\n--- OPERASI PENGURANGAN (STATIC METHOD) ---");
        System.out.print("Masukkan nilai pertama: ");
        int a = input.nextInt(); // Membaca nilai pertama
        System.out.print("Masukkan nilai kedua  : ");
        int b = input.nextInt(); // Membaca nilai kedua
        
        // Memanggil method static untuk menghitung pengurangan
        int hasil = Aritmatika.hitungPengurangan(a, b);
        
        // Menampilkan hasil pengurangan
        System.out.println("\nHasil: " + a + " - " + b + " = " + hasil);
    }
    
    // Method untuk operasi perkalian
    private static void operasiPerkalian(Scanner input, Aritmatika aritmatika) {
        System.out.println("\n--- OPERASI PERKALIAN (NON-STATIC METHOD) ---");
        System.out.print("Masukkan nilai pertama: ");
        int a = input.nextInt(); // Membaca nilai pertama
        System.out.print("Masukkan nilai kedua  : ");
        int b = input.nextInt(); // Membaca nilai kedua
        
        // Memanggil method non-static untuk menghitung perkalian
        int hasil = aritmatika.hitungPerkalian(a, b);
        
        // Menampilkan hasil perkalian
        System.out.println("\nHasil: " + a + " * " + b + " = " + hasil);
    }
    
    // Method untuk operasi pembagian
    private static void operasiPembagian(Scanner input, Aritmatika aritmatika) {
        System.out.println("\n--- OPERASI PEMBAGIAN (NON-STATIC METHOD) ---");
        System.out.print("Masukkan nilai pembilang: ");
        int a = input.nextInt(); // Membaca nilai pembilang
        System.out.print("Masukkan nilai penyebut : ");
        int b = input.nextInt(); // Membaca nilai penyebut
        
        try {
            // Memanggil method non-static untuk menghitung pembagian
            int hasil = aritmatika.hitungPembagian(a, b);
            // Menampilkan hasil pembagian
            System.out.println("\nHasil: " + a + " / " + b + " = " + hasil);
        } catch (ArithmeticException e) {
            // Menampilkan pesan error jika terjadi pembagian dengan nol
            System.out.println("\nError: " + e.getMessage());
        }
    }
    
    // Method untuk operasi penyederhanaan pecahan
    private static void operasiSederhana(Scanner input, Aritmatika aritmatika) {
        System.out.println("\n--- PENYEDERHANAAN PECAHAN (NON-STATIC METHOD) ---");
        System.out.print("Masukkan nilai pembilang: ");
        int pembilang = input.nextInt(); // Membaca nilai pembilang
        System.out.print("Masukkan nilai penyebut : ");
        int penyebut = input.nextInt(); // Membaca nilai penyebut
        
        try {
            // Memanggil method non-static untuk menyederhanakan pecahan
            String hasil = aritmatika.sederhana(pembilang, penyebut);
            // Menampilkan hasil penyederhanaan
            System.out.println("\nBentuk sederhana dari " + pembilang + "/" + penyebut + " adalah " + hasil);
        } catch (ArithmeticException e) {
            // Menampilkan pesan error jika penyebut nol
            System.out.println("\nError: " + e.getMessage());
        }
    }
}