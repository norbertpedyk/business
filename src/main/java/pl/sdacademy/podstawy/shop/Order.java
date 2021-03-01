package pl.sdacademy.podstawy.shop;

import java.math.BigDecimal;

public class Order {

    private final String clientsName;
    private final Product product;
    private final int quantity;
    private final BigDecimal orderPrice;


    public Order(String clientsName, Product product, int quantity) {
        this.clientsName = clientsName;
        this.product = product;
        this.quantity = quantity;
        this.orderPrice = (product.getPrice()).multiply(new BigDecimal(quantity));
    }

    public String getClientsName() {
        return clientsName;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString(){
        return "Ordered by: " + clientsName + ": " + product.toString() +
                ", quantity: " + quantity + ", Cena zamówienia: " + orderPrice;
    }
}
