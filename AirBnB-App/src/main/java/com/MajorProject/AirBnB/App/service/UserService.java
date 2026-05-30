package com.MajorProject.AirBnB.App.service;

import com.MajorProject.AirBnB.App.entity.User;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;

public interface UserService {
    public User getUserById(Long id);
}
