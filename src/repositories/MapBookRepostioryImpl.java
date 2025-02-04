package repositories;

import models.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapBookRepostioryImpl implements BookRepository {
    private Long id;
    private final Map<Long, Book> bookMap;

    public MapBookRepostioryImpl(int capacity) {
        this.id = 1L;
        this.bookMap = new HashMap<>(capacity);
    }


    @Override
    public Book addBook(Book book) {
        bookMap.put(this.id++, book);
        return book;
    }

    @Override
    public Book updateBook(int id,  LocalDate issueDate) {
        if(bookMap.containsKey(id)){
            bookMap.get(id).setIssueDate(issueDate);
        }
        return bookMap.get(id);
    }

    @Override
    public boolean deleteBook(int id) {
        if(bookMap.containsKey(id)){
            bookMap.remove(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Book> viewBooks() {
        return new ArrayList<>(bookMap.values());
    }

    @Override
    public Book findBookById(int id) {
        return bookMap.get(id);
    }
}
