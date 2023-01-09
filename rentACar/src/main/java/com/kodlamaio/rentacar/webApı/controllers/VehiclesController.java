package com.kodlamaio.rentacar.webApı.controllers;

import com.kodlamaio.rentacar.business.abstracts.VehicleService;
import com.kodlamaio.rentacar.business.requests.CreateVehicleRequest;
import com.kodlamaio.rentacar.business.responses.GetAllVehiclesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //annotation
@RequestMapping("/api/brands")
public class BrandsController {
    private VehicleService vehicleService;

    @Autowired
    public BrandsController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("/getall")
    public List<GetAllVehiclesResponse> getAll(){
        return vehicleService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateVehicleRequest createVehicleRequest){
    this.vehicleService.add(createVehicleRequest);
    }
}
