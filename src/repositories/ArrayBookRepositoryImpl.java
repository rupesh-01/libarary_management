package repositories;

import models.Book;

import java.time.LocalDate;

public class ArrayBookRepositoryImpl implements BookRepository {
    private Book[] availableBooks;
    private int bookCount;

    public ArrayBookRepositoryImpl() {
        availableBooks = new Book[5];
        this.bookCount = 5;
        availableBooks[0] = new Book(1, "Rich Dad and Poor Dad", "Kim", "en");
    }


    @Override
    public Book addBook(Book book) {
        return null;
    }

    @Override
    public Book updateBook(int id, boolean status, LocalDate issueDate) {
        return null;
    }

    @Override
    public Book deleteBook(int id) {
        return null;
    }

    @Override
    public Book[] viewBooks() {
        return new Book[0];
    }

    @Override
    public Book findBookById(int id) {
        return null;
    }
}
