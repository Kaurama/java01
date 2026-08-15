package DAY22B;

public interface Notifikasi {
    void kirim(String pesan);
}

// 2. Implementasi untuk Email
class EmailNotifikasi implements Notifikasi {
    @Override
    public void kirim(String pesan) {
        System.out.println("Email: " + pesan);
    }
}

class SMSNotifikasi implements Notifikasi {
    @Override
    public void kirim(String pesan) {
        System.out.println("SMS: " + pesan);
    }
}

class Contoh {
    public static void main(String[] args) {
        EmailNotifikasi notifikasi = new EmailNotifikasi();
        notifikasi.kirim("Pesan dari Email");

        SMSNotifikasi notifikasi2 = new SMSNotifikasi();
        notifikasi2.kirim("Pesan dari SMS");
    }
}