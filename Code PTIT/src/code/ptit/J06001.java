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

    public long getPrice(int type) {
        return (type == 1) ? price1 : price2;
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

public class J06001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read product information
        int numProducts = Integer.parseInt(sc.nextLine());
        HashMap<String, Product> productMap = new HashMap<>();
        for (int i = 0; i < numProducts; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            long price1 = Long.parseLong(sc.nextLine());
            long price2 = Long.parseLong(sc.nextLine());
            productMap.put(id, new Product(id, name, price1, price2));
        }

        // Read invoices and calculate
        int numInvoices = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numInvoices; i++) {
            String[] invoiceData = sc.nextLine().split("\\s+");
            String id = invoiceData[0];
            int quantity = Integer.parseInt(invoiceData[1]);

            String productId = id.substring(0, 2);
            int type = Integer.parseInt(id.substring(2));

            Product product = productMap.get(productId);
            long totalAmount = product.getPrice(type) * quantity;
            long discount = calculateDiscount(quantity, totalAmount);
            long amountToPay = totalAmount - discount;

            System.out.println(id + "-" + String.format("%03d", i + 1) + " " + product.getName() + " " + discount + " " + amountToPay);
        }

        sc.close();
    }

    private static long calculateDiscount(int quantity, long totalAmount) {
        if (quantity >= 150) {
            return (totalAmount * 50) / 100;
        } else if (quantity >= 100) {
            return (totalAmount * 30) / 100;
        } else if (quantity >= 50) {
            return (totalAmount * 15) / 100;
        }
        return 0;
    }
}
