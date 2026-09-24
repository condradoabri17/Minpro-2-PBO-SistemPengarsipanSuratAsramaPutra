/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class SuratMasuk extends Surat {
    public static int urutanSuratBerikutnya = 1;
    protected String tanggalMasukSurat;
    protected String pengirim;
    
    public SuratMasuk(String nomorSurat, String perihal, String tanggalMasukSurat,String pengirim){
        super(urutanSuratBerikutnya, nomorSurat, perihal);
        this.tanggalMasukSurat = tanggalMasukSurat;
        this.pengirim =  pengirim;
        urutanSuratBerikutnya++;
    } 
    
    public String getTanggalMasukSurat() {
        return tanggalMasukSurat;
    }
    
    public String getPengirim() {
        return pengirim;
    }
    
    public void setTanggalMasukSurat (String tanggalMasukSurat) {
        this.tanggalMasukSurat = tanggalMasukSurat;
    }
    
    public void setPengirim (String pengirim) {
        this.pengirim = pengirim;
    }
    
    @Override
    public void tampilkanDaftarSurat() {
        System.out.println("==========================");
        System.out.println("DAFTAR SURAT MASUK");
        super.tampilkanDaftarSurat();
        System.out.println("Tanggal Surat Masuk: " + tanggalMasukSurat);
        System.out.println("Pengirim: " + pengirim);
    }
}
