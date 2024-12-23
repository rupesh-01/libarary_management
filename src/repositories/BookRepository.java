package repositories;

import models.Book;

import java.time.LocalDate;

public interface BookRepository {
    Book addBook(Book book);
    Book updateBook(int id, boolean status, LocalDate issueDate);
    Book deleteBook(int id);
    Book[] viewBooks();
    Book findBookById(int id);
}
