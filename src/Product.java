import java.util.Arrays;

public class Product {
    /* TODO: create a class called Product with two private properties of name and priceInCents.
    Add a public static method called, findAveragePrice, that takes in an array of products
    and finds the average price of all products. Add a main method to the class to test some
    values.
 */

    private String name;
    private double priceInCents;

    public Product(String productName, int price) {
        this.name = productName;
        this.priceInCents = price;
    }

    public static Product[] products = {
            new Product("Skateboard", 10),
            new Product("Cabinet", 50),
            new Product("Door", 25)
    };

    public static double findAveragePrice (Product[] listOfProducts) {
        double sum = 0;
        for (Product product : listOfProducts) {
            sum += product.priceInCents;
        }
        return sum/listOfProducts.length;
    }

    public static String[] printNames (Product[] listOfNames) {
        String[] names = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            names[i] = listOfNames[i].name;
        }
        return names;
    }

    public static void printAllNames () {
        for (Product product : products) {
            System.out.println(product.getNames());
        }
    }

    public String getNames() {
        return name;
    }

    public static void main(String[] args) {
        System.out.printf("The average price of all of the products is $%.2f. %n", findAveragePrice(products));

        System.out.println(Arrays.toString(printNames(products)));

        printAllNames();
    }
}
