/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.penjualan;

/**
 *
 * @author LIKMI
 */
public class BrgModel {
    private String kodebrg, namabrg, gambar;
    private double tarif;
    
    public String getKodebrg(){
        return this.kodebrg;
    }
    public void setKodebrg(String kodebrg){
        this.kodebrg = kodebrg;
    }
    
    public String getNamabrg(){
        return this.namabrg;
    }
    public void setNamabrg(String namabrg){
        this.namabrg = namabrg;
    }
    
    public Double getTarif(){
        return this.tarif;
    }
    public void setTarif(Double tarif){
        this.tarif = tarif;
    }
    
    public String getGambar(){
        return this.gambar;
    }
    public void setGambar(String gambar){
        this.gambar = gambar;
    }
    
    
}
