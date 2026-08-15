package TUGASDAY22B;

// Base Class
class Notification {
    protected String recipient;
    protected String message;

    public Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public String send() {
        return "Sending notification to " + recipient + ": " + message;
    }
}

// Subclass 1
class EmailNotification extends Notification {
    private String subject;

    public EmailNotification(String recipient, String subject, String message) {
        super(recipient, message);
        this.subject = subject;
    }

    @Override
    public String send() {
        return "Sending EMAIL to " + recipient + " | Subject: " + subject + " | Body: " + message;
    }
}

// Subclass 2
class SMSNotification extends Notification {
    private String phoneNumber;

    public SMSNotification(String recipient, String phoneNumber, String message) {
        super(recipient, message);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String send() {
        String finalMessage = message;
        // Truncate logic: jika lebih dari 20 karakter, potong jadi 17 dan tambah "..."
        if (finalMessage != null && finalMessage.length() > 20) {
            finalMessage = finalMessage.substring(0, 17) + "...";
        }

        return "Sending SMS to " + phoneNumber + " (" + recipient + "): " + finalMessage;
    }
}

// Service Class (Polymorphic Handler)
class NotificationService {
    public static int processBatch(Notification[] notifications) {
        if (notifications == null) {
            return 0;
        }

        int count = 0;
        for (Notification notif : notifications) {
            if (notif != null) {
                System.out.println(notif.send());
                count++;
            }
        }

        return count;
    }
}

// Main Class
public class soal4 {
    public static void main(String[] args) {
        Notification[] batch = new Notification[] {
                new EmailNotification("john@mail.com", "Promo", "Diskon 50% untuk Anda!"),
                new SMSNotification("Budi", "08123456789", "Kode OTP Anda adalah 4321"),
                new Notification("Alice", "Selamat datang di aplikasi kami")
        };

        int totalSent = NotificationService.processBatch(batch);
        System.out.println("\nTotal diproses: " + totalSent);
    }
}