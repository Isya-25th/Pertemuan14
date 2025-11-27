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

    public static int hitungTotalHarga13(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = sc.nextLine();

        Menu(namaPelanggan);

        System.out.print("\nBerapa jenis menu yang ingin Anda pesan? ");
        int jumlahMenu = sc.nextInt();
        sc.nextLine(); // bersihkan buffer

        int totalKeseluruhan = 0;

        for (int i = 1; i <= jumlahMenu; i++) {
            System.out.println("\nPesanan ke-" + i);
            System.out.print("Masukkan nomor menu: ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();
            sc.nextLine();

            int subtotal = hitungTotalHarga13(pilihanMenu, banyakItem);
            System.out.println("Subtotal pesanan: Rp" + subtotal);

            totalKeseluruhan += subtotal;
        }

        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();

        int diskon = 0;
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = totalKeseluruhan * 50 / 100;
            System.out.println("Kode promo DISKON50 digunakan. Diskon: Rp" + diskon);
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = totalKeseluruhan * 30 / 100;
            System.out.println("Kode promo DISKON30 digunakan. Diskon: Rp" + diskon);
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo invalid. Tidak ada diskon.");
        }

        int totalAkhir = totalKeseluruhan - diskon;
        System.out.println("Total keseluruhan pesanan: Rp" + totalKeseluruhan);
        System.out.println("Total setelah diskon: Rp" + totalAkhir);

        sc.close();
    }
}
