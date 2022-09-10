package info.slnews.voting.security;

import info.slnews.voting.entity.User;
import info.slnews.voting.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserDetailsServicePrinciple implements UserDetailsService {

    private UserRepo userRepo;

    public UserDetailsServicePrinciple(UserRepo userRepository) {
        this.userRepo = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUsername(username);
        return new UserDetailsPrinciple(user);
    }
}
