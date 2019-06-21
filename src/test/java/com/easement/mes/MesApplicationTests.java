package com.easement.mes;

import com.easement.mes.model.Users;
import com.easement.mes.model.UsersRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MesApplicationTests {

    @Autowired
    private UsersRepository usersRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void getUsers() {
        usersRepository.save(new Users("lim",18,"123456"));
        Optional<Users> users = usersRepository.findById(1L);
        System.out.println("users="+users.get().toString());
    }

}
