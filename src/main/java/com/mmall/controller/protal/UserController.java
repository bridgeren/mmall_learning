package com.mmall.controller.protal;

import com.mmall.common.Const;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;
import com.mmall.service.IUserService;
import com.mysql.cj.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private IUserService iUserService;
  /**
   * @Author nickless
   * @Description 
   * @Date 9:20 2019/4/18
   * @Param [username, password, session]
   * @return
   **/
  @RequestMapping(value="login.do",method= RequestMethod.POST)
  @ResponseBody         //使用springmvc 插件 序列化json
    public ServerResponse<User> login(String username, String password, HttpSession session){
         ServerResponse<User>  response=iUserService.login(username,password);
         if(response.isSuccess()){
            session.setAttribute(Const.CURRENT_USER,response.getData());
         }
      return  response;
    }

}
