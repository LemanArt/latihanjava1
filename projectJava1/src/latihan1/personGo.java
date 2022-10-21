/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author Leman
 */
public class personGo {

    public static void main(String[] args) {
        person Anton = new person();
        person Riko = new person();

        Anton.Nama = "Anton";
        Anton.JenisKelamin = "Laki-laki";
        Anton.Umur = 19;

        Riko.Nama = "Riko";
        Riko.JenisKelamin = "Laki-laki";
        Riko.Umur = 21;

        System.out.println("Nama: " + Anton.Nama);
        System.out.println("JenisKelamin: " + Anton.JenisKelamin);
        System.out.println("Umur: " + Anton.Umur);
        System.out.println("\nNama: " + Riko.Nama);
        System.out.println("JenisKelamin: " + Riko.JenisKelamin);
        System.out.println("Umur: " + Riko.Umur);
    }
}
