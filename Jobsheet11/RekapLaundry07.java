
package Jobsheet11;

import java.util.Scanner;

public class RekapLaundry07 {

    static Scanner input = new Scanner(System.in);

    static String[] layanan;
    static int[] harga;
    static String[] hari;

    static void inputData(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("\nMasukkan berat cucian " + layanan[i]);

            for (int j = 0; j < data[i].length; j++) {
                System.out.print(hari[j] + ": ");
                data[i][j] = input.nextInt();
            }
        }
    }

    static void tampilData(int[][] data) {
        System.out.println("\n=== REKAP BERAT CUCIAN ===");
        System.out.printf("%-18s", "Layanan");

        for (int j = 0; j < hari.length; j++) {
            System.out.printf("%-12s", hari[j]);
        }
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-18s", layanan[i]);

            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%-12d", data[i][j]);
            }
            System.out.println();
        }
    }

    static int totalPerLayanan(int[][] data, int idxLayanan) {
        int total = 0;

        for (int j = 0; j < data[idxLayanan].length; j++) {
            total += data[idxLayanan][j];
        }

        return total;
    }

    static void layananTerbanyak(int[][] data) {
        int terbesar = 0;

        for (int i = 1; i < data.length; i++) {
            if (totalPerLayanan(data, i) >
                totalPerLayanan(data, terbesar)) {
                terbesar = i;
            }
        }

        System.out.println("\nLayanan dengan total tertinggi: "
                + layanan[terbesar]);
        System.out.println("Total: "
                + totalPerLayanan(data, terbesar) + " kg");
    }

    static int hariTersibuk(int[][] data) {
        int indeksTerbesar = 0;
        int totalTerbesar = 0;

        for (int j = 0; j < data[0].length; j++) {
            int totalHari = 0;

            for (int i = 0; i < data.length; i++) {
                totalHari += data[i][j];
            }

            if (totalHari > totalTerbesar) {
                totalTerbesar = totalHari;
                indeksTerbesar = j;
            }
        }

        return indeksTerbesar;
    }

    static void tampilPendapatan(int[][] data) {
        int totalPendapatan = 0;

        System.out.println("\n=== PENDAPATAN LAUNDRY ===");

        for (int i = 0; i < data.length; i++) {
            int pendapatan = totalPerLayanan(data, i) * harga[i];
            totalPendapatan += pendapatan;

            System.out.println(layanan[i] + ": Rp" + pendapatan);
        }

        System.out.println("Total pendapatan: Rp" + totalPendapatan);
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah layanan: ");
        int jumlahLayanan = input.nextInt();

        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = input.nextInt();
        input.nextLine();

        layanan = new String[jumlahLayanan];
        harga = new int[jumlahLayanan];
        hari = new String[jumlahHari];

        int[][] data = new int[jumlahLayanan][jumlahHari];

        for (int i = 0; i < jumlahLayanan; i++) {
            System.out.print("Nama layanan ke-" + (i + 1) + ": ");
            layanan[i] = input.nextLine();

            System.out.print("Harga per kg: ");
            harga[i] = input.nextInt();
            input.nextLine();
        }

        for (int j = 0; j < jumlahHari; j++) {
            hari[j] = "Hari ke-" + (j + 1);
        }

        inputData(data);
        tampilData(data);

        System.out.println("\n=== TOTAL SETIAP LAYANAN ===");
        for (int i = 0; i < data.length; i++) {
            System.out.println(layanan[i] + ": "
                    + totalPerLayanan(data, i) + " kg");
        }

        layananTerbanyak(data);

        int hariTerbesar = hariTersibuk(data);
        System.out.println("Hari tersibuk: " + hari[hariTerbesar]);

        tampilPendapatan(data);
    }
}
