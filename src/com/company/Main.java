package com.company;

import com.company.dao.Gender;
import com.company.imp1.UserServiceImpl;
import com.company.model.User;

public class Main {

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.userKoshy(new User(1,"Inci",19,Gender.FEMALE));
        userService.userKoshy(new User(2,"Verda",17,Gender.FEMALE));
        userService.userKoshy(new User(3,"Mucahit",31,Gender.MALE));
        userService.idAluu(2);
        System.out.println(userService.idAluu(2));

        }
}

