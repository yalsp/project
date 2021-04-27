package com.peocess.demo;


import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name ="user")
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String username;

    private String password;


    public UserEntity(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserEntity() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
