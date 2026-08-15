package day22;

public class VendingSlot {
    // 1. Deklarasikan atribut private
    private String itemName;
    private double price;
    private int stock;




    // 2. Constructor
    public VendingSlot(String itemName, double price, int stock) {
        if (itemName == null || itemName.trim().isEmpty()) {
            this.itemName = "Unknown Item";
        } else {
            this.itemName = itemName;
        }
        if (price <= 0.0) {
            this.price = 1.0;
        } else {
            this.price = price;
        }
        if (stock < 0) {
            this.stock = 0;
        } else this.stock = stock;
    }




    // 3. Getters
    public String getItemName() {
        return this.itemName;
    }




    public double getPrice() {
        return this.price;
    }




    public int getStock() {
        return this.stock;
    }




    // 4. Setter Price
    public boolean setPrice(double newPrice) {
        if (newPrice > 0.0) {
            this.price = newPrice;
            return true;
        }
        return false;
    }




    // 5. Restock Method
    public boolean restock(int count) {
        if (count > 0) {
            this.stock += count;
            return true;
        }
        return false;
    }




    // 6. Buy Item Method
    public double buyItem(int quantity, double payment) {
        double totalPrice = this.price * quantity;


        if (quantity > 0 && this.stock >= quantity && payment >= totalPrice) {
            this.stock -= quantity;
            return payment - totalPrice;
        }
        return -1.0;
    }
}




class Main {
    public static void main(String[] args) {
        VendingSlot slot = new VendingSlot("Soda Can", 5.0, 10);


        System.out.println(slot.setPrice(-2.0));            // Output: false (Harga tidak berubah)
        System.out.println(slot.getPrice());                // Output: 5.0
        System.out.println(slot.getStock());
// Beli 2 kaleng soda (Total harga: 10.0, Uang: 15.0)
        System.out.println(slot.buyItem(2, 15.0));          // Output: 5.0 (Kembalian 5.0, stok sisa 8)


// Beli 10 kaleng (Stok tidak cukup karena sisa 8)
        System.out.println(slot.buyItem(10, 100.0));        // Output: -1.0 (Gagal, stok tetap 8)


        System.out.println(slot.restock(5));                // Output: true (Stok jadi 13)
        System.out.println(slot.getStock());                // Output: 13


    }
}

