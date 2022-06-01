package csf6.grupo2.HospitalManagerAPI.controller;

import csf6.grupo2.HospitalManagerAPI.model.Ailment;
import csf6.grupo2.HospitalManagerAPI.service.AilmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ailment")
@CrossOrigin
public class AilmentController {
    @Autowired
    private AilmentService ailmentService;

    @GetMapping("/getAll")
    public List<Ailment> List() { return ailmentService.getAllAilment(); }

    @PostMapping("/add")
    public String addAilment(@RequestBody Ailment ailment) {
        ailmentService.saveAilment(ailment);
        return "Ailment added";
    }

    @GetMapping("/find")
    public Optional<Ailment> findAilment(Integer id) {
        return ailmentService.findAilment(id);
    }

    @PutMapping("/update")
    public String updateAilment(@RequestBody Ailment ailment) {
        ailmentService.updateAilment(ailment);
        return "Ailment updated!";
    }
}
