package pl.sdacademy.podstawy.shop;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Shop {

    private final Order[] orders;
    private int counter = 0;


    public Order addOrder(String clientsName, Product product, int quantity) {
        if (counter >= orders.length) {
            return null;
        }
        Order order = new Order(clientsName, product, quantity);
        orders[counter] = order;
        counter++;
        return order;
    }


    public Shop(int capacity) {
        this.orders = new Order[capacity];
    }


    public Order[] getOrders() {
        return Arrays.copyOf(orders, orders.length);
    }

    // funkcja do naprawy
    public Order[] ordersLookupByClientsName(String clientsName) {
        Order[] ordersMatchingClientsName = new Order[orders.length];
        Pattern p = Pattern.compile(clientsName, Pattern.CASE_INSENSITIVE);
        int counter = 0;
        for (Order order : getOrders()) {
            if (order != null) {
                Matcher m = p.matcher(order.getClientsName());
                boolean result = m.find();
                if (result) {
                    ordersMatchingClientsName[counter] = order;
                    counter++;
                }
            }
        }
        return Arrays.copyOf(ordersMatchingClientsName, counter);
    }


}


