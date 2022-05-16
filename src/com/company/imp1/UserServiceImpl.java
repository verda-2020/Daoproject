package com.company.imp1;

import com.company.dao.UserDao;
import com.company.model.User;

public class UserServiceImpl implements UserService{
    private UserDao userDao = new UserDao();


    @Override
    public void userKoshy(User user) {
        userDao.getArrayList().add(user);
    }

    @Override
    public User idAluu(int id) {
        User userid = new User();
        for (User user:userDao.getArrayList()) {
            if (user.getId() == id){
                userid = user;
            }

        }
        return userid;
    }

    @Override
    public void idOchuruu(int id) {
        for (User user:userDao.getArrayList()){
             if (user.getId()==id){
                 userDao.getArrayList().remove(user);
             }

        }

    }

    @Override
    public void userAluu() {
        for (User user:userDao.getArrayList()){
            System.out.println(user);
        }
    }
}

