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

class Baterai {
    private final float kuatArus;
    private final float hambatan;
    
    public Baterai(){
        this.kuatArus = 0;
        this.hambatan = 0;
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar "+"\n"+
                           "akan berbanding lurus dengan beda potensial "+"\n"+ 
                           "pada ujung-ujung kawat penghantar tersebut "+"\n"+
                           "asalkan suhu kawat dijaga konstan"+"\n");
    }
    
    public Baterai(float kuatArus, float hambatan){
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }
    
    public float getKuatArus(){
        return kuatArus;
    }
    
    public float getHambatan(){
        return hambatan;
    }
    
    public float hitungTegangan(){
        float tegangan;
        tegangan = kuatArus * hambatan;
        System.out.println("Hasil Tegangan : "+tegangan+" volt");
        return tegangan;
    }
}
