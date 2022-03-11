/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisPertemuan1;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class classScannerQuiz {
    public static void main(String[] args) {
        String campusName, studentName, nim, joinCampus;
        
        System.out.println("Tampilan Input Data");
        
        // Memanggil objek untuk menampung data yang telah diinputkan dan akan dipanggil
        Scanner objScanner = new Scanner(System.in);
    
        // Memberikan perintah input data kepada user
        System.out.print("Masukkan Nama Kampus : ");
        // Membaca inputan dari user dan menyimpannya kedalam objek menggunakan Scanner berupa string
        campusName = objScanner.nextLine();
        
        // Memberikan perintah input data kepada user
        System.out.print("Masukkan Nama Anda : ");
        // Membaca inputan dari user dan menyimpannya kedalam objek menggunakan Scanner berupa string
        studentName = objScanner.nextLine();
        
        // Memberikan perintah input data kepada user
        System.out.print("Masukkan NIM : ");
        // Membaca inputan dari user dan menyimpannya kedalam objek menggunakan Scanner berupa string
        nim = objScanner.nextLine();
        
        // Memberikan perintah input data kepada user
        System.out.print("Tanggal Masuk ke Kampus : ");
        // Membaca inputan dari user dan menyimpannya kedalam objek menggunakan Scanner berupa string
        joinCampus = objScanner.nextLine();
        
        System.out.println("");
        System.out.println("Data yang ditampilkan");
        System.out.println("Kampus : " + campusName);
        System.out.println("Nama : " + studentName);
        System.out.println("NIM : " + nim);
        System.out.println("Join Kampus : " + joinCampus);
    }
}
