/*
(Jumlah digit dalam bilangan bulat) Tulis metode yang menghitung jumlah digit dalam
bilangan bulat. Gunakan tajuk metode berikut :
public static int sumDigits(long n)
Misalnya, sumDigits(234) mengembalikan 9 (2 + 3 + 4). (Petunjuk: Gunakan operator
% untuk mengekstrak digit, dan operator / untuk menghapus digit yang diekstraksi.
Misalnya, untuk mengekstrak 4 dari 234, gunakan 234 % 10 (= 4). Untuk menghapus
4 dari 234, gunakan 234 / 10 ( = 23). Gunakan loop untuk mengekstrak dan
menghapus digit berulang kali hingga semua digit terekstraksi. Tulis program
pengujian yang meminta pengguna memasukkan bilangan bulat dan menampilkan
jumlah semua digitnya.
 */
package No3;

import java.util.Scanner;

public class sumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        long number = scanner.nextLong();
        
        int sum = sumDigits(number);
        
        System.out.println("Jumlah semua digit dalam bilangan " + number + " adalah: " + sum);
    }
    
    public static int sumDigits(long n) {
        // Inisialisasi variabel untuk menyimpan jumlah digit
        int sum = 0;
        
        // Loop untuk mengekstrak dan menjumlahkan setiap digit
        while (n != 0) {
            // Menggunakan operator % untuk mendapatkan digit terakhir
            int digit = (int)(n % 10);
            // Menambahkan digit ke jumlah
            sum += digit;
            // Menghapus digit terakhir
            n /= 10;
        }
        
        return sum;
    }
}
