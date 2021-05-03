package com.peocess.service;

import com.peocess.demo.UserEntity;



public interface UserService {

    UserEntity findUserByUsernameAndPassowrd(String username,String password);



}
