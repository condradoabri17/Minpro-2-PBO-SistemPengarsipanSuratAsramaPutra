/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;
import model.SuratKeluar;
import model.SuratMasuk;
import model.Penghuni;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<SuratMasuk> daftarSuratMasuk = new ArrayList<>();
    static ArrayList<SuratKeluar> daftarSuratKeluar = new ArrayList<>();
    static ArrayList<Penghuni> daftarPenghuni = new ArrayList<>();
    
    public static void main(String[] args) {
        
        SuratMasuk suratMasuk1 = new SuratMasuk(
            "001/Fakultas-Teknik/2026",
            "Surat Undangan Rapat",
            "20-09-2026",
            "Fakultas Teknik"
        );

        SuratKeluar suratKeluar1 = new SuratKeluar(
            "Surat Permohonan Kegiatan",
            3,
            "21-09-2026",
            "Fakultas Teknik"
        );

        Penghuni penghuni1 = new Penghuni(
            "Aditya Harsa Arga Putra",
            "2409086008",
            "Balikpapan",
            "TEKNIK",
            "S1-Teknik Geologi",
            "PENGHUNI AKTIF"
        );

        Penghuni penghuni2 = new Penghuni(
            "Reno Abdul Firman",
            "2509066031",
            "Bau-Bau",
            "TEKNIK",
            "S1-Teknik Kimia",
            "PENGHUNI AKTIF"
        );

        Penghuni penghuni3 = new Penghuni(
            "Abdul Gafar",
            "2209076044",
            "Penajam",
            "TEKNIK",
            "S1-Teknik Elektro",
            "ALUMNI"
        );

        daftarPenghuni.add(penghuni1);
        daftarPenghuni.add(penghuni2);
        daftarPenghuni.add(penghuni3);
        daftarSuratMasuk.add(suratMasuk1);
        daftarSuratKeluar.add(suratKeluar1);

        int pilihan;

        do {
            System.out.println("============================");
            System.out.println("SISTEM ARSIP SURAT ASRAMA MAHASISWA UNMUL (ASMAUL)\n");
            System.out.println("1. Kelola Surat Masuk");
            System.out.println("2. Kelola Surat Keluar");
            System.out.println("3. Lihat Data Penghuni");
            System.out.println("0. Keluar");
            System.out.println("=============================");

            System.out.println("Pilih menu: ");
            pilihan = Integer.parseInt(input.nextLine());

            if (pilihan == 1) {
                menuSuratMasuk();
            }
            else if (pilihan == 2) {
                menuSuratKeluar();
            }
            else if (pilihan == 3) {
                menuPenghuni();
            }
            else if (pilihan == 0) {
                System.out.println("Program selesai. Terima kasih!");
            }
            else {
                System.out.println("Pilihan menu tidak valid!");
            }

        } while (pilihan != 0);
    }
    
    public static void menuPenghuni() {
        System.out.println("============================");
        System.out.println("DATA PENGHUNI");

        for (int i = 0; i < daftarPenghuni.size(); i++) {
            Penghuni penghuni = daftarPenghuni.get(i);

            System.out.println("\nData Penghuni ke-" + (i + 1));
            System.out.println("Nama: " + penghuni.getNama());
            System.out.println("NIM: " + penghuni.getNim());
            System.out.println("Asal Daerah: " + penghuni.getAsalDaerah());
            System.out.println("Fakultas: " + penghuni.getFakultas());
            System.out.println("Jurusan: " + penghuni.getJurusan());
            System.out.println("Status: " + penghuni.getStatus());
            System.out.println("----------------------------");
        }

        System.out.println("Kembali ke menu utama.");
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
                        daftarSuratMasuk.get(i).tampilkanDaftarSurat();
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
        
        System.out.println("Nomor Surat: ");
        String nomorSurat = input.nextLine();
        
        System.out.println("Perihal: ");
        String perihal = input.nextLine();
        
        System.out.println("Tanggal Masuk Surat: ");
        String tanggalMasukSurat = input.nextLine();
        
        System.out.println("Pengirim: ");
        String pengirim = input.nextLine();
        
        SuratMasuk suratBaru = new SuratMasuk(
            nomorSurat,
            perihal,
            tanggalMasukSurat,
            pengirim
        );
        
        daftarSuratMasuk.add(suratBaru);
        
        System.out.println("Surat Masuk Berhasil Ditambah");
    }
    
    public static void editSuratMasuk() {
        System.out.println("==========================");
        System.out.println("EDIT SURAT MASUK");

        System.out.print("Masukkan Urutan Surat yang ingin diedit: ");
        int nomorData = Integer.parseInt(input.nextLine());

        SuratMasuk surat = daftarSuratMasuk.get(nomorData - 1);

        System.out.print("Nomor Surat baru (" + surat.getNomorSurat() + "): ");
        String nomorSurat = input.nextLine();

        System.out.print("Perihal baru (" + surat.getPerihal() + "): ");
        String perihal = input.nextLine();

        System.out.print("Tanggal Surat Masuk baru (" + surat.getTanggalMasukSurat() + "): ");
        String tanggalMasukSurat = input.nextLine();

        System.out.print("Pengirim baru (" + surat.getPengirim() + "): ");
        String pengirim = input.nextLine();

        if (!nomorSurat.isEmpty()) {
            surat.setNomorSurat(nomorSurat);
        }

        if (!perihal.isEmpty()) {
            surat.setPerihal(perihal);
        }

        if (!tanggalMasukSurat.isEmpty()) {
            surat.setTanggalMasukSurat(tanggalMasukSurat);
        }

        if (!pengirim.isEmpty()) {
            surat.setPengirim(pengirim);
        }

        System.out.println("Surat masuk berhasil diedit!");
    }
    
    public static void hapusSuratMasuk() {
       System.out.print("Masukkan nomor data yang ingin dihapus: ");
       int nomorData = Integer.parseInt(input.nextLine());
       daftarSuratMasuk.remove(nomorData - 1);
       System.out.println("Surat masuk berhasil dihapus!");
    }
    
    
//    menu surat keluar
    
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
                    daftarSuratKeluar.get(i).tampilkanDaftarSurat();
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

        if (kategoriSurat < 1 || kategoriSurat > 13) {
            System.out.println("Kategori surat tidak valid!");
            return;
        }

        System.out.print("Perihal: ");
        String perihal = input.nextLine();

        System.out.print("Tanggal Keluar Surat (DD-MM-YYYY): ");
        String tanggalKeluarSurat = input.nextLine();

        System.out.print("Penerima: ");
        String penerima = input.nextLine();

        SuratKeluar suratBaru = new SuratKeluar(
                perihal,
                kategoriSurat,
                tanggalKeluarSurat,
                penerima
        );

        daftarSuratKeluar.add(suratBaru);
        System.out.println("Nomor Surat: " + suratBaru.getNomorSurat());

        System.out.println("Surat keluar berhasil ditambahkan!");
    }
    
    public static void editSuratKeluar() {
        System.out.println("==========================");
        System.out.println("EDIT SURAT KELUAR");

        System.out.print("Masukkan Urutan Surat yang ingin diedit: ");
        int nomorData = Integer.parseInt(input.nextLine());

        SuratKeluar surat = daftarSuratKeluar.get(nomorData - 1);

        System.out.print("Perihal baru (" + surat.getPerihal() + "): ");
        String perihal = input.nextLine();

        System.out.print("Tanggal Keluar Surat baru (" + surat.getTanggalKeluarSurat() + "): ");
        String tanggalKeluarSurat = input.nextLine();

        System.out.print("Penerima baru (" + surat.getPenerima() + "): ");
        String penerima = input.nextLine();

        if (!perihal.isEmpty()) {
            surat.setPerihal(perihal);
        }

        if (!tanggalKeluarSurat.isEmpty()) {
            surat.setTanggalKeluarSurat(tanggalKeluarSurat);
        }

        if (!penerima.isEmpty()) {
            surat.setPenerima(penerima);
        }

        System.out.println("Surat keluar berhasil diedit!");
    }
    
    public static void hapusSuratKeluar() {
        System.out.print("Masukkan nomor data yang ingin dihapus: ");
        int nomorData = Integer.parseInt(input.nextLine());

        daftarSuratKeluar.remove(nomorData - 1);

        System.out.println("Surat keluar berhasil dihapus!");
    }

}
