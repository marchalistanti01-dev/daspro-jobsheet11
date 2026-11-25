
package Jobsheet11;

import java.util.Scanner;

public class Kafe07 {

    public static void Menu(String namaPelanggan, boolean isMember, int jamKunjung) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (jamKunjung >= 14 && jamKunjung <= 16) {
            System.out.println("Happy Hour! Diskon 20% untuk semua minuman");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
    }

    public static int hitungTotalHarga07(int pilihanMenu, int banyakItem) {
        int[] harga = {15000, 20000, 22000, 12000, 10000, 18000};

        if (pilihanMenu < 1 || pilihanMenu > 6) {
            System.out.println("Menu tidak tersedia");
            return 0;
        }

        int hargaTotal = harga[pilihanMenu - 1] * banyakItem;

        return hargaTotal;
    }

    public static int hitungDiskon(int total, String kodePromo, boolean isMember) {
        int diskon = 0;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = total * 50 / 100;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = total * 30 / 100;
        } else {
            System.out.println("Kode promo tidak valid");
        }

        if (isMember) {
            diskon = diskon + (total * 10 / 100);
        }

        return diskon;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String nama = input.nextLine();

        System.out.print("Apakah pelanggan member? (y/n): ");
        String statusMember = input.nextLine();
        boolean isMember = statusMember.equalsIgnoreCase("y");

        System.out.print("Masukkan jam kunjung: ");
        int jamKunjung = input.nextInt();

        Menu(nama, isMember, jamKunjung);

        System.out.print("Masukkan pilihan menu (1-6): ");
        int pilihanMenu = input.nextInt();

        System.out.print("Masukkan jumlah pesanan: ");
        int banyakItem = input.nextInt();

        int totalBayar = hitungTotalHarga07(pilihanMenu, banyakItem);

        input.nextLine();

        System.out.print("Masukkan kode promo: ");
        String kodePromo = input.nextLine();

        int diskon = hitungDiskon(totalBayar, kodePromo, isMember);
        int totalAkhir = totalBayar - diskon;

        System.out.println("Total harga: Rp " + totalBayar);
        System.out.println("Total diskon: Rp " + diskon);
        System.out.println("Total yang harus dibayar: Rp " + totalAkhir);
    }
}



