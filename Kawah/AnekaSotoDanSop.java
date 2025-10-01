// Class : Menu
class Menu {
    String nama;
    int harga;

    // Constructor
    Menu(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Tampilkan menu
    void tampilkan(int nomor) {
        System.out.printf("%-2d. %-25s Rp%d%n", nomor, nama, harga);
    }
}

// Class : Kios
class Kios {
    int noKios;
    String namaKios;
    String namaPenjual;
    String noTelepon;

    // Constructor
    Kios(int noKios, String namaKios, String namaPenjual, String noTelepon) {
        this.noKios = noKios;
        this.namaKios = namaKios;
        this.namaPenjual = namaPenjual;
        this.noTelepon = noTelepon;
    }

    void tampilkanInfo() {
        System.out.println("===============================================");
        System.out.println("   SELAMAT DATANG DI KIOS ANEKA SOTO DAN SOP   ");
        System.out.println("===============================================");
        System.out.println("No Kios     : " + noKios);
        System.out.println("Nama Kios   : " + namaKios);
        System.out.println("Nama Penjual: " + namaPenjual);
        System.out.println("No Telepon  : " + noTelepon);
        System.out.println("=============================================\n");
    }
}

// Class utama
public class AnekaSotoDanSop {
    public static void main(String[] args) {
        // Buat objek kios
        Kios kios7 = new Kios(
            7,
            "Aneka Soto dan Sop",
            "Ibu Puji Astuti",
            "0812 9190 3502"
        );

        // Tampilkan info kios
        kios7.tampilkanInfo();

        // Daftar menu
        Menu[] daftarMenu = {
            new Menu("Soto Daging", 13000),
            new Menu("Soto Betawi", 13000),
            new Menu("Soto Ayam", 12000),
            new Menu("Soto Campur", 15000),
            new Menu("Soto Mie", 13000),
            new Menu("Sop Iga", 20000),
            new Menu("Sop Daging", 13000),
            new Menu("Sop Kimlo", 13000),
            new Menu("Sop Ayam", 12000),
            new Menu("Sop Telur Puyuh Bakso", 12000),
            new Menu("Nasi Putih", 5000)
        };

        // Tampilkan menu
        System.out.println("          >>> DAFTAR MENU <<<      ");
        System.out.println("-----------------------------------");
        int nomor = 1;
        for (Menu m : daftarMenu) {
            m.tampilkan(nomor++);
        }
        System.out.println("-----------------------------------");
        System.out.println("Pesan langsung bayar ");
        System.out.println("Terima pesanan : 081291903502 (Puji Astuti)");
        System.out.println("Take Away + Rp2.000");
        System.out.println("==================================");
    }
}
