/**
 * This class is generated by jOOQ
 */
package com.pan.springbootjooqtemplate.jooq;


import com.pan.springbootjooqtemplate.jooq.tables.Account;
import com.pan.springbootjooqtemplate.jooq.tables.Comments;
import com.pan.springbootjooqtemplate.jooq.tables.Customer;
import com.pan.springbootjooqtemplate.jooq.tables.Posts;
import com.pan.springbootjooqtemplate.jooq.tables.records.AccountRecord;
import com.pan.springbootjooqtemplate.jooq.tables.records.CommentsRecord;
import com.pan.springbootjooqtemplate.jooq.tables.records.CustomerRecord;
import com.pan.springbootjooqtemplate.jooq.tables.records.PostsRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;
import org.jooq.types.ULong;


/**
 * A class modelling foreign key relationships between tables of the <code>springbootjooq</code> 
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

    public static final Identity<AccountRecord, Integer> IDENTITY_ACCOUNT = Identities0.IDENTITY_ACCOUNT;
    public static final Identity<CommentsRecord, Integer> IDENTITY_COMMENTS = Identities0.IDENTITY_COMMENTS;
    public static final Identity<CustomerRecord, ULong> IDENTITY_CUSTOMER = Identities0.IDENTITY_CUSTOMER;
    public static final Identity<PostsRecord, Integer> IDENTITY_POSTS = Identities0.IDENTITY_POSTS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AccountRecord> KEY_ACCOUNT_PRIMARY = UniqueKeys0.KEY_ACCOUNT_PRIMARY;
    public static final UniqueKey<AccountRecord> KEY_ACCOUNT_ID_INDEX = UniqueKeys0.KEY_ACCOUNT_ID_INDEX;
    public static final UniqueKey<CommentsRecord> KEY_COMMENTS_PRIMARY = UniqueKeys0.KEY_COMMENTS_PRIMARY;
    public static final UniqueKey<CustomerRecord> KEY_CUSTOMER_ID = UniqueKeys0.KEY_CUSTOMER_ID;
    public static final UniqueKey<PostsRecord> KEY_POSTS_PRIMARY = UniqueKeys0.KEY_POSTS_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<CommentsRecord, PostsRecord> COMMENTS_IBFK_1 = ForeignKeys0.COMMENTS_IBFK_1;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<AccountRecord, Integer> IDENTITY_ACCOUNT = createIdentity(Account.ACCOUNT, Account.ACCOUNT.ID);
        public static Identity<CommentsRecord, Integer> IDENTITY_COMMENTS = createIdentity(Comments.COMMENTS, Comments.COMMENTS.ID);
        public static Identity<CustomerRecord, ULong> IDENTITY_CUSTOMER = createIdentity(Customer.CUSTOMER, Customer.CUSTOMER.ID);
        public static Identity<PostsRecord, Integer> IDENTITY_POSTS = createIdentity(Posts.POSTS, Posts.POSTS.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<AccountRecord> KEY_ACCOUNT_PRIMARY = createUniqueKey(Account.ACCOUNT, "KEY_account_PRIMARY", Account.ACCOUNT.ID);
        public static final UniqueKey<AccountRecord> KEY_ACCOUNT_ID_INDEX = createUniqueKey(Account.ACCOUNT, "KEY_account_id_index", Account.ACCOUNT.ID);
        public static final UniqueKey<CommentsRecord> KEY_COMMENTS_PRIMARY = createUniqueKey(Comments.COMMENTS, "KEY_comments_PRIMARY", Comments.COMMENTS.ID);
        public static final UniqueKey<CustomerRecord> KEY_CUSTOMER_ID = createUniqueKey(Customer.CUSTOMER, "KEY_customer_id", Customer.CUSTOMER.ID);
        public static final UniqueKey<PostsRecord> KEY_POSTS_PRIMARY = createUniqueKey(Posts.POSTS, "KEY_posts_PRIMARY", Posts.POSTS.ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<CommentsRecord, PostsRecord> COMMENTS_IBFK_1 = createForeignKey(com.pan.springbootjooqtemplate.jooq.Keys.KEY_POSTS_PRIMARY, Comments.COMMENTS, "comments_ibfk_1", Comments.COMMENTS.POST_ID);
    }
}
