package dao;

import pojo.User;

public interface IUserDao {
    public int insert(User user);
    public User getOne(String username);
}
