package com.peocess.Service.userservice;

import com.peocess.demo.UserEntity;



public interface UserService {

    UserEntity findUserByUsernameAndPassowrd(String username,String password);



}
