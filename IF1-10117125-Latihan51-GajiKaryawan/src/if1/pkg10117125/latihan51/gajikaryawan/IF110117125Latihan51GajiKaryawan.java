/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan51.gajikaryawan;
import java.util.Scanner;

/**
 *Nama  : Zulfi Ihzam Rahmat
 *Kelas : IF-1
 *NIM   : 10117125
 *Deskripsi Program : program ini berisi program yang menampilkan hasil gaji
 *                    karyawan
 */
public class IF110117125Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner baca = new Scanner(System.in);
        Manager mnr1 = new Manager();
        System.out.println("=== Program Perhitungan Gaji Karyawan===");
        System.out.print("Masukkan Nik : ");
        mnr1.setNik(baca.nextLine());
        System.out.print("Masukkan Nama : ");
        mnr1.setNama(baca.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        mnr1.setGolongan(baca.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        mnr1.setJabatan(baca.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        mnr1.setKehadiran(baca.nextInt());
        System.out.println("");

        System.out.println("===Hasil Perhitungan===");
        System.out.println("NIK : " + mnr1.getNik());
        System.out.println("Nama : " + mnr1.getNama());
        System.out.println("Golongan : " + mnr1.getGolongan());
        System.out.println("Jabatan : " + mnr1.getJabatan());
        System.out.println("");

        System.out.println("TUNJANGAN GOLONGAN : " + mnr1.tunjanganGolongan
                           (mnr1.getGolongan()));
        System.out.println("TUNJANGAN JABATAN : " + mnr1.tunjanganJabatan
                           (mnr1.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : " + mnr1.tunjanganKehadiran
                           (mnr1.getKehadiran()));
        System.out.println("");
        System.out.println("GAJI TOTAL " + mnr1.totalGaji());

    }
}
