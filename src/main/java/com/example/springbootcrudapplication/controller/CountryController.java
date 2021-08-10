package com.example.springbootcrudapplication.controller;

import com.example.springbootcrudapplication.model.Country;
import com.example.springbootcrudapplication.service.CountryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    public final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/country")
    public ResponseEntity<List<Country>> getAllCountry(){
        return ResponseEntity.ok().body(this.countryService.getAllCountry());
    }

    @PostMapping("/country")
    public ResponseEntity<Country> createCountry(@RequestBody Country country){
        return ResponseEntity.ok().body(this.countryService.createCountry(country));
    }

    @PutMapping("/coutry/{id}")
    public ResponseEntity<Country> updateCountry(@PathVariable long id, @RequestBody Country country){
        country.setId(id);
        return ResponseEntity.ok().body(this.countryService.updateCountry(country));
    }

    @DeleteMapping("/country/{id}")
    public HttpStatus deleteCoutry(@PathVariable long id){
        this.countryService.deleteCountry(id);
        return HttpStatus.OK;

    }


}
