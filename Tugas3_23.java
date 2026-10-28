import java.util.Scanner;

public class Tugas3_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ringkasan = "";

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();
        while (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1!");
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
        }

        int totalSemuaToko = 0;
        int maxBarang = -1;     
        int tokoTerbanyak = 0;

        for (int toko = 1; toko <= jumlahToko; toko++) {
            int totalBarangToko = 0;   
            System.out.print("Toko " + toko + " - jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();
            while (jumlahPelanggan < 0) {
                System.out.println("Jumlah pelanggan tidak boleh negatif!");
                System.out.print("Toko " + toko + " - jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();
            }
            
            for (int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan++) {
                System.out.print("  Pelanggan " + pelanggan + " - jumlah barang: ");
                int barang = sc.nextInt();
                while (barang < 0) {
                    System.out.println("  Jumlah barang tidak boleh negatif!");
                    System.out.print("  Pelanggan " + pelanggan + " - jumlah barang: ");
                    barang = sc.nextInt();
                }
                totalBarangToko += barang;
            }

            totalSemuaToko += totalBarangToko;

            if (totalBarangToko > maxBarang) {
                maxBarang = totalBarangToko;
                tokoTerbanyak = toko;
            }

            ringkasan += "Toko " + toko + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko + "\n";
        }

        System.out.print(ringkasan);
        System.out.println("Total barang seluruh toko: " + totalSemuaToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
}
