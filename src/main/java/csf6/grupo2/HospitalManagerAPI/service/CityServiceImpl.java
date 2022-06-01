package csf6.grupo2.HospitalManagerAPI.service;

import csf6.grupo2.HospitalManagerAPI.model.City;
import csf6.grupo2.HospitalManagerAPI.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public City saveCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }
}
