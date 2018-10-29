/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan51.gajikaryawan;

/**
 *
 * @author
 * Nama : Aditya Suheryana
 * Kelas : IF-3/PBO3
 * Nim : 10117104
 * Deskripsi Program : Menampilkan Program penghitungan gaji Karyawan
 */
public class Manager extends Karyawan{
    
   private int kehadiran;
   private float tunjanganGolongan;
   private float tunjanganJabatan;
   private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }

    public float tunjanganGolongan(int golongan) {
     
        switch(golongan){
           case 1 : 
               tunjanganGolongan=500000;
           break;
           case 2 :
               tunjanganGolongan=1000000;
           break;
           case 3:
               tunjanganGolongan = 1500000;
           break;
           default:
           tunjanganGolongan=0;
            }
                   
        return tunjanganGolongan;
    }

    public float tunjanganJabatan(String jabatan) {
      if("Manager".equals(jabatan)){
          tunjanganJabatan=2000000;
      }else if("Kabag".equals(jabatan)){
          tunjanganJabatan=1000000;   
      }else{
          tunjanganJabatan=0;
      }
    return tunjanganJabatan;
    }

    public float tunjanganKehadiran(int kehadiran) {
    tunjanganKehadiran = kehadiran*10000;
        
    return tunjanganKehadiran;
    }
   
    public float gajiTotal(){
    float gaji = tunjanganJabatan+tunjanganGolongan+tunjanganKehadiran;    
    return gaji;    
    }
   
}
