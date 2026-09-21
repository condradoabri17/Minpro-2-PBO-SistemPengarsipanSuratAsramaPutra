/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class SuratKeluar extends Surat {
    protected int kategoriSurat;
    protected String tanggalKeluarSurat;
    protected String penerima;

    public SuratKeluar(int urutanSurat, String nomorSurat, String perihal, int kategoriSurat, String tanggalKeluarSurat, String penerima) {
        super(urutanSurat, nomorSurat, perihal);
        this.kategoriSurat = kategoriSurat;
        this.tanggalKeluarSurat = tanggalKeluarSurat;
        this.penerima = penerima;
    }
    
    public String getKategoriSurat() {
        if (kategoriSurat == 1 ){
            return "SK"; //surat keputusan
        } else if (kategoriSurat == 2) {
            return "SU"; //surat undangan
        }
        else if (kategoriSurat == 3) {
            return "SPm"; //surat permohonan
        }
        else if (kategoriSurat == 4) {
            return "SPb"; //surat pemberitahuan
        }
        else if (kategoriSurat == 5) {
            return "SPp"; //surat peminjaman
        }
        else if (kategoriSurat == 6) {
            return "SP"; //surat peringatan
        }
        else if (kategoriSurat == 7) {
            return "SM"; //surat mandat
        }
        else if (kategoriSurat == 8) {
            return "ST"; //surat tugas
        }
        else if (kategoriSurat == 9) {
            return "SKet"; //surat Keterangan
        }
        else if (kategoriSurat == 10) {
            return "SR"; //surat Rekomendasi
        }
        else if (kategoriSurat == 11) {
            return "SB"; //surat Balasan
        }
        else if (kategoriSurat == 12) {
            return "SRT"; //sertifikat
        }
        else if (kategoriSurat == 13) {
            return "SPg"; //surat panggilan
        }
        else {
            return "Input tidak valid";
        }
    }
    
    public String getTanggalKeluarSurat() {
        return tanggalKeluarSurat;
    }
    
    public String getPenerima() {
        return penerima;
    }
    
    public void setKategoriSurat(int kategoriSurat) {
        this.kategoriSurat = kategoriSurat;
    }
    
    public void setTanggalKeluarSurat(String tanggalKeluarSurat) {
        this.tanggalKeluarSurat = tanggalKeluarSurat;
    }
    
    public void setPenerima(String penerima) {
        this.penerima = penerima;
    }
    
    public void tampilkanSuratKeluar () {
        System.out.println("==========================");
        System.out.println("DAFTAR SURAT KELUAR");
        super.tampilkanDaftarSurat();
        System.out.println("Kategori Surat: " + getKategoriSurat());
        System.out.println("Tanggal Surat Keluar: " + tanggalKeluarSurat);
        System.out.println("Penerima: " + penerima);
    }
    
}
