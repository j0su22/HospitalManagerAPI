package csf6.grupo2.HospitalManagerAPI.service;

import csf6.grupo2.HospitalManagerAPI.model.Disease;

import java.util.List;

public interface DiseaseService {
    List<Disease> getAllDiseases();

    Disease saveDisease(Disease disease);
}
