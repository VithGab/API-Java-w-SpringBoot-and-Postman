package Subscription.demo_subs.model;

public class Subscription {
    private String id;
    private String name;
    private String category;
    private double price;
    private int paymentDate;

    public Subscription() {
    }

    public Subscription(String id, String name, String category, double price, int paymentDate){
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.paymentDate = paymentDate;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(int paymentDate) {
        this.paymentDate = paymentDate;
    }
}
