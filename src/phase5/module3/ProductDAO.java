package phase5.module3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ProductDAO {
    public static void main(String[] args) throws ProductNotFoundException {
        HashMap<Integer, String> products = new HashMap<>();
        products.put(1, "Apple");
        products.put(2, "Banana");
        products.put(3, "Carrot");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product id: ");
        int productId = sc.nextInt();
        if (products.containsKey(productId)) {
            System.out.println(products.get(productId));
        } else {
            throw new ProductNotFoundException("Product not found with given id: " + productId);
        }
    }
}
