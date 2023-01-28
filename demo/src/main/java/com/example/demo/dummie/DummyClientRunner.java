package com.example.demo.Dummy;

import com.example.demo.domain.*;
import com.example.demo.repositories.*;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

@Component
@Profile("dev")
public class DummyClientRunner
{

    private final AddressRepository _addressRepository;
    private final DeliveryRepository _deliveryRepository;
    private final DeliveryReviewRepository _deliveryReviewRepository;
    private final DishRepository _dishRepository;
    private final FoodOrderRepository _foodOrderRepository;
    private final IngredientRepository _ingredientRepository;
    private final OrderedDishRepository _orderedDishRepository;
    private final ReviewRepository _reviewRepository;
    private final RiderRepository _riderRepository;





    DummyClientRunner(AddressRepository addressRepository, DeliveryRepository deliveryRepository, DeliveryReviewRepository deliveryReviewRepository, DishRepository dishRepository, FoodOrderRepository foodOrderRepository, IngredientRepository ingredientRepository, OrderedDishRepository orderedDishRepository, ReviewRepository reviewRepository, RiderRepository riderRepository){

        _addressRepository = addressRepository;
        _deliveryRepository = deliveryRepository;
        _deliveryReviewRepository = deliveryReviewRepository;
        _dishRepository = dishRepository;
        _foodOrderRepository = foodOrderRepository;
        _ingredientRepository = ingredientRepository;
        _orderedDishRepository = orderedDishRepository;
        _reviewRepository = reviewRepository;
        _riderRepository = riderRepository;
    }

    @Scheduled(fixedRate = 10000) //Zet dit laag om jezelf eens goed te DOSsen...
    public void generateOrders() throws Exception
    {
        System.out.println("DummyClientRunner.generateOrders is running");

        Ingredient broodje = new Ingredient("Bun",  true, 10);
        Ingredient burger = new Ingredient("Burger", false, 10);
        Ingredient vegaburger = new Ingredient("Vegaburger", true, 10);
        Ingredient kaas = new Ingredient("Cheese", false, 10);
        Ingredient sla = new Ingredient("Lettuce", true, 10);
        Ingredient tomaat = new Ingredient("Tomato", true, 10);
        _ingredientRepository.saveAll(Arrays.asList(broodje, burger, vegaburger, kaas, sla, tomaat));

        var burgerDish = new Dish("Burger","Lekker", broodje, burger, kaas, sla, tomaat);
        var vegaburgerDish = new Dish("Vegaburger","Lekker", broodje, vegaburger, sla, tomaat);
        var salad = new Dish("Salad","Lekker", sla, tomaat);
        var croqueMonsiur = new Dish("Croque Monsieur","Lekker", broodje, kaas);
        _dishRepository.saveAll(Arrays.asList(burgerDish, vegaburgerDish, salad, croqueMonsiur));

        var riderJaap = new Rider("Jaap", "Jeep");
        _riderRepository.save(riderJaap);

        var address = new Address("street1","city1","state1","zipcode1");
        _addressRepository.save(address);

        var foodOrder = new FoodOrder(address, LocalDateTime.now(), OrderStatus.CREATED);
        _foodOrderRepository.save(foodOrder);

        var saladOrderedDish = new OrderedDish(foodOrder, salad, 1);
        var vegaburgerOrderedDish = new OrderedDish(foodOrder, vegaburgerDish, 1);

        _orderedDishRepository.saveAll(Arrays.asList(saladOrderedDish, vegaburgerOrderedDish));

    }
}
