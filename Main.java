
public class Main {
    public static void main(String[] args) {

        // Create products
        Product mouse = new Product(101, "Wireless Mouse", 250, 15);
        Product keyboard = new Product(102, "Keyboard", 500, 10);
        Product monitor = new Product(103, "Monitor", 2500, 5);
        Product cable = new Product(104, "USB Cable", 100, 30);

        // Create inventory
        Inventory inventory = new Inventory();

        // Add products
        inventory.addProduct(mouse);
        inventory.addProduct(keyboard);
        inventory.addProduct(monitor);
        inventory.addProduct(cable);

        // Low-stock report
        inventory.displayLowStockProducts(5);
        inventory.displayLowStockProducts(11);

        // Inventory summary
        System.out.println("Total units: " + inventory.getTotalUnits());
        System.out.println("Total inventory value: R" + inventory.getTotalValue());
  
        Product result = inventory.searchProductByName(" Laptop");

        if (result != null){
            System.out.println("Product Found");

        }else{
            System.out.println("Product not found");
        }

        inventory.sortProductsByPrice();
        inventory.displayInventory();

        inventory.updateStock(102, 25);
        Product updated = inventory.getProductById(102);  
        System.out.println("Updated Quantity: " + updated.getQuantity());

        try {
            inventory.updateStock(999, 25);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            inventory.updateStock(102, -5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        boolean removed = inventory.removeProduct(104);

        System.out.println("Was product removed? " + removed);

        inventory.displayInventory();
    }  
}
