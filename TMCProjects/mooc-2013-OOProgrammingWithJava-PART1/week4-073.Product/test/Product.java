public class Product {

    private double price;
    private String name;
    private int amount;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.price = priceAtStart;
        this.name = nameAtStart;
        this.amount = amountAtStart;
    }

    public void printProduct(){
        System.out.println(this.name + ", price " + this.price + ", amount " + this.amount);
    }

}
