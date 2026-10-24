import java.util.Scanner;

public class Tugas1Bioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket, totalTiket = 0, totalHarga = 0;

        do {
            System.out.print("Masukkan jumlah tiket (ketik 0 untuk keluar): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi!");
                continue;
            }

            if (jumlahTiket > 0) {
                totalTiket += jumlahTiket;
                int subtotal = jumlahTiket * hargaTiket;
                int diskon = 0;

                if (jumlahTiket > 10) {
                    diskon = 15;
                } else if (jumlahTiket > 4) {
                    diskon = 10;
                }

                int totalBayar = subtotal - (subtotal * diskon / 100);
                totalHarga += totalBayar;

            }
            
        } while (jumlahTiket != 0);

        System.out.println("+--------------------------------------+");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total omset penjualan: Rp " + totalHarga);

        sc.close();
    }
}
