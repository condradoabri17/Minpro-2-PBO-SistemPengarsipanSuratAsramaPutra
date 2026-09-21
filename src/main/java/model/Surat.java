/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class Surat {
    protected int urutanSurat;
    protected String nomorSurat;
    protected String perihal;
    
    public Surat(int urutanSurat, String nomorSurat, String perihal) {
        this.urutanSurat=urutanSurat;
        this.nomorSurat=nomorSurat;
        this.perihal=perihal;
    }
    
    public int getUrutanSurat(){
        return urutanSurat;
    }
    
    public String getNomorSurat(){
        return nomorSurat;
    }
    
    public String getPerihal(){
        return perihal;
    }
    
    public void setUrutanSurat (int urutanSurat) {
        this.urutanSurat = urutanSurat; 
    }
    
    public void setNomorSurat (String nomorSurat) {
        this.nomorSurat = nomorSurat; 
    }
    
    public void setPerihal (String perihal) {
        this.perihal = perihal; 
    }
    
    public void tampilkanDaftarSurat(){
        System.out.println("Urutan Surat: " + urutanSurat);
        System.out.println("Nomor Surat: " + nomorSurat);
        System.out.println("Perihal: " + perihal);
    }
}
