package csf6.grupo2.HospitalManagerAPI.service;

import csf6.grupo2.HospitalManagerAPI.model.Disease;

import java.util.List;
import java.util.Optional;

public interface DiseaseService {
    Disease saveDisease(Disease disease);

    List<Disease> getAllDiseases();

    Optional<Disease> findDisease(Integer id);
}
