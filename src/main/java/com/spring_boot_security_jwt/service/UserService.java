package com.spring_boot_security_jwt.service;

import com.spring_boot_security_jwt.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store= new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"sarthak","pawarsr06@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Ram","Dhanya@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Tejas","Devabhau@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Prachi","Shindemama@gmail.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }
}
