package com.example.springbootcrudapplication.service;

import com.example.springbootcrudapplication.model.Country;

import java.util.List;

public interface CountryService {
    Country createCountry(Country country);

    Country updateCountry(Country country);

    List<Country> getAllCountry();

    void deleteCountry(long id);
}
