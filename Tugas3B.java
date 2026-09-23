import java.util.Scanner;

public class Tugas3B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kode layanan (1-4): ");
        int kodeLayanan = sc.nextInt();

        switch (kodeLayanan) {
            case 1:
                System.out.println("Layanan: Pendaftaran KRS");
                break;
            case 2:
                System.out.println("Layanan: Legalisir Ijazah/Transkrip");
                break;
            case 3:
                System.out.println("Layanan: Surat Keterangan Aktif Kuliah");
                break;
            case 4:
                System.out.println("Layanan: Bebas Perpustakaan");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
        }
    }
}