import java.util.Scanner;

public class RekapPenjualanCafe13 {
    static Scanner sc = new Scanner(System.in);
    static String[] namaMenu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
    static int[][] dataPenjualan;
    static int jumlahHari;

    public static void inputJumlahHari() {
        System.out.print("Masukkan jumlah hari penjualan: ");
        jumlahHari = sc.nextInt();
        dataPenjualan = new int[namaMenu.length][jumlahHari];
    }

    public static void inputDataPenjualan() {
        System.out.println("\nInput Data Penjualan: ");
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.println("Input penjualan untuk " + namaMenu[i] + ":");
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                dataPenjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void tampilkanTabel() {
        System.out.println("\nTabel Penjualan Selama " + jumlahHari + " Hari:");
        System.out.print("Menu\t\t");
        for (int i = 1; i <= jumlahHari; i++) {
            System.out.print("H" + i + "\t");
        }
        System.out.println();

        for (int i = 0; i < namaMenu.length; i++) {
            System.out.printf("%-15s\t", namaMenu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print(dataPenjualan[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void tampilkanPenjualanTertinggi() {
        int totalTertinggi = 0;
        String menuTertinggi = "";

        for (int i = 0; i < namaMenu.length; i++) {
            int totalPerMenu = 0;
            for (int j = 0; j < jumlahHari; j++) {
                totalPerMenu += dataPenjualan[i][j];
            }

            if (totalPerMenu > totalTertinggi) {
                totalTertinggi = totalPerMenu;
                menuTertinggi = namaMenu[i];
            }
        }
        System.out.println("Menu dengan total penjualan tertinggi adalah: " 
            + menuTertinggi + " (Total: " + totalTertinggi + ")");
    }

    public static void tampilkanRataRata() {
        System.out.println("\nRata-rata Penjualan per Menu:");
        for (int i = 0; i < namaMenu.length; i++) {
            double total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += dataPenjualan[i][j];
            }
            double rata = total / jumlahHari;
            System.out.printf("- %s: %.2f\n", namaMenu[i], rata);
        }
    }

    public static void main(String[] args) {
        inputJumlahHari();      
        inputDataPenjualan();    
        tampilkanTabel();   
        tampilkanPenjualanTertinggi(); 
        tampilkanRataRata();    
    }
}
