import java.util.Scanner;

public class Kubus13 {
    static int hitungLuasPermukaan(int s) {
        int luasPermukaan = 6 * s * s;
        return luasPermukaan;
    }
    static int hitungVolume(int s) {
        int volume = s * s * s;
        return volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sisi, luas, vol;
        System.out.println("Masukkan panjang sisi kubus: ");
        sisi = input.nextInt();
        luas = hitungLuasPermukaan(sisi);
        System.out.println("Luas Permukaan Kubus adalah: " + luas);
        vol = hitungVolume(sisi);
        System.out.println("Volume Kubus adalah: " + vol);
        input.close();
    }
}
