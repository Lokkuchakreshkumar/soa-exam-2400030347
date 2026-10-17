package com.klef.soa.exam.service;

import java.util.List;
import java.util.Optional;
import com.klef.soa.exam.entity.FoodTruckEntity;

public interface FoodTruckService {
    FoodTruckEntity addFoodTruck(FoodTruckEntity foodTruck);
    List<FoodTruckEntity> getAllFoodTrucks();
    boolean deleteFoodTruck(Long id);
    Optional<FoodTruckEntity> getFoodTruckById(Long id);
}
