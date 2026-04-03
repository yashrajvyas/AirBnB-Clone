package com.MajorProject.AirBnB.App.dto;

import com.MajorProject.AirBnB.App.entity.User;
import com.MajorProject.AirBnB.App.entity.enums.Gender;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}
