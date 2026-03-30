package com.MajorProject.AirBnB.App.dto;

import com.MajorProject.AirBnB.App.entity.HotelContactInfo;
import lombok.Data;


@Data
public class HotelDto {

    private Long id;
    private String name;
    private String city;
    private String[] photos;
    private String[] amenities;
    private HotelContactInfo hotelContactInfo;
    private Boolean active;
}
