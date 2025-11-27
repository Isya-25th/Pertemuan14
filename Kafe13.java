import java.util.Scanner;

public class Kafe13{
    public static void Menu(String namaPelanggan) {
        System.out.println("Selamat datang, "+namaPelanggan + "!");

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam Rp 15,000");
        System.out.println("2. Cappuccino Rp 20,000");
        System.out.println("3. Latte Rp 22,000");
        System.out.println("4. Teh Tarik Rp 12,000");
        System.out.println("5. Roti Bakar Rp 10,000");
        System.out.println("6. Mie Goreng Rp 18,000");
        System.out.println("================================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga13(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        int diskon = 0;

        System.out.println("Harga awal (sebelum diskon): Rp" + hargaTotal);

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = hargaTotal * 50 / 100;
            System.out.println("Kode promo DISKON50 digunakan. Diskon: Rp" + diskon);
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = hargaTotal * 30 / 100;
            System.out.println("Kode promo DISKON30 digunakan. Diskon: Rp" + diskon);
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo invalid. Tidak ada diskon.");
        }

        return hargaTotal - diskon;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = sc.nextLine();

        Menu(namaPelanggan);

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();

        int totalBayar = hitungTotalHarga13(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga untuk pesanan Anda: Rp" + totalBayar);
        sc.close();
    }
}
