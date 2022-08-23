package com.vms.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeTypeController {
    @GetMapping("/employeetypes")
    public String getCountries() {
        return "employee-type";
    }
}
