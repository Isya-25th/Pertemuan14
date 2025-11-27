import java.util.Scanner;

public class RekapPenjualanCafe13 {
    static Scanner sc = new Scanner(System.in);
    static String[] namaMenu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
    static int[][] dataPenjualan = new int[5][7];

    public static void inputDataPenjualan() {
        System.out.println("Input Data Penjualan: ");
        for (int i = 0; i < dataPenjualan.length; i++) {
            System.out.println("Input penjualan untuk " + namaMenu[i] + ":");
            for (int j = 0; j < dataPenjualan[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                dataPenjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void tampilkanTabel() {
        System.out.println("Tabel Penjualan Selama 7 Hari:");
        System.out.print("Menu\t\t");
        for (int i = 1; i <= 7; i++) {
            System.out.print("H" + i + "\t");
        }
        System.out.println();
        
        for (int i = 0; i < dataPenjualan.length; i++) {
            System.out.printf("%-15s\t", namaMenu[i]); 
            for (int j = 0; j < dataPenjualan[0].length; j++) {
                System.out.print(dataPenjualan[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void tampilkanPenjualanTertinggi() {
        int totalTertinggi = 0;
        String menuTertinggi = "";

        for (int i = 0; i < dataPenjualan.length; i++) {
            int totalPerMenu = 0;
            for (int j = 0; j < dataPenjualan[0].length; j++) {
                totalPerMenu += dataPenjualan[i][j];
            }

            if (totalPerMenu > totalTertinggi) {
                totalTertinggi = totalPerMenu;
                menuTertinggi = namaMenu[i];
            }
        }
        System.out.println("Menu dengan total penjualan tertinggi adalah: " + menuTertinggi + " (Total: " + totalTertinggi + ")");
    }

    public static void tampilkanRataRata() {
        System.out.println("\nRata-rata Penjualan per Menu:");
        for (int i = 0; i < dataPenjualan.length; i++) {
            double total = 0;
            for (int j = 0; j < dataPenjualan[0].length; j++) {
                total += dataPenjualan[i][j];
            }
            double rata = total / dataPenjualan[0].length;
            System.out.printf("- %s: %.2f\n", namaMenu[i], rata);
        }
    }
    public static void main(String[] args) {
        inputDataPenjualan();
        
        tampilkanTabel();

        tampilkanPenjualanTertinggi();

        tampilkanRataRata();
    }
}