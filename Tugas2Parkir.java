import java.util.Scanner;

public class Tugas2Parkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.println("+-------------------------+");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Keluar");
            System.out.println("+-------------------------+");
            System.out.print("Masukkan jenis kendaraan: ");
            jenis = sc.nextInt();
            
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();
                System.out.println("=============================");

                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000;
                }
            } else {
                System.out.println("Jenis kendaraan tidak valid. \nMasukkan lagi!");
                System.out.println("=============================");
            }
        } while (jenis != 0);

        System.out.println("Total pembayaran parkir: Rp. " + total);

        sc.close();
    }
}
