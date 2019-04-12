package com.tutorial.abstr.impl;

import com.tutorial.abstr.Vehicle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 交通工具-飞机
 * @author jimmy
 * @date 2019-04-12 15:23
 */
//@Service("aircraft")
@Service
@Slf4j
public class AircraftVehicle extends Vehicle {

    @Override
    public String travel(){
        return "air";
    }
}
