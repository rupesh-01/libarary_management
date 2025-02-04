package repositories;

import models.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayBookRepositoryImpl implements BookRepository {
    private Book[] availableBooks;
    private int bookCount;

    public ArrayBookRepositoryImpl() {
        availableBooks = new Book[5];
        this.bookCount = 5;
        availableBooks[0] = new Book("Rich Dad and Poor Dad", "Kim", "en");
    }


    @Override
    public Book addBook(Book book) {
        return null;
    }

    @Override
    public Book updateBook(int id, LocalDate issueDate) {
        return null;
    }

    @Override
    public boolean deleteBook(int id) {
        return false;
    }

    @Override
    public List<Book> viewBooks() {
        return new ArrayList<>(Arrays.asList(availableBooks));
    }

    @Override
    public Book findBookById(int id) {
        return null;
    }
}
