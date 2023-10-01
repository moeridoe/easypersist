package de.moeri.easypersist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.moeri.easypersist.domain.User;
import de.moeri.easypersist.domain.UserEntity;
import de.moeri.easypersist.domain.UserMapper;
import de.moeri.easypersist.domain.UserRepository;

@Service
public class RestServiceImpl implements RestService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        UserEntity userEntity = UserMapper.INSTANCE.toUserEntity(user);

        this.userRepository.save(userEntity);
    }
}
