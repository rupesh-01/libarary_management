package repositories;

import models.Book;

import java.time.LocalDate;
import java.util.List;

public interface BookRepository {
    Book addBook(Book book);
    Book updateBook(int id, LocalDate issueDate);
    boolean deleteBook(int id);
    List<Book> viewBooks();
    Book findBookById(int id);
}
