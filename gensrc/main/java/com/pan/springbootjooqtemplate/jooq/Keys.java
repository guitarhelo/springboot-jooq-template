/**
 * This class is generated by jOOQ
 */
package com.pan.springbootjooqtemplate.jooq;


import com.pan.springbootjooqtemplate.jooq.tables.Customer;
import com.pan.springbootjooqtemplate.jooq.tables.records.CustomerRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;
import org.jooq.types.ULong;


/**
 * A class modelling foreign key relationships between tables of the <code>demo</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<CustomerRecord, ULong> IDENTITY_CUSTOMER = Identities0.IDENTITY_CUSTOMER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CustomerRecord> KEY_CUSTOMER_ID = UniqueKeys0.KEY_CUSTOMER_ID;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<CustomerRecord, ULong> IDENTITY_CUSTOMER = createIdentity(Customer.CUSTOMER, Customer.CUSTOMER.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<CustomerRecord> KEY_CUSTOMER_ID = createUniqueKey(Customer.CUSTOMER, "KEY_customer_id", Customer.CUSTOMER.ID);
    }
}