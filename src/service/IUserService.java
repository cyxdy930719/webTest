package service;

import pojo.User;

public interface IUserService {
    public int insert(User user);
    public User getOne(String username);
}
