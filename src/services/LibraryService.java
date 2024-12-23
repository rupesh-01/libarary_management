package services;

import models.Book;
import models.User;

public interface LibraryService {
    Book addBook(Book book);
    Book issueBook(int bookId, User user);
    Book returnBook(int bookId, int userId);

}
