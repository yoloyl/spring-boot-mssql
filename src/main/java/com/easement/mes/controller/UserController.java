package com.easement.mes.controller;

import com.easement.mes.model.Users;
import com.easement.mes.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String index() {
        return "redirect:/list";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        List<Users> users = userService.getUserList();
        model.addAttribute("users",users);
        return "user/list";
    }

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "user/userAdd";
    }

    @RequestMapping("/add")
    public String add(Users users) {
        userService.save(users);
        return "redirect:/list";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model, Long id) {
        Users users = userService.findUserById(id);
        model.addAttribute("user",users);
        return "user/userEdit";
    }

    @RequestMapping("/edit")
    public String edis(Users users) {
        userService.edit(users);
        return "redirect:/list";
    }

    @RequestMapping("/delete")
    public String delete(Long id) {
        userService.delete(id);
        return "redirect:/list";
    }
}
