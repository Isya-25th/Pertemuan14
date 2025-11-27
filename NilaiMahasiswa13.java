import java.util.Scanner;

public class NilaiMahasiswa13 {
    static int[] isianArray(int n) {
        int[] nilai = new int[n];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
        return nilai;
    }

    static void tampilArray(int[] nilai) {
        System.out.println("\n==== Daftar Nilai Mahasiswa ====");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
        System.out.println("================================");
    }
    
    static int hitTot(int[] nilai) {
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return total;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        
        int[] nilaiMahasiswa = new int[n];
        
        nilaiMahasiswa = isianArray(n);
        
        tampilArray(nilaiMahasiswa);
        
        double totalNilai = hitTot(nilaiMahasiswa);
        System.out.println("Total nilai seluruh mahasiswa: " + totalNilai);
        System.out.println("Rata-rata nilai: " + totalNilai / n);
        sc.close();
    }
}
