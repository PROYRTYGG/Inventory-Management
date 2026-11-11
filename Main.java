import java.util.HashMap;
import java.util.HashSet;

// import package1.b;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

//         Product mouse = new Product(101, "Wireless Mouse", 250.00, 15);
//         Product keyboard = new Product(102, "Keyboard", 500, 10);
//         // System.out.println(mouse.getName());

//         // System.out.println(mouse.getPrice());

//         // try{
//         //     mouse.setPrice(-300);
//         // }catch(IllegalArgumentException e){
//         //     System.out.println(e.getMessage());
//         // }

//         // try{
//         //     mouse.setName(" ");
//         // }catch(IllegalArgumentException e){
//         // System.out.println(e.getMessage());
//         // }
//         // try{
//         //     Product key = new Product(0, "keyyy", 99, 10);
//         // }catch(IllegalArgumentException e){
//         // System.out.println(e.getMessage());
//         // }

//          Inventory inventory = new Inventory();

//          inventory.addProduct(mouse);
//          inventory.addProduct(keyboard);

//         // System.out.println(inventory.getProductCount());

//         // System.out.println(inventory.productExists(101));
//         // System.out.println(inventory.productExists(103));

//         // Product duplicateMouse = new Product(101, "Gaming Mouse", 600, 5);

//         // //inventory.addProduct(duplicateMouse);

//         // try{
//         //     inventory.addProduct(duplicateMouse);

//         // }catch(IllegalArgumentException e){
//         //     System.out.println(e.getMessage());
//         // }

//         // System.out.println("Before removal: " + inventory.getProductCount());

//         // boolean removed = inventory.removeProduct(101);

//         // System.out.println("Was product removed? " + removed);
//         // System.out.println("After removal: " + inventory.getProductCount());
//         // System.out.println("Does mouse still exist? " + inventory.productExists(101));

        
//         // System.out.println(inventory.removeProduct(101));
//         // System.out.println(inventory.productExists(101));
//         // System.out.println(inventory.removeProduct(999));

//        // Product foundProduct = inventory.getProductById(102);

//         // if (foundProduct != null) {
//         //     System.out.println(foundProduct.getName());
//         //     System.out.println(foundProduct.getPrice());
//         // } else {
//         //     System.out.println("Product not found");
//         // }
      
//         // Product missingProduct = inventory.getProductById(999);

//         // if (missingProduct != null) {
//         //     System.out.println(missingProduct.getName());
//         // } else {
//         //     System.out.println("Product not found");
// //        }

//         inventory.updateStock(102, 25);
//         System.out.println(inventory.getProductById(102).getQuantity());

//         try {
//             inventory.updateStock(999, 25);
//         } catch (IllegalArgumentException e) {
//             System.out.println(e.getMessage());
//         }

//         try {
//             inventory.updateStock(102, -5);
//         } catch (IllegalArgumentException e) {
//             System.out.println(e.getMessage());
//         }

//         inventory.displayInventory();
//         Inventory emptyInventory = new Inventory();
//         emptyInventory.displayInventory();
    
        
//         System.out.println(inventory.removeProduct(101));
//         System.out.println(inventory.getProductCount());
//         // HashSet<Integer> studentId = new HashSet<>();

        //     studentId.add(101);
        //     studentId.add(102);
        //     studentId.add(103);
        //     studentId.add(104);
        //     studentId.add(101);
        //     for (Integer id : studentId){
        //         System.out.println(id);
        //     }
        //     System.out.println(studentId.size());
    
            // if(studentId.contains(101)){
            //     System.out.println("ID already exists");
            // }else{
            //     System.out.println("ID is available");
            // }
    

        // HashSet<Integer> productIds = new HashSet<>();
        // productIds.add(201);
        // productIds.add(202);
        // productIds.add(203);

        // if(productIds.contains(205)){
        //     System.out.println("ID already used");
        // }else{
        //     productIds.add(205);
        // }

        // System.out.println(productIds.size());


        // HashMap<Integer, String> products = new HashMap<>();
        // products.put(101, "Wireless Mouse");
        // products.put(102, "Keyboard");
        // products.put(103, "Monitor");

        // System.out.println(products.get(102));
        // products.put(102, "Gaming Keyboard");
        // System.out.println(products.get(102));

        // if(products.containsKey(999)){
        //     System.out.println("Product found");
        // }else{
        //     System.out.println("Product not found");
        // }

        // HashMap<Integer, String> products = new HashMap<>();
        // products.put(201, "Laptop");
        // products.put(202, "Mouse");
        // products.put(203, "Keyboard");
        // if(products.containsKey(202)){
        //     products.put(202, "Wireless Mouse");
        //     System.out.println(products.get(202));
        // }else{
        //     System.out.println("Product ID does not exist");
        // }
        // System.out.println(products.size());


        Product mouse = new Product(101, "Wireless Mouse",250, 15);
        Product keyboard = new Product(102, "Keyboard", 500, 10);
        Product monitor = new Product(103, "Monitor", 2500, 5);
        Product cable = new Product(104, "USB Cable", 100, 30);

        Inventory inventory = new Inventory();
        inventory.addProduct(mouse);
        inventory.addProduct(keyboard);
        inventory.addProduct(monitor);
        inventory.addProduct(cable);
        // inventory.sortProductByName();
        // inventory.displayInventory();

        // Product found = inventory.searchProductByName("WIRELESS MOUSE");

        // if (found != null) {
        //     System.out.println("Product found: " + found.getName());
        // } else {
        //     System.out.println("Product not found");
        // }

        // Product missing = inventory.searchProductByName("Laptop");

        // if (missing != null) {
        //     System.out.println("Product found: " + missing.getName());
        // } else {
        //     System.out.println("Product not found");
        // }
    
        inventory.displayLowStockProducts(5);
        inventory.displayLowStockProducts(11);
    
        System.out.println(inventory.getTotalUnits());
    
        System.out.println("Total invenotry value: R"+inventory.getTotalValue());
    
    }
}









