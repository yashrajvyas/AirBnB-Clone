package com.MajorProject.AirBnB.App.dto;

import com.MajorProject.AirBnB.App.entity.Hotel;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class RoomDto {
    private Long id;
    private String type;
    private BigDecimal basePrice;
    private String[] photos;
    private String[] amenities;
    private Integer totalCount;
    private Integer capacity;
}

