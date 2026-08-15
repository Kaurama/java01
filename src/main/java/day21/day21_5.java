package day21;

public class day21_5 {
    public static double hitungKalori(String jenisOlahraga, int durasiMenit, double beratBadan) {
        if (beratBadan <= 0 || durasiMenit <= 0) {
            return -1.0;
        }
        switch (jenisOlahraga.toLowerCase()) {
            case "lari":
                return 0.14 * durasiMenit * beratBadan;
            case "berenang":
                return 0.10 * durasiMenit * beratBadan;
            case "berjalan":
                return 0.05 * durasiMenit * beratBadan;
            default:
                return -1.0;
        }

    }
    public static void main(String[] args) {
        double hasil1=hitungKalori("lari",30,60);
                System.out.println("hasil kalori terbakar "+hasil1);
        double hasil2=hitungKalori("berjalan",45,70);
                System.out.println("hasil kalori terbakar "+hasil2);
        double hasil3=hitungKalori("yoga",30,50);
        System.out.println("hasil kalori terbakar "+hasil3);

    }




}
