import java.util.Scanner;

public class Tugas3A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kode kendaraan (1 = Motor, 2 = Mobil): ");
        int kodeKendaraan = sc.nextInt();
        System.out.print("Masukkan lama parkir (jam): ");
        int lamaParkir = sc.nextInt();

        int tarifPerJam;
        String jenisKendaraan;

        if (kodeKendaraan == 1) {
            jenisKendaraan = "Motor";
            tarifPerJam = 2000;
        } else if (kodeKendaraan == 2) {
            jenisKendaraan = "Mobil";
            tarifPerJam = 5000;
        } else {
            jenisKendaraan = "Tidak dikenali";
            tarifPerJam = 0;
        }

        int totalBiaya = tarifPerJam * lamaParkir;

        System.out.println("Jenis kendaraan: " + jenisKendaraan);
        System.out.println("Total biaya parkir: Rp. " + totalBiaya);
    }
}