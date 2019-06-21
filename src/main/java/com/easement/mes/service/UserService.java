package com.easement.mes.service;


import com.easement.mes.model.Users;

import java.util.List;

public interface UserService {
    List<Users> getUserList();
    Users findUserById(long id);
    void save(Users user);
    void edit(Users user);
    void delete(long id);
}
