package repositories;

import models.Book;
import models.User;

import java.time.LocalDate;

public class ArrayUserRepositoryImpl implements UserRepository {
    private User[] users;
    private int userCount;

    public ArrayUserRepositoryImpl(int userCount) {
        users = new User[userCount];
        this.userCount = 0;
    }


    @Override
    public User addUser(User user) {
        return null;
    }
}
