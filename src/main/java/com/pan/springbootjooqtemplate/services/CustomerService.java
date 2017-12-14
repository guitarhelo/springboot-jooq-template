package com.pan.springbootjooqtemplate.services;

import com.pan.springbootjooqtemplate.jooq.tables.records.CustomerRecord;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.pan.springbootjooqtemplate.jooq.Tables.*;

@Component
public class CustomerService {

    @Autowired
    private DSLContext dslContext;

    public List<CustomerRecord> searchByName(String name) {
        String filter = "%" + name + "%";
        return dslContext
            .selectFrom(CUSTOMER)
            .where(CUSTOMER.FIRST_NAME.likeIgnoreCase(filter)
            .or(CUSTOMER.LAST_NAME.likeIgnoreCase(filter)))
            .fetchInto(CustomerRecord.class);
    }

}
