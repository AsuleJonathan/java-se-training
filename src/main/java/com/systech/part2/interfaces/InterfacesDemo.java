package com.systech.part2.interfaces;

import java.util.UUID;

public class InterfacesDemo {
    public static void main(String[] args) {
        ThreePinPlug mc = new MobileCharger();
        ThreePinPlug lc = new LaptopCharger();

        mc.plugIn();
        mc.plugOut();

        lc.plugIn();
        lc.plugOut();

        Square sq = new Square();
        System.out.println(sq.calculateArea(5, 5));
        System.out.println(sq.calculatePerimeter(5, 5));
        // System.out.println(Square.MY_NAME);
        // System.out.println(Square.MY_NAME_Full);
        System.out.println(sq.sum(2,3));

        UserController uc = new UserControllerImpl();
        User user = new User("001","Mhusika");
        // User createdUser = uc.createUser(user);
        user.setId(UUID.randomUUID().toString());
        
        System.out.println(user);

        BookController bk = new BookControllerImpl();
        Book book1 = new Book("222", "finance", "John");
        Book book2 = new Book("333", "Java", "Goslinger");

        bk.createBook(book1);
        bk.createBook(book2);

        System.out.println(bk.findBook("222"));
        System.out.println(bk.updateBook("333", "Python"));

        bk.deleteBook("333");
        System.out.println(bk.findBook("333"));
    }
}
