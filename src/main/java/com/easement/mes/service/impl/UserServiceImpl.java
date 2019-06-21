package com.easement.mes.service.impl;

import com.easement.mes.model.Users;
import com.easement.mes.model.UsersRepository;
import com.easement.mes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UsersRepository userRepository;

    @Override
    public List<Users> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public Users findUserById(long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void save(Users user) {
        userRepository.save(user);
    }

    @Override
    public void edit(Users user) {
        userRepository.save(user);
    }

    @Override
    public void delete(long id) {
        userRepository.deleteById(id);
    }
}
