package jpa.Dao;

import jpa.classMetier.User;


public class UserDao extends AbstractJpaDao<Long, User> {


public UserDao() {
    super(User.class);
}
    
    
}