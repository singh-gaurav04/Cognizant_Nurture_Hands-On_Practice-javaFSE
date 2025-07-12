import java.util.*;

public class ProductSearch {

    public static List<Product> linearSearch(Product[] products, String keyword) {
        List<Product> matches = new ArrayList<>();
        for (Product p : products) {
            if (p.getProductName().toLowerCase().contains(keyword.toLowerCase())) {
                matches.add(p);
            }
        }
        return matches;
    }

    public static Product binarySearch(Product[] products, String keyword) {
        Arrays.sort(products, Comparator.comparing(p -> p.getProductName().toLowerCase()));
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            Product midProduct = products[mid];
            int cmp = midProduct.getProductName().compareToIgnoreCase(keyword);

            if (cmp == 0) {
                return midProduct;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}