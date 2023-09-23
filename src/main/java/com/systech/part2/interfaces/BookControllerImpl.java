package com.systech.part2.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BookControllerImpl implements BookController {
    List<Book> books = new ArrayList<Book>();

    @Override
    public Book createBook(Book book) {
        book.setId(UUID.randomUUID().toString());
        books.add(book);
        return book;
    }

    @Override
    public Book findBook(String isbn) {

        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public Book updateBook(String isbn, String title) {

        Book book = findBook(isbn);
        book.setTitle(title);
        return book;
    }

    @Override
    public void deleteBook(String isbn) {
        Book book = findBook(isbn);
        books.remove(book);
    }

}
