package com.vms.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleTypeController {
    @GetMapping("/vehicletypes")
    public String getCountries() {
        return "vehicle-type";
    }
}
