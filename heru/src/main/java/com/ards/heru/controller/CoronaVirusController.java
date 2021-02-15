package com.ards.heru.controller;

import com.ards.heru.entity.CoronaVirus;
import com.ards.heru.service.CoronaVirusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/corona_virus")
public class CoronaVirusController {

    @Autowired
    CoronaVirusService service;

    @PostMapping("")
    public CoronaVirus saveData(@RequestBody CoronaVirus data) {
        return service.save(data);
    }

    @GetMapping("/get_all_confirmed")
    public List<CoronaVirus> getAllData(){
        return service.getAllConfirmed();
    }

    @GetMapping("/get_all_confirmed_by_date_ascending")
    public List<CoronaVirus> getAllDataByDateAscending() {
        return service.getAllConfirmedByDateAscending();
    }

    @GetMapping("/get_all_confirmed_by_date_descending")
    public List<CoronaVirus> getAllDataByDateDescending() {
        return service.getAllConfirmedByDateDescending();
    }

    @GetMapping("/get_all_by_province_order_by_city_ascending")
    public List<CoronaVirus> getAllByProvinceOrderByCityAscending(@RequestParam String prov) {
        return service.getAllByProvinceOrderByCityAscending(prov);
    }

    @GetMapping("/get_all_by_province_order_by_city_descending")
    public List<CoronaVirus> getAllByProvinceOrderByCityDescending(@RequestParam String prov) {
        return service.getAllByProvinceOrderByCityDescending(prov);
    }

}
