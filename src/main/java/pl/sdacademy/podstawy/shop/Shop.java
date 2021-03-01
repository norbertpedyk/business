package pl.sdacademy.podstawy.shop;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Shop {

    private Order[] orders;

    public Order addOrder(String clientsName, Product product, int quantity) {
        return new Order(clientsName, product, quantity);
    }

    public Shop() {
        this.orders = new Order[0];
    }


    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public Order[] getOrders() {
        return orders;
    }


    public Order[] ordersLookupByClientsName(String clientsName) {
        Order[] ordersMatchingClientsName = new Order[orders.length];
        Pattern p = Pattern.compile(clientsName, Pattern.CASE_INSENSITIVE);
        int counter = 0;
        for (Order order : orders) {
            Matcher m = p.matcher(order.getClientsName());
            boolean result = m.find();
            if (result) {
                ordersMatchingClientsName[counter] = order;
                counter++;
            }
        }
        return Arrays.copyOf(ordersMatchingClientsName, counter);
    }


}


