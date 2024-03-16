package com.hayate.imajo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hayate.imajo.entity.User;
import com.hayate.imajo.repository.UserRepository;

@Service
public class UserDetailService implements UserDetailsService {
    private final UserRepository userRepository;

    @Autowired
    public UserDetailService(UserRepository userrepository) {
        this.userRepository = userrepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUsername(username);

        if (user.isEmpty()) {
            throw new UsernameNotFoundException("Exception:Username Not Found");
        }
        return new UserDetail(user.get());
    }
}