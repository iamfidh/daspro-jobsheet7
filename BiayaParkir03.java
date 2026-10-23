import java.util.Scanner;

public class BiayaParkir03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, total = 0;
        int tarifMobil = 3000, tarifMotor = 2000;

        System.out.println("=== SISTEM TARIF PARKIR ===");
        System.out.println("Ketentuan input jenis: 1 = mobil, 2 = motor, 0 = keluar");
        do {
            System.out.print("Masukkan jenis kendaraan: ");
            jenis = sc.nextInt();
            if ((jenis==1) || (jenis==2)) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();
                if (jenis == 1) {
                    total += durasi*tarifMobil;
                }else{
                    total += durasi*tarifMotor;
                }
            }
        } while (jenis != 0);
        System.out.println("Total pembayaran parkir: Rp" + total);
        sc.close();
    }
}
