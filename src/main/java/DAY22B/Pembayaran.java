package DAY22B;


class Pembayaran {
    void prosesBayar() {
        System.out.println("Memproses pembayaran standar...");
    }
}


class EWallet extends Pembayaran {
    @Override
    void prosesBayar() {
        System.out.println("Memproses via QRIS/E-Wallet");
    }
}


class TransferBank extends Pembayaran {
    @Override
    void prosesBayar() {
        System.out.println("Memproses via Transfer Bank");
    }
}


 class EwalletMain {

    public static void jalankanTransaksi(Pembayaran metode) {
        metode.prosesBayar();
    }

    public static void main(String[] args) {

        System.out.println("--- Transaksi dengan Method Parameter ---");

        Pembayaran transaksi1 = new EWallet();
        Pembayaran transaksi2 = new TransferBank();


        jalankanTransaksi(transaksi1);
        jalankanTransaksi(transaksi2);
    }
}