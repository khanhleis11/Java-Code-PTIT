package code.ptit;

import java.io.*;
import java.util.*;

class Product {
    private String id;
    private String name;
    private long price1;
    private long price2;

    public Product(String id, String name, long price1, long price2) {
        this.id = id;
        this.name = name;
        this.price1 = price1;
        this.price2 = price2;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPrice1() {
        return price1;
    }

    public long getPrice2() {
        return price2;
    }
}

class Invoice {
    private String id;
    private int quantity;

    public Invoice(String id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }
}

public class J07019 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Product> products = new ArrayList<>();
        HashMap<String, Product> productMap = new HashMap<>();

        Scanner productScanner = new Scanner(new File("DATA1.in"));
        int numProducts = Integer.parseInt(productScanner.nextLine());

        for (int i = 0; i < numProducts; i++) {
            String id = productScanner.nextLine();
            String name = productScanner.nextLine();
            long price1 = Long.parseLong(productScanner.nextLine());
            long price2 = Long.parseLong(productScanner.nextLine());

            Product product = new Product(id, name, price1, price2);
            products.add(product);
            productMap.put(id, product);
        }

        productScanner.close();

        Scanner invoiceScanner = new Scanner(new File("DATA2.in"));
        int numInvoices = Integer.parseInt(invoiceScanner.nextLine());

        for (int i = 0; i < numInvoices; i++) {
            String line = invoiceScanner.nextLine();
            String[] parts = line.split(" ");
            String invoiceId = parts[0];
            int quantity = Integer.parseInt(parts[1]);

            Product product = productMap.get(invoiceId.substring(0, 2));
            if (product != null) {
                long discount = calculateDiscount(product, quantity);
                long totalAmount = product.getPrice1() * quantity;
                long amountToPay = totalAmount - discount;

                System.out.println(invoiceId + " " + product.getName() + " " + discount + " " + amountToPay);
            }
        }

        invoiceScanner.close();
    }

    private static long calculateDiscount(Product product, int quantity) {
        if (quantity >= 150) {
            return (product.getPrice1() * quantity) / 2;
        } else if (quantity >= 100) {
            return (product.getPrice1() * quantity * 3) / 10;
        } else if (quantity >= 50) {
            return (product.getPrice1() * quantity) / 20;
        }
        return 0;
    }
}
