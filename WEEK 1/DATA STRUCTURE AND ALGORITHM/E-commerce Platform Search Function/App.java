import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Product Search Application!");
    
        Product[] products = {
            new Product(1, "Tablet", "Electronics"),
            new Product(2, "Sneakers", "Footwear"),
            new Product(3, "Pen", "Stationery"),
            new Product(4, "Headphones", "Electronics"),
            new Product(5, "Cushion", "Home Decor"),
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Footwear"),
            new Product(3, "Notebook", "Stationery"),
        };

        System.out.print("Enter product name to search: ");
        String keyword = sc.nextLine();

        System.out.println("\n-- Linear Search Results --");
        List<Product> linearResults = ProductSearch.linearSearch(products, keyword);
        if (linearResults.isEmpty()) {
            System.out.println("No products found using linear search.");
        } else {
            for (Product p : linearResults) {
                System.out.println(p);
            }
        }

        System.out.println("\n-- Binary Search Result  --");
        Product binaryResult = ProductSearch.binarySearch(products, keyword);
        if (binaryResult != null) {
            System.out.println("Product found: " + binaryResult);
        } else {
            System.out.println("No exact match found using binary search.");
        }

        System.out.println("\nDo you want to search again? (y/n)");
        String choice = sc.next();

        if(choice.equalsIgnoreCase("y")) {
            main(args); 
        } else {
            System.out.println("Thanks for using the product search application!");
        }

        sc.close();
    }
}