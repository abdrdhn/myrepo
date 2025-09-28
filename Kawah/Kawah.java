class FreshTastySquash {
    int noKios;
    String namaPenjual;
    String noTelepon;
    String[] menuMocktail;
    String[] menuSquash;
    String[] menuPopIce;
    String[] menuLainnya;
    int[] hargaMocktail;
    int[] hargaSquash;
    int[] hargaPopIce;
    int[] hargaLainnya;
    
    // Constructor yang diperbaiki - urutan parameter harus sesuai
    FreshTastySquash(int noKios, String namaPenjual, String noTelepon,
                     String[] menuMocktail, int[] hargaMocktail,
                     String[] menuSquash, int[] hargaSquash,
                     String[] menuPopIce, int[] hargaPopIce,
                     String[] menuLainnya, int[] hargaLainnya) {
        this.noKios = noKios;
        this.namaPenjual = namaPenjual;
        this.noTelepon = noTelepon;
        this.menuMocktail = menuMocktail;
        this.hargaMocktail = hargaMocktail;
        this.menuSquash = menuSquash;
        this.hargaSquash = hargaSquash;
        this.menuPopIce = menuPopIce;
        this.hargaPopIce = hargaPopIce;
        this.menuLainnya = menuLainnya;
        this.hargaLainnya = hargaLainnya;
    }
    
    void tampilkanInfo() {
        System.out.println("=== Informasi Kios Fresh & Tasty Squash ===");
        System.out.println("No Kios    : " + noKios);
        System.out.println("Nama Penjual: " + namaPenjual);
        System.out.println("No Telepon : " + noTelepon);
    }
    
    void tampilkanMenuKategori(String kategori, String[] menu, int[] harga) {
        System.out.println("\n--- " + kategori + " ---");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i] + " - Rp" + String.format("%,d", harga[i]));
        }
    }
    
    void tampilkanSemuaMenu() {
        tampilkanMenuKategori("MOCKTAIL", menuMocktail, hargaMocktail);
        tampilkanMenuKategori("SQUASH", menuSquash, hargaSquash);
        tampilkanMenuKategori("POP ICE", menuPopIce, hargaPopIce);
        tampilkanMenuKategori("LAINNYA", menuLainnya, hargaLainnya);
    }
}

public class Kawah {
    public static void main(String[] args) {
        // Kategori Mocktail
        String[] mocktail = {"Fruit Punch Mocktail", "Rainbow Mocktail", "Sweet Sunrise Mocktail"};
        int[] hargaMocktail = {8000, 8000, 8000};
        
        // Kategori Squash
        String[] squash = {"Strawberry Squash", "Cocopandan Squash", "Melon Squash"};
        int[] hargaSquash = {5000, 5000, 8000};
        
        // Kategori Pop Ice
        String[] popIce = {"Pop Ice Strawberry", "Pop Ice Melon", "Pop Ice Mangga"};
        int[] hargaPopIce = {5000, 5000, 5000};
        
        // Kategori Lainnya
        String[] lainnya = {"Kopi Kapal Api"};
        int[] hargaLainnya = {5000};
        
        // PERBAIKAN: Membuat objek dengan urutan parameter yang BENAR
        FreshTastySquash kios1 = new FreshTastySquash(
            1,                    // noKios
            "Didin",              // namaPenjual  
            "0819 6190 0982",     // noTelepon
            mocktail,             // menuMocktail
            hargaMocktail,        // hargaMocktail
            squash,               // menuSquash
            hargaSquash,          // hargaSquash
            popIce,               // menuPopIce
            hargaPopIce,          // hargaPopIce
            lainnya,              // menuLainnya
            hargaLainnya          // hargaLainnya
        );

        // Menampilkan informasi dan menu
        kios1.tampilkanInfo();
        kios1.tampilkanSemuaMenu();
        
        // Contoh tampilan per kategori
        System.out.println("\n" + "=".repeat(40));
        System.out.println("CONTOH TAMPILAN PER KATEGORI:");
        kios1.tampilkanMenuKategori("MOCKTAIL FAVORIT", mocktail, hargaMocktail);
    }
}