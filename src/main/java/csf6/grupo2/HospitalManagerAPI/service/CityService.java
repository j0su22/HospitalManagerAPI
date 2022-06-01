package csf6.grupo2.HospitalManagerAPI.service;

import csf6.grupo2.HospitalManagerAPI.model.City;

import java.util.List;

public interface CityService {
    City saveCity(City city);

    List<City> getAllCities();
}
