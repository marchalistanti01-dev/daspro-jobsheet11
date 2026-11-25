package Jobsheet11;

public class PengunjungCafe07 {

    static void daftarPengunjung(int nomorMeja, String... namaPengunjung) {
        System.out.println("Nomor Meja: " + nomorMeja);
        System.out.println("Daftar Nama Pengunjung:");

        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    static int hitungTotalBelanja(int... harga) {
        int total = 0;

        for (int nilai : harga) {
            total += nilai;
        }

        return total;
    }

    public static void main(String[] args) {
        daftarPengunjung(1, "Ali", "Budi", "Citra");
        daftarPengunjung(2, "Andi");
        daftarPengunjung(3, "Doni", "Eti", "Fahmi", "Galih");

        System.out.println();

        System.out.println("Total 1 barang: " + hitungTotalBelanja(10000));
        System.out.println("Total 3 barang: " + hitungTotalBelanja(10000, 15000, 20000));
        System.out.println("Total 5 barang: " + hitungTotalBelanja(10000, 15000, 20000, 5000, 25000));
    }
}