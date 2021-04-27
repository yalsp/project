package com.peocess.dao;

import com.peocess.demo.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {

    @Query(value = "select * from  user where username=:username and password=:password",nativeQuery = true)
    UserEntity findUserByUsernameAndPassword(String username,String password);


}
