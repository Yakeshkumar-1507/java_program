package phase4.module3;

import java.util.Map;
import java.util.TreeMap;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class ProductService {

    private Map<Integer, Product> products = new TreeMap<>();

    public void addProduct(Product product) {
        if (products.containsKey(product.id)) {
            System.out.println("Product ID already exists " + product.id);
            return;
        }
        products.put(product.id, product);
        System.out.println("Added product " + product.name);
    }

    public void viewProducts() {
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            Product product = entry.getValue();
            System.out.println(product);
        }
    }

    public void updatePrice(int id, double price) {
        Product product = products.get(id);
        if (product != null) {
            product.price = price;
        }
    }

    public void removeProduct(int id) {
        Product product = products.get(id);
        if (product != null) {
            products.remove(id);
        }
    }

    public void showCostliestProduct() {
        Product max = null;

        for (Product product : products.values()) {
            if (max == null || product.price > max.price) {
                max = product;
            }
        }
        System.out.println("Costliest product: " + max);
    }
}

public class ProductApp {

    public static void main(String[] args) {

        ProductService productService = new ProductService();
        productService.addProduct(new Product(1, "Mobile",20000));
        productService.addProduct(new Product(2, "Tablet",30000));
        productService.addProduct(new Product(1, "Tablet",40000));

        productService.viewProducts();
        productService.showCostliestProduct();
    }
}
