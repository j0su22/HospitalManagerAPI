package csf6.grupo2.HospitalManagerAPI.controller;

import csf6.grupo2.HospitalManagerAPI.model.Disease;
import csf6.grupo2.HospitalManagerAPI.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disease")
@CrossOrigin
public class DiseaseController {
    @Autowired
    private DiseaseService diseaseService;

    @GetMapping("/getAll")
    public List<Disease> List() {
        return diseaseService.getAllDiseases();
    }

    @PostMapping("/add")
    public String add(@RequestBody Disease disease) {
        diseaseService.saveDisease(disease);
        return "New disease added!";
    }
}
