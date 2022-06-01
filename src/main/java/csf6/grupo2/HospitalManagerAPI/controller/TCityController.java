package csf6.grupo2.HospitalManagerAPI.controller;

import csf6.grupo2.HospitalManagerAPI.Service.TCityService;
import csf6.grupo2.HospitalManagerAPI.model.TCity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tcity")
@CrossOrigin("http://localhost:4200")
public class TCityController {
    @Autowired
    private TCityService tCityService;

    @PostMapping("/add")
    public String add(@RequestBody TCity tcity) {
        tCityService.saveCity(tcity);
        return "New city is added";
    }

}
