package com.MajorProject.AirBnB.App.strategy;

import com.MajorProject.AirBnB.App.entity.Inventory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@RequiredArgsConstructor
public class SurgePriceStrategy implements PricingStrategy {

    private final PricingStrategy wrapped;

    @Override
    public BigDecimal calculatePrice(Inventory inventory) {
       BigDecimal price = wrapped.calculatePrice(inventory);
       return price.multiply(inventory.getSurgeFactor());
    }
}

