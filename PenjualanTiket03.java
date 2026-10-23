import java.util.Scanner;

public class PenjualanTiket03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;
        double totalPendapatan = 0;
        int totalTiket = 0;
        int jumlahTiket, jumlahPelanggan;
        double diskon = 0 , biayaBayar, subTotal;

        System.out.println("=== PROGRAM PENJUALAN TIKET BIOSKOP ===");
        System.out.print("Masukkan jumlah pelanggan: ");
        jumlahPelanggan = sc.nextInt();

        for (int i = 1; i <= jumlahPelanggan; i++) {
            System.out.print("Masukkan jumlah tiket pelanggan " +i+ ": ");          
            jumlahTiket = sc.nextInt();
            if (jumlahTiket <= 0) {
                System.out.println("Input tidak valid. Coba lagi!");
                continue;
            }
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }
            subTotal = jumlahTiket * hargaTiket;
            biayaBayar = subTotal - (subTotal * diskon);
            totalTiket += jumlahTiket;
            totalPendapatan += biayaBayar;
            System.out.println("Total yang harus dibayar: Rp." + (int) biayaBayar);
        }
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan tiket: Rp" + (int) totalPendapatan);
        sc.close();
    }
}
