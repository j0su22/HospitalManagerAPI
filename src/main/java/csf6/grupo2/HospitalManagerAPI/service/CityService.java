package csf6.grupo2.HospitalManagerAPI.service;

import csf6.grupo2.HospitalManagerAPI.model.City;

import java.util.List;
import java.util.Optional;

public interface CityService {
    City saveCity(City city);

    List<City> getAllCities();

    Optional<City> findCities(Integer id);
}
