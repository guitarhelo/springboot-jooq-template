package com.pan.springbootjooqtemplate.repositories.impl;

import com.pan.springbootjooqtemplate.domain.Account;
import com.pan.springbootjooqtemplate.repositories.AccountRepository;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by panjingping on 12/23/2017.
 */
@Repository
public class AccountRepositoryJooq implements AccountRepository {


    @Autowired
    private DSLContext dslContext;

    @Override
    public Account add(Account accountEntry) {


        return null;
    }

    @Override
    public Account delete(int id) {
        return null;
    }

    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public Account findById(int id) {
        return null;
    }

    @Override
    public Account update(Account accountEntry) {
        return null;
    }
}
