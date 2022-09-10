package info.slnews.voting.service.impl;

import info.slnews.voting.entity.User;
import info.slnews.voting.repo.UserRepo;
import info.slnews.voting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }
}
