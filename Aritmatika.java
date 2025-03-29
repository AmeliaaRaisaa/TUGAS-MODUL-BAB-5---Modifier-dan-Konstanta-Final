// Kelas Aritmatika untuk melakukan operasi matematika
public class Aritmatika {
    // Method static untuk penjumlahan
    public static int hitungPenjumlahan(int a, int b) {
        return a + b; // Mengembalikan hasil penjumlahan
    }
    
    // Method static untuk pengurangan
    public static int hitungPengurangan(int a, int b) {
        return a - b; // Mengembalikan hasil pengurangan
    }
    
    // Method non-static untuk perkalian
    public int hitungPerkalian(int a, int b) {
        return a * b; // Mengembalikan hasil perkalian
    }
    
    // Method non-static untuk pembagian
    public int hitungPembagian(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan."); // Menangani pembagian dengan nol
        }
        return a / b; // Mengembalikan hasil pembagian
    }
    
    // Method non-static untuk menyederhanakan pecahan
    public String sederhana(int pembilang, int penyebut) {
        if (penyebut == 0) {
            throw new ArithmeticException("Penyebut tidak boleh nol."); // Menangani penyebut nol
        }
        
        int gcd = gcd(Math.abs(pembilang), Math.abs(penyebut)); // Menghitung GCD dari pembilang dan penyebut
        
        // Menangani tanda negatif
        if (penyebut < 0) {
            pembilang = -pembilang;
            penyebut = -penyebut;
        }
        
        return (pembilang / gcd) + "/" + (penyebut / gcd); // Mengembalikan pecahan yang sudah disederhanakan
    }
    
    // Method helper untuk mencari GCD (Greatest Common Divisor)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b; // Menyimpan nilai b sementara
            b = a % b;    // Menghitung sisa pembagian
            a = temp;     // Mengupdate a dengan nilai b
        }
        return a; // Mengembalikan nilai GCD
    }
}