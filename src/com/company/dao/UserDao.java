package com.company.dao;

import com.company.model.User;

import java.util.ArrayList;

public class UserDao {
    private ArrayList<User>arrayList = new ArrayList<>();

    public ArrayList<User> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<User> arrayList) {
        this.arrayList = arrayList;
    }
}
