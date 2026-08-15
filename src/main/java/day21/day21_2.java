package day21;

public class day21_2 {

    public int hitungBiayaParkir(int lamaParkir, boolean isVIP) {
        if (lamaParkir <= 0) {
            return -1;
        }

        int totalBiaya = 5000;

        if (lamaParkir > 1) {
            totalBiaya += (lamaParkir - 1) * 3000;
        }

        if (isVIP) {
            totalBiaya -= 5000;
        }

        return Math.max(0, totalBiaya);
    }

    public static void main(String[] args) {
        day21_2 solusi = new day21_2();

        int test1 = solusi.hitungBiayaParkir(3, false);
        System.out.println("Example 1 Output: " + test1); // Ekspektasi: 11000

        int test2 = solusi.hitungBiayaParkir(1, true);
        System.out.println("Example 2 Output: " + test2); // Ekspektasi: 0

        int test3 = solusi.hitungBiayaParkir(0, false);
        System.out.println("Example 3 Output: " + test3); // Ekspektasi: -1
    }
}