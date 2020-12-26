package com.transwrap.test.dao.impl;

import com.transwarp.dao.AccountDao;

import java.util.List;

public class AccountDaoImpl implements AccountDao {
    @Override
    public List findAll() {
        System.out.println("List find success");
        return null;
    }
}
