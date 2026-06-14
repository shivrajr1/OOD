public class Product {

    private String name;
    private int price;
    private String brand;
    private int expiry;

    private Product(Builder builder){
        this.name=builder.name;
        this.price=builder.price;
        this.brand=builder.brand;
        this.expiry=builder.expiry;
    }
    public String getBrand() {
        return brand;
    }
    public int getExpiry() {
        return expiry;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public static class Builder {

        private String name;
        private int price;
        private String brand;
        private int expiry;

        Builder(String name, int price){
            this.name=name;
            this.price=price;
        }
        public Builder brand(String brand){
            this.brand=brand;
            return this;
        }
        public Builder expiry(int expiry){
            this.expiry=expiry;
            return this;
        }
        public Product build(){
            return new Product(this);
        }
    }
}
