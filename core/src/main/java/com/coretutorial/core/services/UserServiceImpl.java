package com.coretutorial.core.services;

import com.coretutorial.core.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(Long id) {
        return null;
    }
}
