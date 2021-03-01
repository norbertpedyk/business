package pl.sdacademy.podstawy.shop;

import java.math.BigDecimal;
import java.util.Arrays;

public class MainShop {
    public static void main(String[] args) {

        //Obiekt sklep
        Shop shop = new Shop(10);

        //Nowe produkty

        Product soap = new Product("Soap", new BigDecimal("12"));
        Product rice = new Product("Rice", new BigDecimal("1.20"));
        Product candy = new Product("Candy", new BigDecimal("0.90"));
        Product onion = new Product("Onion", new BigDecimal("0.50"));


        //Nowe Zamówienia


        Order order1 = shop.addOrder("Marian Paździoch", rice, 10);
        Order order2 = shop.addOrder("Alicja Nowak", onion, 25);
        Order order3 = shop.addOrder("Marek Janusz", soap, 2);
        Order order4 = shop.addOrder("Karol Bombowiec", candy, 3);
        Order order5 = shop.addOrder("Adam Nowak", rice, 300);


        System.out.println(order1.toString());

        System.out.println("-------------");


        for (Order order : shop.getOrders()) {
            if (order != null) {
                System.out.println(order.toString());
            }
        }

        System.out.println("-------------");

        // funkcja szukania po nazwie klienta

        for (Order order : shop.ordersLookupByClientsName("Nowak")) {
                System.out.println(order.toString());
        }

        System.out.println("-------------");
    }
}
