package com.sccs.service;

import com.sccs.dao.UserDao;
import com.sccs.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired 
    private UserDao userDao;

    public int create(User user) {
        return userDao.create(user);
    }
}
