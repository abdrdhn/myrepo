// Class utama: PenyetanHK
class PenyetanHK {
    // Atribut (properties)
    int nokios;
    String namapenjual;
    String notelepom;
    String[] menu;
    int[] harga;

    // Constructor
    PenyetanHK(int nokios, String namapenjual, String notelepom, String[] menu, int[] harga) {
        this.nokios = nokios;
        this.namapenjual = namapenjual;
        this.notelepom = notelepom;
        this.menu = menu;
        this.harga = harga;
    }

    // Function: menampilkan informasi kios
    void tampilkanInfo() {
        System.out.println("=== Informasi Kios Penyetan HK ===");
        System.out.println("No Kios      : " + nokios);
        System.out.println("Nama Penjual : " + namapenjual);
        System.out.println("No Telepon   : " + notelepom);
    }

    // Function: menampilkan daftar menu
    void tampilkanMenu() {
        System.out.println("\n--- Daftar Menu ---");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i] + "\t- Rp" + harga[i]);
        }
    }
}

// Class utama program
public class Main {
    public static void main(String[] args) {
        // Data menu sesuai tabel
        String[] menu = {"Ayam Penyet", "Ayam Geprek", "Ayam Bakar", "Ayam Rica", "Ati Ampela"};
        int[] harga = {15000, 15000, 15000, 15000, 10000};

        // Membuat objek PenyetanHK
        PenyetanHK kios4 = new PenyetanHK(
            4,
            "Bpk Prayogo & Ibu Swiwahyuni",
            "81381908326",
            menu,
            harga
        );

        // Memanggil fungsi
        kios4.tampilkanInfo();
        kios4.tampilkanMenu();
    }
}
