/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.soal;
import mahasiswa.Mahasiswa;
import java.util.Scanner;
/**
 *  
 * @author TRA-NB-HP-24
 */
public class LatihanSoal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[10];
        Scanner input = new Scanner(System.in);
        int perintah = 0, mulai_dari = 0, jumlah_data=0;
        
        do{
            System.out.println("");
            System.out.println("");
                
            System.out.println("===Menu===");
            System.out.println("1. Input Data (input data-data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Keluar Program");
            
            System.out.print("\nMasukkan Perintah : ");
            perintah = input.nextInt();
            
            if(perintah < 1 || perintah > 3){
                System.out.println("Perintah tidak dikenal, anda automatis keluar aplikasi");
                break;
            }
                
            if(perintah == 1){
                System.out.print("\nInput jumlah data yang ingin diinput (max: 10): ");
                if(jumlah_data>10){
                    jumlah_data = 10;
                }else{
                    jumlah_data = input.nextInt();
                }
             
                for (; mulai_dari < jumlah_data; mulai_dari++) {
                    if(mulai_dari >= 10 ){
                        System.out.println("Data sudah penuh");
                        mulai_dari = 10;
                        break;
                    }else{
                        System.out.println("\nInput data ke " + (mulai_dari + 1));
                        daftarMahasiswa[mulai_dari] = new Mahasiswa();
                        System.out.print("Nama : ");
                        input.nextLine();
                        daftarMahasiswa[mulai_dari].nama = input.nextLine();
                        System.out.print("NIM : ");
                        daftarMahasiswa[mulai_dari].nim = input.nextLine();
                        System.out.print("Nilai UTS : ");
                        daftarMahasiswa[mulai_dari].uts = input.nextDouble();
                        System.out.print("Nilai UAS : ");
                        daftarMahasiswa[mulai_dari].uas = input.nextDouble();
                    }
                }
            } else if(perintah == 2){
                System.out.println("===========================");
                System.out.println("NIM\tNama\tUTS\tUAS");
                System.out.println("===========================");
                
                if(mulai_dari == 0){
                    System.out.println("Data Mahasiswa Masih Kosong.");
                }else{
                    for (int i = 0; i < mulai_dari; i++) {
                        System.out.println(daftarMahasiswa[i].nim + "\t" + daftarMahasiswa[i].nama + "\t" + daftarMahasiswa[i].uts + "\t" + daftarMahasiswa[i].uas);   
                    }
                }
            }
        }while(perintah != 3);
    }
    
}
