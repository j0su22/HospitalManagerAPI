package csf6.grupo2.HospitalManagerAPI.controller;

import csf6.grupo2.HospitalManagerAPI.model.Case;
import csf6.grupo2.HospitalManagerAPI.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/case")
@CrossOrigin
public class CaseController {
    @Autowired
    private CaseService caseService;

    @GetMapping("/getAll")
    public List<Case> List() { return caseService.findAllCase(); }

    @PostMapping("add")
    public String addCase(Case cases) {
        caseService.saveCase(cases);
        return "Case added";
    }

    @GetMapping("/find")
    public Optional<Case> findDisease(Integer id) {
        return caseService.findCase(id);
    }

    @PutMapping("/update")
    public String updateCase(@RequestBody Case cases) {
        caseService.updateCase(cases);
        return "Case  updated!";
    }
}
