package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * creat by nickless
 * @Date 2019/4/18 9:37
 **/
public interface IUserService {
     ServerResponse <User> login(String username, String password);
}
