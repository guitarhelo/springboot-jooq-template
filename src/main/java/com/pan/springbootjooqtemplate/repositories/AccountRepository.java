package com.pan.springbootjooqtemplate.repositories;

import com.pan.springbootjooqtemplate.domain.Account;
import java.util.List;

/**
 * Created by panjingping on 12/23/2017.
 */

    public interface AccountRepository {

        public Account add(Account accountEntry);

        public Account delete(int id);

        public List<Account> findAll();

     //   public Page findAll(Pageable pageable);

        public Account findById(int id);

        public Account update(Account accountEntry);
    }
