package Jobsheet11;

import java.util.Scanner;

public class BankSampah07 {

    static Scanner input = new Scanner(System.in);

    static double[] inputSetoran(int n) {
        double[] setoran = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Berat setoran nasabah " + (i + 1) + " (kg): ");
            setoran[i] = input.nextDouble();
        }

        return setoran;
    }

    static void tampilSetoran(double[] setoran) {
        for (int i = 0; i < setoran.length; i++) {
            System.out.println("Nasabah " + (i + 1) + ": " + setoran[i] + " kg");
        }
    }

    static double totalSetoran(double[] setoran) {
        double total = 0;

        for (int i = 0; i < setoran.length; i++) {
            total += setoran[i];
        }

        return total;
    }

    static double hitungSaldo(double berat, double harga) {
        return berat * harga;
    }

    static int nasabahTerbanyak(double[] setoran) {
        int indeksTerbesar = 0;

        for (int i = 1; i < setoran.length; i++) {
            if (setoran[i] > setoran[indeksTerbesar]) {
                indeksTerbesar = i;
            }
        }

        return indeksTerbesar;
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah nasabah: ");
        int n = input.nextInt();

        double[] setoran = inputSetoran(n);

        System.out.println("\n=== DATA SETORAN NASABAH ===");
        tampilSetoran(setoran);

        System.out.println("\nTotal setoran: " + totalSetoran(setoran) + " kg");

        System.out.println("\n=== SALDO SETIAP NASABAH ===");
        for (int i = 0; i < setoran.length; i++) {
            System.out.println("Saldo nasabah " + (i + 1) + ": Rp"
                    + hitungSaldo(setoran[i], 3000));
        }

        int terbesar = nasabahTerbanyak(setoran);
        System.out.println("\nSetoran terbesar adalah nasabah "
                + (terbesar + 1) + " dengan berat " + setoran[terbesar] + " kg");
    }
}