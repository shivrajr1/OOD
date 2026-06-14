public class Main {
    public static void main(String[] args) {

        Product product=new Product.Builder("shirt", 200)
                        .brand("hello brand")
                        .expiry(6)
                        .build();
                        
        System.out.println("[ name : "+product.getName()+", price : "+product.getPrice()+", brand : "+product.getBrand()+", expiry : "+product.getExpiry()+" ]");
    }
}
