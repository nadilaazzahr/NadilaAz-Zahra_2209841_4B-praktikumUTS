/*
Tulis program dalam bahasa Java yang secara acak menghasilkan bilangan bulat antara
1 dan 12 dan menampilkan nama bulan bahasa Indonesia Januari, Februari, ...,
Desember untuk nomor 1, 2, ..., 12, yang sesuai.
 */
package No1;

import java.util.Random;
        
public class namaBulan {
    public static void main(String[] args) {
        // Array yang berisi nama bulan dalam bahasa Indonesia
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", 
                              "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        // Membuat objek Random untuk menghasilkan bilangan acak
        Random random = new Random();

        // Menghasilkan bilangan bulat acak antara 1 dan 12
        int nomorBulan = random.nextInt(12) + 1;

        // Menampilkan nama bulan sesuai dengan nomor yang dihasilkan
        System.out.println("Nomor Bulan: " + nomorBulan);
        System.out.println("Nama Bulan: " + namaBulan[nomorBulan - 1]);
    }
}
