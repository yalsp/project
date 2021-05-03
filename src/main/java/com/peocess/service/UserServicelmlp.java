package com.peocess.service;
import com.peocess.dao.UserRepository;
import com.peocess.demo.UserEntity;
import org.springframework.stereotype.Service;


@Service
public class UserServicelmlp implements UserService {

    private final UserRepository userRepository;

    public UserServicelmlp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity findUserByUsernameAndPassowrd(String username, String password) {
        return userRepository.findUserByUsernameAndPassword(username, password);
    }
}
