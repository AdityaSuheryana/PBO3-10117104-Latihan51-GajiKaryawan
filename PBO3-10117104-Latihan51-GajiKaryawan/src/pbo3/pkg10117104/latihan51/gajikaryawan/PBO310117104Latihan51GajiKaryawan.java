/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan51.gajikaryawan;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author
 * Nama : Aditya Suheryana
 * Kelas : IF-3/PBO3
 * Nim : 10117104
 * Deskripsi Program : Menampilkan Program penghitungan gaji Karyawan
 */
public class PBO310117104Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Scanner scn1 = new Scanner(System.in);
        String n;
        System.out.println("====Program Penghitungan Gaji Karyawan====");
        Karyawan karyawan1;
        karyawan1 = new Karyawan();
        System.out.printf("Masukkan Nik : ");
        karyawan1.setNik(scn.next());
        System.out.printf("Masukkan Nama : ");
        n = scn1.nextLine();
        karyawan1.setNama(n);
        System.out.printf("Masukkan Golongan (1/2/3): ");
        karyawan1.setGolongan(scn.nextInt());
        System.out.printf("Masukkan Jabatan (Manager/Kabag) : ");
        karyawan1.setJabatan(scn.next());
        Manager manajer1 = new Manager();
        System.out.printf("Masukkan Jumlah Kehadiran : ");
        manajer1.setKehadiran(scn.nextInt());
    
        System.out.println("");
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("Nik : "+karyawan1.getNik());
        System.out.println("Nama : "+karyawan1.getNama());
        System.out.println("golongan : "+karyawan1.getGolongan());
        System.out.println("jabatan : "+karyawan1.getJabatan());
        System.out.println("");
        DecimalFormat df = new DecimalFormat("#,###,###");
        
        System.out.println("TUNJANGAN GOLONGAN : Rp. "+df.format(manajer1.tunjanganGolongan
        (karyawan1.getGolongan())));
        System.out.println("TUNJANGAN JABATAN : Rp. "+df.format(manajer1.tunjanganJabatan
        (karyawan1.getJabatan())));
        System.out.println("TUNJANGAN KEHADIRAN : Rp. "+df.format(manajer1.tunjanganKehadiran
        (manajer1.getKehadiran())));
        System.out.println("GAJI TOTAL : "+df.format(manajer1.gajiTotal()));
    }
    
}
