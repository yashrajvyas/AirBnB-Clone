package com.MajorProject.AirBnB.App.strategy;

import com.MajorProject.AirBnB.App.entity.Inventory;

import java.math.BigDecimal;

public interface PricingStrategy {
    BigDecimal calculatePrice(Inventory inventory);
}
