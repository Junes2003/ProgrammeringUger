package Uge9.Product;

public class MainProduct {
    public static void main(String[] args) {
        Product product = new Product();
        product.setProductName("Samsung tv");
        product.setProductCode("hdgs4d5g4");
        product.setPrice(1499);


        System.out.println(product.getProductName());
        System.out.println(product.getProductCode());
        System.out.println(product.getPrice());

    }
}
