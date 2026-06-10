package com.MajorProject.AirBnB.App.strategy;

import com.MajorProject.AirBnB.App.entity.Inventory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PricingService {

    public BigDecimal calculateDynamicPricingStrategy(Inventory inventory) {
        PricingStrategy pricingStrategy = new BasePriceStrategy();

        pricingStrategy = new SurgePriceStrategy(pricingStrategy);
        pricingStrategy = new OccupancyPricingStrategy(pricingStrategy);
        pricingStrategy = new UrgencyPricingStrategy(pricingStrategy);
        pricingStrategy = new HolidayPricingStrategy(pricingStrategy);

        return pricingStrategy.calculatePrice(inventory);
    }

    //Return the sum of price of the inventory list
    public BigDecimal calculateTotalPrice(List<Inventory> inventoryList) {
        return inventoryList.stream()
                .map(this::calculateDynamicPricingStrategy)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
