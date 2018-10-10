package com.hx.service;

import com.hx.exception.UserException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public void addUser(String name) {
        if(name.equals("张三"))
            System.out.print("是啊，我在addUser");
        else
            throw new UserException("你不是张三");
    }
}
