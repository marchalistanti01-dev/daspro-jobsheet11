package Jobsheet11;

public class HitungBalokFungsi07 {

    static int hitungLuas(int a, int b) {
        return a * b;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        return hitungLuas(a, b) * tinggi;
    }

    static int hitungLuasPermukaanBalok(int p, int l, int t) {
        return 2 * (hitungLuas(p, l) + hitungLuas(p, t) + hitungLuas(l, t));
    }

    public static void main(String[] args) {

        int p, l, t;

        p = 4;
        l = 3;
        t = 5;
        System.out.println("Balok 1");
        System.out.println("Luas permukaan: " + hitungLuasPermukaanBalok(p, l, t));
        System.out.println("Volume: " + hitungVolume(t, p, l));

        p = 6;
        l = 2;
        t = 3;
        System.out.println("\nBalok 2");
        System.out.println("Luas permukaan: " + hitungLuasPermukaanBalok(p, l, t));
        System.out.println("Volume: " + hitungVolume(t, p, l));

        p = 5;
        l = 4;
        t = 2;
        System.out.println("\nBalok 3");
        System.out.println("Luas permukaan: " + hitungLuasPermukaanBalok(p, l, t));
        System.out.println("Volume: " + hitungVolume(t, p, l));
    }
}