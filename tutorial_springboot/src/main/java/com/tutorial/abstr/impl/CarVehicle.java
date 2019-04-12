package com.tutorial.abstr.impl;

import com.tutorial.abstr.Vehicle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author jimmy
 * @date 2019-04-12 15:27
 */
@Service("car")
@Slf4j
public class CarVehicle extends Vehicle {

    @Override
    public String travel(){
        return "road";
    }
}
