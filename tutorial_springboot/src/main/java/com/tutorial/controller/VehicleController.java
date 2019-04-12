package com.tutorial.controller;

import com.tutorial.init.VehicleInit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jimmy
 * @date 2019-04-12 15:44
 */
@RestController
public class VehicleController {
    @Autowired
    VehicleInit vehicleInit;

    @RequestMapping("/vehicleTest")
    public String vehicleTest(){
        return vehicleInit.getVehicle();
    }
}
