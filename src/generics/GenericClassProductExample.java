package generics;

public class GenericClassProductExample {
    public static void main(String[] args) {
        Product<String,String> product = new Product<>("P001","Leptop");
        String pId= product.productId;
        String pName= product.productName;
        System.out.println("Product Id is: "+ pId + " Product Name is: " + pName);
        Product<Integer,String> productOne = new Product<>(1,"WaterBottle");
        System.out.println("Product Id is: "+ productOne.productId + " Product Name is: " + productOne.productName);
    }
}
