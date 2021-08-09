package com.example.springbootcrudapplication.repository;

import com.example.springbootcrudapplication.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
