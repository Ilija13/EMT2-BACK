package mk.ukim.finki.emt.emtlab2.service;

import mk.ukim.finki.emt.emtlab2.model.Country;

import java.util.List;

public interface CountryService {
    List<Country> findAll();
    Country create(String name, String continent);
}
