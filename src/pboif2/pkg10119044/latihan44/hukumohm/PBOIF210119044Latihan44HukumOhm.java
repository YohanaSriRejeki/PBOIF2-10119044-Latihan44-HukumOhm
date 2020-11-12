/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan44.hukumohm;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan hasil perhitungan hukum
 * ohm
 */

public class PBOIF210119044Latihan44HukumOhm {
    public static void main(String[] args) {
        Baterai objBaterai = new Baterai();
        Baterai objBaterai2 = new Baterai(3, 12);
        System.out.println("Kuat Arus : "+objBaterai2.getKuatArus()+" ampere");
        System.out.println("Hambatan : "+objBaterai2.getHambatan()+" ohm");
        objBaterai2.hitungTegangan();    
    }    
}
