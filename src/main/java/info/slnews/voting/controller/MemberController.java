package info.slnews.voting.controller;

import info.slnews.voting.entity.User;
import info.slnews.voting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
//@RequestMapping("/member")
public class MemberController {

    @Autowired
    private UserService userService;

    @GetMapping("/member")
    public List<String> getMembers() {

        return Arrays.asList("Member1, Member2");
    }

    @GetMapping("/user")
    public List<User> getUsers() {

        return userService.getUsers();
    }

    @GetMapping("/admin")
    public List<String> getAdmin() {

        return Arrays.asList("Admin 1, Admin 2");
    }

    @GetMapping("/login")
    public List<String> getLogin() {

        return Arrays.asList("Loging page");
    }
}
