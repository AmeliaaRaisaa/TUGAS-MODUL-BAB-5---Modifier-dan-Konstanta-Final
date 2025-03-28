public class Aritmatika {
    // Method static untuk penjumlahan
    public static int hitungPenjumlahan(int a, int b) {
        // Mengembalikan hasil penjumlahan dari dua angka
        return a + b;
    }

    // Method static untuk pengurangan
    public static int hitungPengurangan(int a, int b) {
        // Mengembalikan hasil pengurangan dari dua angka
        return a - b;
    }

    // Method non-static untuk perkalian
    public int hitungPerkalian(int a, int b) {
        // Mengembalikan hasil perkalian dari dua angka
        return a * b;
    }

    // Method non-static untuk pembagian
    public int hitungPembagian(int a, int b) {
        // Memeriksa apakah penyebut (b) adalah nol
        if (b == 0) {
            // Jika ya, lemparkan exception karena pembagian dengan nol tidak diperbolehkan
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
        }
        // Mengembalikan hasil pembagian dari dua angka
        return a / b;
    }

    // Method non-static untuk menyederhanakan pecahan
    public String sederhana(int numerator, int denominator) {
        // Menghitung GCD (Greatest Common Divisor) dari pembilang dan penyebut
        int gcd = gcd(numerator, denominator);
        // Mengembalikan pecahan yang sudah disederhanakan
        return (numerator / gcd) + "/" + (denominator / gcd);
    }

    // Method untuk mencari GCD (Greatest Common Divisor)
    private int gcd(int a, int b) {
        // Menggunakan algoritma Euclidean untuk mencari GCD
        while (b != 0) {
            int temp = b; // Menyimpan nilai b sementara
            b = a % b;    // Menghitung sisa pembagian
            a = temp;     // Mengupdate a dengan nilai b
        }
        // Mengembalikan nilai GCD
        return a;
    }
}