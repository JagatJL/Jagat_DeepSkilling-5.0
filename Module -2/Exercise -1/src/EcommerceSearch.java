class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class EcommerceSearch {

    public static Product linearSearch(Product[] products, String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(name)) {
                return products[i];
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String name) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            int compare = products[mid].productName.compareToIgnoreCase(name);

            if (compare == 0) {
                return products[mid];
            } 
            else if (compare < 0) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(3, "Watch", "Accessories"),
            new Product(1, "Shoes", "Fashion"),
            new Product(2, "Laptop", "Electronics"),
            new Product(4, "Mobile", "Electronics")
        };

        // Linear Search
        Product result1 = linearSearch(products, "Laptop");
        if (result1 != null)
            System.out.println("Linear Search Found: " + result1.productName);
        else
            System.out.println("Not Found");

        // ⚠ For binary search, array must be sorted by productName
        // (Manual sorted array for demo)
        Product[] sortedProducts = {
            new Product(2, "Laptop", "Electronics"),
            new Product(4, "Mobile", "Electronics"),
            new Product(1, "Shoes", "Fashion"),
            new Product(3, "Watch", "Accessories")
        };

        Product result2 = binarySearch(sortedProducts, "Laptop");
        if (result2 != null)
            System.out.println("Binary Search Found: " + result2.productName);
        else
            System.out.println("Not Found");
    }
}