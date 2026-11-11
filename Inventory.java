import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Comparator;

public class Inventory {

    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        if (productExists(product.getId())) {
            throw new IllegalArgumentException("A Product with this id already exists");
        }

        products.add(product);
    }

    public int getProductCount() {
        return products.size();
    }

    public boolean productExists(int id) {
        for (Product existingProduct : products) {
            if (existingProduct.getId() == id) {
                return true;
            }
        }
        return false;
    }

    // public boolean removeProduct(int id){
    // for(Product existingProduct : products){
    // if(existingProduct.getId() == id){
    // products.remove(existingProduct);
    // System.out.println("dUPLICATE PRODUCT HAS BEEN REMOVED");
    // return true;
    // }
    // }
    // return false;
    // }

    public boolean removeProduct(int id) {

        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;

    }

    public Product getProductById(int id) {
        for (Product existingProduct : products) {
            if (existingProduct.getId() == id) {
                return existingProduct;
            }
        }
        return null;
    }

    public void updateStock(int id, int newQuantity) {
        Product product = getProductById(id);

        if (product == null) {
            throw new IllegalArgumentException("Product not found");
        }
        product.setQuantity(newQuantity);
    }

    public void displayInventory() {
        
        if (products.isEmpty()) {
            System.out.println("Inventory is empty");
            return;
        }
        for (Product product : products) {
            System.out.println("ID: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Quantity: " + product.getQuantity());
            System.out.println();
        }
    }
    
    public void sortProductsByPrice(){
        products.sort(Comparator.comparingDouble(Product::getPrice));
    }

    public void sortProductByName(){
        products.sort(Comparator.comparing(Product::getName).reversed());
    }

    public Product searchProductByName(String name){
            for(Product product : products){
                if(product.getName().equalsIgnoreCase(name)){
                    return product;
                }
            }
            return null;
    }

    public void displayLowStockProducts(int threshold){
        boolean found = false;
        for(Product product : products){
            if(product.getQuantity() < threshold){
                System.out.println(product.getQuantity() +" - "+ product.getName() );
                found = true;
            }
        }
        if(!found){
            System.out.println("No Low-Stock products found");
        }
    }

    public int getTotalUnits(){
        int totalUnits = 0;
        for(Product product : products){
            totalUnits += product.getQuantity();
        }
        return totalUnits;
    }

    public double getTotalValue(){
        double totalValue = 0;
        double finalValue = 0;
        for(Product product : products){
            totalValue = product.getPrice() * product.getQuantity();
            finalValue += totalValue;
        }
        return finalValue;
    }












}