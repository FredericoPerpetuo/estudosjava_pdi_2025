package conceitos.app;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Order order1 = new Order(1111, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order1);

        //Convertendo string para ENUM
        Order order2 = new Order(2222, new Date(), OrderStatus.valueOf("DELIVERED"));
        System.out.println(order2);

    }
}