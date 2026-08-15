package day21;

public class day21_3 {

    public double konversiSuhu(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    public double konversiSuhu(double celsius, String targetUnit) {
        if (targetUnit.equals("F") || targetUnit.equals("f")) {
            return konversiSuhu(celsius);
        } else if (targetUnit.equals("K") || targetUnit.equals("k")) {
            return celsius + 273.15;
        } else {
            return -999.0;
        }
    }

    public static void main(String[] args) {
        day21_3 alatKonversi = new day21_3();

        double hasil1 = alatKonversi.konversiSuhu(25.0);
        System.out.println("Hasil 25 C ke F         : " + hasil1);

        double hasil2 = alatKonversi.konversiSuhu(0.0, "K");
        System.out.println("Hasil 0 C ke K          : " + hasil2);

        double hasil3 = alatKonversi.konversiSuhu(100.0, "X");
        System.out.println("Hasil 100 C ke Unit 'X' : " + hasil3);
    }
}