/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;
import model.SuratKeluar;
import model.SuratMasuk;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ArsipSuratAsmaul {
    static Scanner input = new Scanner(System.in);
    static ArrayList<SuratMasuk> daftarSuratMasuk = new ArrayList<>();
    static ArrayList<SuratKeluar> daftarSuratKeluar = new ArrayList<>();
    
    public static void main(String[] args) {
        
        int pilihan;
        
        do{
            System.out.println("============================");
            System.out.println("SISTEM ARSIP SURAT ASRAMA MAHASISWA UNMUL (ASMAUL)\n");
            System.out.println("1. Kelola Surat Masuk");
            System.out.println("2. kelola Surat Keluar");
            System.out.println("0. Keluar");
            System.out.println("=============================");
            
            System.out.println("Pilih menu: ");
            pilihan = Integer.parseInt(input.nextLine());
            
            if (pilihan == 1) {
                menuSuratMasuk();
            }
            else if (pilihan == 2) {
                menuSuratKeluar();
            } else if (pilihan == 0) {
                System.out.println("Program selesai. Terima kasih!");
            } else {
                System.out.println("Pilihan menu tidak valid!");
            }
        } while (pilihan != 0);
    }
    
    public static void menuSuratMasuk() {
        
        int pilihanMasuk;

        do{
            System.out.println("============================");
            System.out.println("MENU SURAT MASUK\n");
            System.out.println("1. Tampilkan Surat Masuk");
            System.out.println("2. Tambah Surat Masuk");
            System.out.println("3. Edit Surat Masuk");
            System.out.println("4. Hapus Surat Masuk");
            System.out.println("0. Kembali");
            System.out.println("============================="); 
            
            System.out.println("Pilih Menu: ");
            pilihanMasuk = Integer.parseInt(input.nextLine());
            
            if(pilihanMasuk == 1) {
                if (daftarSuratMasuk.isEmpty()) {
                    System.out.println("\nBelum ada data surat masuk.");
                } else {
                    for (int i = 0; i < daftarSuratMasuk.size(); i++) {
                        System.out.println("\nData Surat ke-" + (i + 1));
                        daftarSuratMasuk.get(i).tampilkanSuratMasuk();
                    }
                }
            }  
            else if(pilihanMasuk == 2) {
                tambahSuratMasuk();
            }
            else if(pilihanMasuk == 3){
                editSuratMasuk();
            }
            else if(pilihanMasuk == 4){
                hapusSuratMasuk();
            }
            else if (pilihanMasuk == 0) {
                System.out.println("Kembali ke menu utama");
            } else {
                System.out.println("Pilihan menu tidak valid!");
            }
        } while (pilihanMasuk != 0);
    }
    
    
    public static void tambahSuratMasuk() {
        System.out.println("\n==========================");
        System.out.println("TAMBAH SURAT MASUK");
        
        System.out.println("Urutan Surat: ");
        int urutanSurat = Integer.parseInt(input.nextLine());
        
        System.out.println("Nomor Surat: ");
        String nomorSurat = input.nextLine();
        
        System.out.println("Perihal: ");
        String perihal = input.nextLine();
        
        System.out.println("Tanggal Masuk Surat: ");
        String tanggalMasukSurat = input.nextLine();
        
        System.out.println("Pengirim: ");
        String pengirim = input.nextLine();
        
        SuratMasuk suratBaru = new SuratMasuk(
            urutanSurat,
            nomorSurat,
            perihal,
            tanggalMasukSurat,
            pengirim
        );
        
        daftarSuratMasuk.add(suratBaru);
        
        System.out.println("Surat Masuk Berhasil Ditambah");
    }
    
    public static void editSuratMasuk(){
        System.out.println("==========================");
        System.out.println("EDIT SURAT MASUK");
        
        System.out.print("Masukkan nomor data yang ingin diedit: ");
        int nomorData = Integer.parseInt(input.nextLine());

        SuratMasuk surat = daftarSuratMasuk.get(nomorData - 1);

        System.out.print("Nomor Surat baru: ");
        String nomorSurat = input.nextLine();

        System.out.print("Perihal baru: ");
        String perihal = input.nextLine();

        System.out.print("Tanggal Surat Masuk baru: ");
        String tanggalMasukSurat = input.nextLine();

        System.out.print("Pengirim baru: ");
        String pengirim = input.nextLine();

        surat.setNomorSurat(nomorSurat);
        surat.setPerihal(perihal);
        surat.setTanggalMasukSurat(tanggalMasukSurat);
        surat.setPengirim(pengirim);

        System.out.println("Surat masuk berhasil diedit!");
    }
    
    public static void hapusSuratMasuk() {
       System.out.print("Masukkan nomor data yang ingin dihapus: ");
       int nomorData = Integer.parseInt(input.nextLine());
       daftarSuratMasuk.remove(nomorData - 1);
       System.out.println("Surat masuk berhasil dihapus!");
    }
    
    public static void menuSuratKeluar() {

        int pilihanKeluar;

        do {
            System.out.println("============================");
            System.out.println("MENU SURAT KELUAR\n");
            System.out.println("1. Tampilkan Surat Keluar");
            System.out.println("2. Tambah Surat Keluar");
            System.out.println("3. Edit Surat Keluar");
            System.out.println("4. Hapus Surat Keluar");
            System.out.println("0. Kembali");
            System.out.println("============================");

            System.out.print("Pilih Menu: ");
            pilihanKeluar = Integer.parseInt(input.nextLine());

            if (pilihanKeluar == 1) {
                for (int i = 0; i < daftarSuratKeluar.size(); i++) {
                    System.out.println("\nData Surat ke-" + (i + 1));
                    daftarSuratKeluar.get(i).tampilkanSuratKeluar();
                }
            } else if (pilihanKeluar == 2) {
                tambahSuratKeluar();
            } else if (pilihanKeluar == 3) {
                editSuratKeluar();
            } else if (pilihanKeluar == 4) {
                hapusSuratKeluar();
            } else if (pilihanKeluar == 0) {
                System.out.println("Kembali ke menu utama");
            } else {
                System.out.println("Pilihan menu tidak valid!");
            }

        } while (pilihanKeluar != 0);
    }
    
    public static void tambahSuratKeluar() {
        System.out.println("\n==========================");
        System.out.println("TAMBAH SURAT KELUAR");

        System.out.println("Pilih Kategori Surat (angkanya saja): ");

        System.out.println("1. SK - Surat Keputusan");
        System.out.println("2. SU - Surat Undangan");
        System.out.println("3. SPm - Surat Permohonan");
        System.out.println("4. SPb - Surat Pemberitahuan");
        System.out.println("5. SPp - Surat Peminjaman");
        System.out.println("6. SP - Surat Peringatan");
        System.out.println("7. SM - Surat Mandat");
        System.out.println("8. ST - Surat Tugas");
        System.out.println("9. SKet - Surat Keterangan");
        System.out.println("10. SR - Surat Rekomendasi");
        System.out.println("11. SB - Surat Balasan");
        System.out.println("12. SRT - Sertifikat");
        System.out.println("13. SPg - Surat Panggilan");

        System.out.print("Pilih kategori: ");
        int kategoriSurat = Integer.parseInt(input.nextLine());

        System.out.print("Urutan Surat: ");
        int urutanSurat = Integer.parseInt(input.nextLine());

        String kodeKategori;

        if (kategoriSurat == 1) {
            kodeKategori = "SK";
        } else if (kategoriSurat == 2) {
            kodeKategori = "SU";
        } else if (kategoriSurat == 3) {
            kodeKategori = "SPm";
        } else if (kategoriSurat == 4) {
            kodeKategori = "SPb";
        } else if (kategoriSurat == 5) {
            kodeKategori = "SPp";
        } else if (kategoriSurat == 6) {
            kodeKategori = "SP";
        } else if (kategoriSurat == 7) {
            kodeKategori = "SM";
        } else if (kategoriSurat == 8) {
            kodeKategori = "ST";
        } else if (kategoriSurat == 9) {
            kodeKategori = "SKet";
        } else if (kategoriSurat == 10) {
            kodeKategori = "SR";
        } else if (kategoriSurat == 11) {
            kodeKategori = "SB";
        } else if (kategoriSurat == 12) {
            kodeKategori = "SRT";
        } else if (kategoriSurat == 13) {
            kodeKategori = "SPg";
        } else {
            System.out.println("Kategori tidak valid!");
            return;
        }

        String nomorSurat = kodeKategori + "/" + String.format("%03d", urutanSurat)+ "/UKMAsramaPutra";

        System.out.println("Nomor Surat: " + nomorSurat);

        System.out.print("Perihal: ");
        String perihal = input.nextLine();

        System.out.print("Tanggal Keluar Surat: ");
        String tanggalKeluarSurat = input.nextLine();

        System.out.print("Penerima: ");
        String penerima = input.nextLine();

        SuratKeluar suratBaru = new SuratKeluar(
                urutanSurat,
                nomorSurat,
                perihal,
                kategoriSurat,
                tanggalKeluarSurat,
                penerima
        );

        daftarSuratKeluar.add(suratBaru);

        System.out.println("Surat keluar berhasil ditambahkan!");
    }
    
    public static void editSuratKeluar() {
        System.out.println("\n==========================");
        System.out.println("EDIT SURAT KELUAR");

        System.out.print("Masukkan nomor data yang ingin diedit: ");
        int nomorData = Integer.parseInt(input.nextLine());

        SuratKeluar surat = daftarSuratKeluar.get(nomorData - 1);

        System.out.println("\nPilih Kategori Surat:");
        System.out.println("1. SK - Surat Keputusan");
        System.out.println("2. SU - Surat Undangan");
        System.out.println("3. SPm - Surat Permohonan");
        System.out.println("4. SPb - Surat Pemberitahuan");
        System.out.println("5. SPp - Surat Peminjaman");
        System.out.println("6. SP - Surat Peringatan");
        System.out.println("7. SM - Surat Mandat");
        System.out.println("8. ST - Surat Tugas");
        System.out.println("9. SKet - Surat Keterangan");
        System.out.println("10. SR - Surat Rekomendasi");
        System.out.println("11. SB - Surat Balasan");
        System.out.println("12. SRT - Sertifikat");
        System.out.println("13. SPg - Surat Panggilan");

        System.out.print("Pilih kategori baru: ");
        int kategoriSurat = Integer.parseInt(input.nextLine());

        String kodeKategori;

        if (kategoriSurat == 1) {
            kodeKategori = "SK";
        } else if (kategoriSurat == 2) {
            kodeKategori = "SU";
        } else if (kategoriSurat == 3) {
            kodeKategori = "SPm";
        } else if (kategoriSurat == 4) {
            kodeKategori = "SPb";
        } else if (kategoriSurat == 5) {
            kodeKategori = "SPp";
        } else if (kategoriSurat == 6) {
            kodeKategori = "SP";
        } else if (kategoriSurat == 7) {
            kodeKategori = "SM";
        } else if (kategoriSurat == 8) {
            kodeKategori = "ST";
        } else if (kategoriSurat == 9) {
            kodeKategori = "SKet";
        } else if (kategoriSurat == 10) {
            kodeKategori = "SR";
        } else if (kategoriSurat == 11) {
            kodeKategori = "SB";
        } else if (kategoriSurat == 12) {
            kodeKategori = "SRT";
        } else if (kategoriSurat == 13) {
            kodeKategori = "SPg";
        } else {
            System.out.println("Kategori tidak valid!");
            return;
        }

        System.out.print("Urutan Surat baru: ");
        int urutanSurat = Integer.parseInt(input.nextLine());

        String nomorSurat = kodeKategori + "/"
                + String.format("%03d", urutanSurat)
                + "/UKMAsramaPutra";

        System.out.println("Nomor Surat baru: " + nomorSurat);

        System.out.print("Perihal baru: ");
        String perihal = input.nextLine();

        System.out.print("Tanggal Keluar Surat baru: ");
        String tanggalKeluarSurat = input.nextLine();

        System.out.print("Penerima baru: ");
        String penerima = input.nextLine();

        surat.setUrutanSurat(urutanSurat);
        surat.setNomorSurat(nomorSurat);
        surat.setPerihal(perihal);
        surat.setKategoriSurat(kategoriSurat);
        surat.setTanggalKeluarSurat(tanggalKeluarSurat);
        surat.setPenerima(penerima);

        System.out.println("Surat keluar berhasil diedit!");
    }
    
    public static void hapusSuratKeluar() {
        System.out.print("Masukkan nomor data yang ingin dihapus: ");
        int nomorData = Integer.parseInt(input.nextLine());

        daftarSuratKeluar.remove(nomorData - 1);

        System.out.println("Surat keluar berhasil dihapus!");
    }

}
