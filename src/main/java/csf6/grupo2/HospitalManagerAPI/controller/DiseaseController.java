package csf6.grupo2.HospitalManagerAPI.controller;

import csf6.grupo2.HospitalManagerAPI.model.Disease;
import csf6.grupo2.HospitalManagerAPI.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/disease")
@CrossOrigin
public class DiseaseController {
    @Autowired
    private DiseaseService diseaseService;

    @PostMapping("/add")
    public String addDisease(@RequestBody Disease disease) {
        diseaseService.saveDisease(disease);
        return "Disease added!";
    }

    @GetMapping("/getAll")
    public List<Disease> listDisease() {
        return diseaseService.getAllDiseases();
    }

    @GetMapping("/find")
    public Optional<Disease> findDisease(Integer id) {
        return diseaseService.findDisease(id);
    }

    @PutMapping("/update")
    public String updateDiasease(@RequestBody Disease disease) {
        diseaseService.updateDisease(disease);
        return "Disease updated!";
    }

    @PostMapping("/disable")
    public String disableDisease(Integer id) {
        diseaseService.disableDisease(id);
        return "Disease disable!";
    }

    @PostMapping("/enable")
    public String enableDisease(Integer id) {
        diseaseService.enableDisease(id);
        return "Disease enable!";
    }
}
