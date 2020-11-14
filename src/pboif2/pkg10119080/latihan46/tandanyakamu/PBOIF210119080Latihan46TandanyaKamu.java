/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * (OBJECT ORIENTED) Tandanya Kamu
 */
public class PBOIF210119080Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Age umur = new Age(2020);
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        umur.setYearBirth(scanner.nextInt());
        
        System.out.println();
        System.out.println("======Hasil Perhitungan Umur======");
        int yearBirth = umur.getYearBirth();
        System.out.println("Tahun lahir anda : " + yearBirth);
        int yearNow = umur.getYearNow();
        System.out.println("Hari ini tahun : " + yearNow);
        int usia = umur.hitungUmur();
        System.out.println("Umur kamu sampai hari ini adalah " + usia + " tahun");
        System.out.println("Tandanya Kamu " + umur.tandanyaKamu(usia));
    }
    
}