package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamProductExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        productData(productsList);
        // get data of product whose Product Name is Sony
        System.out.println("Product Which name is Sony and Price is More than 25000 :");
        productsList.stream()
                .filter(product -> product.name.equals("Sony")).filter(price -> price.price> 25000)
                .forEach(product -> System.out.println("Product Name :"+ product.name+" Price is :"+ product.price));
        // get the total Price of all Laptop
        Integer totalPrice = productsList.stream()
                .map(product->product.price)
                .reduce(0, Integer::sum);
        System.out.println("Total Price of all laptop :"+totalPrice);
        // get product Whose Price is more than 30000
        List<Integer> productPriceList2 =productsList.stream()
                .filter(p -> p.price > 30000)
                .map(p->p.price)
                .collect(Collectors.toList());
        System.out.println("Product price more than 30000 "+productPriceList2);
        // get the product Which Price is Maximum
        Product productMax = productsList.stream()
                .max((product1, product2)->product1.price > product2.price ? 1: -1)
                .get();
        System.out.println("Highest Price of laptop is:"+productMax.price +" Name of Product is :"+ productMax.name);
        // Convert the List into Map and store id of Product as a Key
        Map<Integer,String> productPriceMap =
                productsList.stream()
                        .collect(Collectors.toMap(p->p.id, p->p.name));
        System.out.println("Product List is now converted in Map : "+productPriceMap);
        //Ascending Order
        List<Integer> products = productsList.stream()
                .map(p->p.price)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Product Price in Ascending Order :"+products);
        //Descending Order
        List<Integer> desProduct = productsList.stream()
                .map(p->p.price)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Product Price in Descending Order :"+desProduct);
    }
    public static void productData(List<Product> productsList)
    {
        productsList.add(new Product(1,"HP",25000));
        productsList.add(new Product(2,"Dell",30000));
        productsList.add(new Product(3,"Lenevo",98000));
        productsList.add(new Product(4,"Sony",28000));
        productsList.add(new Product(5,"Sony",22000));
        productsList.add(new Product(6,"Apple",90000));
    }
}


