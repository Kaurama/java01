package day21;

class Solution {
    public double hitungTotal(double harga) {
        return harga;
    }

    public double hitungTotal(double harga, double persentaseDiskon) {
        double nominalDiskon = harga * (persentaseDiskon / 100);
        return harga - nominalDiskon;
    }

    public double hitungTotal(double harga, double persentaseDiskon, double ongkir) {

        return hitungTotal(harga, persentaseDiskon) + ongkir;
    }
}

public class day21 {
    public static void main(String[] args) {
        Solution solusi = new Solution();

        System.out.println("=== Testing Method Overloading ===");

        // Example 1
        System.out.println("Input Call: hitungTotal(100000.0)");
        System.out.println("Output    : " + solusi.hitungTotal(100000.0));
        System.out.println();

        // Example 2
        System.out.println("Input Call: hitungTotal(200000.0, 10.0)");
        System.out.println("Output    : " + solusi.hitungTotal(200000.0, 10.0));
        System.out.println();

        // Example 3
        System.out.println("Input Call: hitungTotal(200000.0, 10.0, 15000.0)");
        System.out.println("Output    : " + solusi.hitungTotal(200000.0, 10.0, 15000.0));
    }
}