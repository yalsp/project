package com.peocess.Controller;
import com.peocess.Service.userservice.UserService;
import com.peocess.dao.UserRepository;
import com.peocess.demo.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;



@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private  UserRepository userRepository;


    @GetMapping("/register")
    public String toRegister(){
        return "register";
    }

    @GetMapping("/login")
    public String toLogin(){
        return "login";
    }


    @RequestMapping(value="/login11")
    @ResponseBody
     public String login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserEntity user= userService.findUserByUsernameAndPassowrd(username,password);
        if (user!=null){
            return "登陆成功";
        }
        else {
            return "登陆失败";
        }
    }

    @RequestMapping(value = "/register11")
    @ResponseBody
    public String register(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserEntity entity=new UserEntity(username,password);
        UserEntity user= userService.findUserByUsernameAndPassowrd(username,password);
        if (user==null){
            userRepository.save(entity);
            return entity.getPassword()+"  "+entity.getUsername();
        }
        else
        {
            return "注册失败";
        }


    }

}



