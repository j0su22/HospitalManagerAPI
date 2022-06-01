package csf6.grupo2.HospitalManagerAPI.service;

import csf6.grupo2.HospitalManagerAPI.model.Case;
import csf6.grupo2.HospitalManagerAPI.repository.CaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CaseServiceImpl implements CaseService{
    @Autowired
    private CaseRepository caseRepository;

    @Override
    public List<Case> findAllCase() {
        return caseRepository.findAll();
    }

    @Override
    public Case saveCase(Case cases) {
        return caseRepository.save(cases);
    }

    @Override
    public Optional<Case> findCase(Integer id) {
        return caseRepository.findById(id);
    }
}
