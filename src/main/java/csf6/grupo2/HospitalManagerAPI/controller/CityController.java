package csf6.grupo2.HospitalManagerAPI.controller;

import csf6.grupo2.HospitalManagerAPI.service.CityService;
import csf6.grupo2.HospitalManagerAPI.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/city")
@CrossOrigin
public class CityController {
    @Autowired
    private CityService cityService;

    @PostMapping("/add")
    public String addCity(@RequestBody City city) {
        cityService.saveCity(city);
        return "City added";
    }

    @GetMapping("/getAll")
    public List<City> listCities() {
        return cityService.getAllCities();
    }

    @GetMapping("/find")
    public Optional<City> findCity(Integer id) {
        return cityService.findCities(id);
    }
}
