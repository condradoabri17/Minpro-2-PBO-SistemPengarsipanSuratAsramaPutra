/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class Penghuni {
    private String nama;
    private String nim;
    private String asalDaerah;
    private String fakultas;
    private String jurusan;
    private String status;
        
    public Penghuni(String nama, String nim, String asalDaerah,
        String fakultas, String jurusan, String status) {
        
        this.nama = nama;
        this.nim = nim;
        this.asalDaerah = asalDaerah;
        this.fakultas = fakultas;
        this.jurusan = jurusan;
        this.status = status;
    }
        
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getAsalDaerah() {
         return asalDaerah;
    }

    public void setAsalDaerah(String asalDaerah) {
        this.asalDaerah = asalDaerah;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
       this.status = status;
   }
}

    
