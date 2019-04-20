package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * creat by nickless
 * @Date 2019/4/18 9:37
 **/
public interface IUserService {
     ServerResponse <User> login(String username, String password);
    ServerResponse<String> register(User user);
    ServerResponse<String> checkVaild (String str,String type );
    ServerResponse selectQuestion(String username);
    ServerResponse<String> checkAnswer(String username,String question,String answer);
    ServerResponse<String> forgetRestPassword(String username, String passwordNew,String forgetToken );
    ServerResponse<String> resetPassword(String passwordOld,String passwordNew,User user );
    ServerResponse<User> updateInformation(User user);
    ServerResponse<User> getInformation(Integer userId);
}
