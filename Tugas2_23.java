import java.util.Scanner;

public class Tugas2_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int baris = 1;

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        while (n < 3) {
            System.out.println("Nilai n minimal 3!");
            System.out.print("Masukkan nilai n = ");
            n = sc.nextInt();
        }

        while (baris <= n) {
            int kolom = 1;
            while (kolom <= n) {
                int hasil = baris * kolom;
                System.out.printf("%4d", hasil);
                total += hasil;
                kolom++;
            }
            System.out.println();
            baris++;
        }

        System.out.println("Jumlah seluruh angka: " + total);
        sc.close();
    }
    
}