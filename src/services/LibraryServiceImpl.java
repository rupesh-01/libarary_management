package services;

import exceptions.BookNotFound;
import models.Book;
import models.User;
import repositories.BookRepository;
import repositories.UserRepository;

import java.time.LocalDate;

public class LibraryServiceImpl implements LibraryService{
    private BookRepository bookRepository;
    private UserRepository userRepository;

    public LibraryServiceImpl(BookRepository bookRepository, UserRepository userRepository) {
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
    }


    @Override
    public Book addBook(Book book) {
        return null;
    }

    @Override
    public Book issueBook(int bookId, User user) {
        //find the book with the given id
        //create the user and assign the book
        // status as false
        // handle the exceptions
        Book foundBook = bookRepository.findBookById(bookId);
        if(foundBook == null) throw new BookNotFound("Book id not found : " + bookId);
        if(foundBook.getUser() == null) {
            User createdUser = userRepository.addUser(user);
            foundBook.setUser(createdUser);
            foundBook.setIssueDate(LocalDate.now());
        }
        return foundBook;
    }

    @Override
    public Book returnBook(int bookId, int userId) {
        //TO DO: implement the return book

        // find the book with the given book id
        // find the user with the given id
        // get the user of the book and if it's not null then proceed
        // foundbook.setUser(null);
        // foundBook.setReturnDate();
        return null;
    }
}
