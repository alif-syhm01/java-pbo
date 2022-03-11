/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisPertemuan1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author asus
 */
public class classBufferReaderQuiz {
    public static void main(String[] args) throws IOException {
        String campusName, studentName, nim, joinCampus;
        
        System.out.println("Tampilan Input Data");
        
        InputStreamReader objIsr = new InputStreamReader(System.in);
        
        BufferedReader objBr = new BufferedReader(objIsr);
        
        // Memberikan perintah input data kepada user
        System.out.print("Masukkan Nama Kampus : ");
        // Membaca inputan dari user dan menyimpannya kedalam objek menggunakan Scanner berupa string
        campusName = objBr.readLine();
        
        // Memberikan perintah input data kepada user
        System.out.print("Masukkan Nama Anda : ");
        // Membaca inputan dari user dan menyimpannya kedalam objek menggunakan Scanner berupa string
        studentName = objBr.readLine();
        
        // Memberikan perintah input data kepada user
        System.out.print("Masukkan NIM : ");
        // Membaca inputan dari user dan menyimpannya kedalam objek menggunakan Scanner berupa string
        nim = objBr.readLine();
        
        // Memberikan perintah input data kepada user
        System.out.print("Tanggal Masuk ke Kampus : ");
        // Membaca inputan dari user dan menyimpannya kedalam objek menggunakan Scanner berupa string
        joinCampus = objBr.readLine();
        
        System.out.println("");
        System.out.println("Data yang ditampilkan");
        System.out.println("Kampus : " + campusName);
        System.out.println("Nama : " + studentName);
        System.out.println("NIM : " + nim);
        System.out.println("Join Kampus : " + joinCampus);
    }
}
