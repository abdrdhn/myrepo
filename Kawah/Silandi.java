class Kios {
    // Atribut lama
    int noKios;
    String namaPenjual;
    String noTelepon;
    String[] menu;
    int[] harga;
    String[] tambahan;
    int[] hargaTambahan;
    String lokasi;
    String jamBuka;
    String jamTutup;
    String metodePembayaran;
    String hariOperasional;
    int jumlahKaryawan;

    // Konstruktor
    Kios(int noKios, String namaPenjual, String noTelepon,
         String[] menu, int[] harga,
         String[] tambahan, int[] hargaTambahan,
         String lokasi, String jamBuka, String jamTutup,
         String metodePembayaran, String hariOperasional, int jumlahKaryawan) {
        this.noKios = noKios;
        this.namaPenjual = namaPenjual;
        this.noTelepon = noTelepon;
        this.menu = menu;
        this.harga = harga;
        this.tambahan = tambahan;
        this.hargaTambahan = hargaTambahan;
        this.lokasi = lokasi;
        this.jamBuka = jamBuka;
        this.jamTutup = jamTutup;
        this.metodePembayaran = metodePembayaran;
        this.hariOperasional = hariOperasional;
        this.jumlahKaryawan = jumlahKaryawan;
    }

    void tampilkanInfo() {
        System.out.println("=================================");
        System.out.println("     INFORMASI KIOS SILANDI      ");
        System.out.println("=================================");
        System.out.println("No Kios          : " + noKios);
        System.out.println("Nama Penjual     : " + namaPenjual);
        System.out.println("No Telepon       : " + noTelepon);
        System.out.println("Lokasi           : " + lokasi);
        System.out.println("Jam Operasional  : " + jamBuka + " - " + jamTutup);
        System.out.println("Hari Operasional : " + hariOperasional);
        System.out.println("Metode Pembayaran: " + metodePembayaran);
        System.out.println("Jumlah Karyawan  : " + jumlahKaryawan);
        System.out.println("=================================\n");
    }

    void tampilkanMenu() {
        System.out.println("========== DAFTAR MENU ==========");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-20s Rp%,d%n", menu[i], harga[i]);
        }
        System.out.println("=================================\n");
    }

    void tampilkanTambahan() {
        System.out.println("========= MENU TAMBAHAN =========");
        for (int i = 0; i < tambahan.length; i++) {
            System.out.printf("%-20s Rp%,d%n", tambahan[i], hargaTambahan[i]);
        }
        System.out.println("=================================");
    }
}

public class Silandi {
    public static void main(String[] args) {
        String[] menu = {"Paket Nasi Telor", "Paket Nasi Ayam", "Paket Nasi Ikan"};
        int[] harga = {10000, 13000, 18000};

        String[] tambahan = {"Tahu/Tempe", "Telor"};
        int[] hargaTambahan = {2000, 2000};

        Kios kios8 = new Kios(
            8,
            "Ibu Namira",
            "08561081638",
            menu,
            harga,
            tambahan,
            hargaTambahan,
            "Sebelah Barat Kantin",   // lokasi
            "08:00",                 // jam buka
            "16:00",                 // jam tutup
            "Cash, QRIS",            // metode pembayaran
            "Senin - Jumat",         // hari operasional
            2                        // jumlah karyawan
        );

        kios8.tampilkanInfo();
        kios8.tampilkanMenu();
        kios8.tampilkanTambahan();
    }
}
