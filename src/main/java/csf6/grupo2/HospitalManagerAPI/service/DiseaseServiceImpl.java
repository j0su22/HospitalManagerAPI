package csf6.grupo2.HospitalManagerAPI.service;

import csf6.grupo2.HospitalManagerAPI.model.Disease;
import csf6.grupo2.HospitalManagerAPI.repository.DiseaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiseaseServiceImpl implements DiseaseService {
    @Autowired
    private DiseaseRepository diseaseRepository;

    @Override
    public Disease saveDisease(Disease disease) {
        return diseaseRepository.save(disease);
    }

    @Override
    public List<Disease> getAllDiseases() {
        return diseaseRepository.findAll();
    }

    @Override
    public Optional<Disease> findDisease(Integer id) {
        return diseaseRepository.findById(id);
    }

    @Override
    public Disease updateDisease(Disease disease) {
        return diseaseRepository.save(disease);
    }

    @Override
    public Boolean deleteDisease(Integer id) {
        diseaseRepository.deleteById(id);
        return true;
    }

    @Override
    public Disease disableDisease(Disease disease) {
        return diseaseRepository.save(disease);
    }
}
