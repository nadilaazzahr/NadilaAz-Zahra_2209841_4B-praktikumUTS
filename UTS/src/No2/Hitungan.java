/*
Tulis sebuah program yang membaca sejumlah bilangan bulat yang tidak ditentukan,
menentukan berapa banyak nilai positif dan negatif yang telah dibaca, dan menghitung
total dan rata-rata nilai input (tidak termasuk nol). Program Anda diakhiri dengan
input 0. Tampilkan rata-rata sebagai angka floating-point. Berikut adalah contoh
running programnya
*/
package No2;

import java.util.Scanner;

public class Hitungan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int bilangan;
        int jumlahPositif = 0;
        int jumlahNegatif = 0;
        double total = 0;
        int count = 0;

        System.out.println("Masukkan bilangan integer, program akan berhenti jika memasukkan nilai 0:");

        // Membaca bilangan dari pengguna
        do {
            bilangan = scanner.nextInt();

            // Memeriksa apakah bilangan bukan nol
            if (bilangan != 0) {
                // Menambahkan bilangan ke total
                total += bilangan;
                // Menambahkan satu ke jumlah bilangan yang tidak nol
                count++;

                // Memeriksa apakah bilangan positif atau negatif
                if (bilangan > 0) {
                    jumlahPositif++;
                } else {
                    jumlahNegatif++;
                }
            }
        } while (bilangan != 0);

        // Menghitung rata-rata
        double rataRata = count > 0 ? total / count : 0;

        // Menampilkan hasil
        System.out.println("Jumlah bilangan positif adalah " + jumlahPositif);
        System.out.println("Jumlah bilangan negatif adalah " + jumlahNegatif);
        System.out.println("Nilai total adalah " + total);
        System.out.println("Nilai rata-rata adalah " + rataRata);
    }
    
}
