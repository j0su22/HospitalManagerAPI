package csf6.grupo2.HospitalManagerAPI.controller;

import csf6.grupo2.HospitalManagerAPI.model.Hospital;
import csf6.grupo2.HospitalManagerAPI.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hospital")
@CrossOrigin
public class HospitalController {
    @Autowired
    private HospitalService hospitalService;

    @PostMapping("/add")
    public String addHospital(@RequestBody Hospital hospital) {
        hospitalService.saveHospital(hospital);
        return "Hospital added!";
    }

    @GetMapping("/getAll")
    public List<Hospital> listHospitals() {
        return hospitalService.getAllHospitals();
    }

    @GetMapping("/find")
    public Optional<Hospital> findHospital(Integer id) {
        return hospitalService.findHospital(id);
    }

    @PutMapping("/update")
    public String updateHospital(@RequestBody Hospital hospital) {
        hospitalService.saveHospital(hospital);
        return "Hospital updated!";
    }
}
