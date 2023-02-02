package generics;

public class Product<PRODUCT,PRODUCTNAME> {

    public PRODUCT productId;
    public PRODUCTNAME productName;

    public  Product(PRODUCT productId,PRODUCTNAME productName)
    {
        this.productId=productId;
        this.productName=productName;
    }

}
