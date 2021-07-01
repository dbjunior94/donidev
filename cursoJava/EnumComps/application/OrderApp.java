package cursoJava.EnumComps.application;

import cursoJava.EnumComps.entities.Order;
import cursoJava.EnumComps.entities.enums.OrderStatus;

import java.util.Date;

public class OrderApp {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);
    }
}
