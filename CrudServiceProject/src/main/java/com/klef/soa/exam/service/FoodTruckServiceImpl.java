package com.klef.soa.exam.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.soa.exam.entity.FoodTruckEntity;
import com.klef.soa.exam.repository.FoodTruckRepository;

@Service
public class FoodTruckServiceImpl implements FoodTruckService {

    @Autowired
    private FoodTruckRepository foodTruckRepository;

    @Override
    public FoodTruckEntity addFoodTruck(FoodTruckEntity foodTruck) {
        foodTruck.setId(null);
        return foodTruckRepository.save(foodTruck);
    }

    @Override
    public List<FoodTruckEntity> getAllFoodTrucks() {
        return foodTruckRepository.findAll();
    }

    @Override
    public boolean deleteFoodTruck(Long id) {
        if (foodTruckRepository.existsById(id)) {
            foodTruckRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Optional<FoodTruckEntity> getFoodTruckById(Long id) {
        return foodTruckRepository.findById(id);
    }
}
