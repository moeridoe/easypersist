package de.moeri.easypersist.service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import de.moeri.easypersist.domain.User;

@RestController
public interface RestService {

    @PostMapping("/user")
    void saveUser(@RequestBody User user);
}
