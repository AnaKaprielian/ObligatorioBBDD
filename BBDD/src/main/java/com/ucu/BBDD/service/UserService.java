package com.ucu.BBDD.service;

import com.ucu.BBDD.entity.AppUser;
import com.ucu.BBDD.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private AppUserRepository appUserRepository;

    public List<AppUser> getUsers(){
        return appUserRepository.findAll();
    }

    public AppUser saveUser(AppUser appUser){
        return appUserRepository.save(appUser);
    }

    public String deleteUser(String email){
        appUserRepository.deleteById(email);
        return "User removed";
    }


}
