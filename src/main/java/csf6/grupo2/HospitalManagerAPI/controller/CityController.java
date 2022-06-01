package csf6.grupo2.HospitalManagerAPI.controller;

import csf6.grupo2.HospitalManagerAPI.service.CityService;
import csf6.grupo2.HospitalManagerAPI.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
@CrossOrigin
public class CityController {
    @Autowired
    private CityService cityService;

    @PostMapping("/add")
    public String add(@RequestBody City tcity) {
        cityService.saveCity(tcity);
        return "New city is added";
    }

    @GetMapping("/getAll")
    public List<City> list() {
        return cityService.getAllCities();
    }

}
