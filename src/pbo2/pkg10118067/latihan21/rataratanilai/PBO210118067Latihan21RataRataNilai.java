/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan21.rataratanilai;

import java.util.Scanner;
/**
 *
 *  Agus Awaludin
 *  IF2
 *  10118067
 *  Latihan ini besisi tentang bagaimana mencari rata" nilai
 */
public class PBO210118067Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        Scanner scanner = new Scanner(System.in);
        int jumlah = scanner.nextInt();
        
        double nilai = 0.0;
        
        for(int i=1; i<=jumlah; i++){
            System.out.print("Nilai Mahasiswa ke-"+i + " : ");
            nilai += scanner.nextDouble();
            
        }
        
        System.out.println("Maka, Rata-rata Nilainya adalah " + (nilai/jumlah));
        
        
    }
    
}
