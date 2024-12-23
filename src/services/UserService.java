package services;

import models.User;

public interface UserService {
    User updateUser(int id);
    User addUser(User user);

}
