package phase4.module3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ProductItem {
    int id;
    String name;
    int price;

    ProductItem(int id, String name, int price) {
        this.name = name;
        this.price = price;
        this.id = id;
    }
}


public class ProductDemo {

    public static void main(String[] args) {
        List<ProductItem> items = new ArrayList<>();
        items.add(new ProductItem(1, "A", 100));
        items.add(new ProductItem(2, "B", 200));
        items.add(new ProductItem(3, "C", 300));

        Scanner input = new Scanner(System.in);
        int inputId = input.nextInt();

        for (ProductItem item : items) {
            if (item.id == inputId) {
                System.out.println(item.name + " " + item.price);
                System.out.println(Status.APPROVED);
            } else {
                System.out.println(Status.REJECTED);
            }
            break;
        }

    }
}
