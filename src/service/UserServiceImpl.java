package service;

import dao.IUserDao;
import dao.UserDaoImpl;
import pojo.User;

public class UserServiceImpl  implements IUserService{
    private IUserDao dao =new UserDaoImpl();
    @Override
    public int insert(User user) {
        return dao.insert(user);
    }

    @Override
    public User getOne(String username) {
        return dao.getOne(username);
    }
}
