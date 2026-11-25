package Jobsheet11;

import java.util.Scanner;

public class TabungKerucut07 {

    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    static double volumeTabung(double r, double t) {
        return luasLingkaran(r) * t;
    }

    static double luasPermukaanTabung(double r, double t) {
        return 2 * Math.PI * r * (r + t);
    }

    static double volumeKerucut(double r, double t) {
        return volumeTabung(r, t) / 3;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        double r, t;

        do {
            System.out.println("\n=== MENU TABUNG DAN KERUCUT ===");
            System.out.println("1. Luas Lingkaran");
            System.out.println("2. Volume Tabung");
            System.out.println("3. Luas Permukaan Tabung");
            System.out.println("4. Volume Kerucut");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jari-jari: ");
                    r = input.nextDouble();
                    System.out.println("Luas lingkaran: " + luasLingkaran(r));
                    break;

                case 2:
                    System.out.print("Masukkan jari-jari: ");
                    r = input.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    t = input.nextDouble();
                    System.out.println("Volume tabung: " + volumeTabung(r, t));
                    break;

                case 3:
                    System.out.print("Masukkan jari-jari: ");
                    r = input.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    t = input.nextDouble();
                    System.out.println("Luas permukaan tabung: " + luasPermukaanTabung(r, t));
                    break;

                case 4:
                    System.out.print("Masukkan jari-jari: ");
                    r = input.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    t = input.nextDouble();
                    System.out.println("Volume kerucut: " + volumeKerucut(r, t));
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 0);

        input.close();
    }
}