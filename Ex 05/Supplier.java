package inventory;

public class Supplier {
    public int supplierId;
    public String name;
    public String contact;

    public Supplier(int supplierId, String name, String contact) {
        this.supplierId = supplierId;
        this.name = name;
        this.contact = contact;
    }

    public void showSupplier() {
        System.out.println("Supplier ID: " + supplierId + ", Name: " + name + ", Contact: " + contact);
    }
}
