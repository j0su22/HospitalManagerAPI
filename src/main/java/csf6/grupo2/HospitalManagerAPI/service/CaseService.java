package csf6.grupo2.HospitalManagerAPI.service;

import csf6.grupo2.HospitalManagerAPI.model.Case;

import java.util.List;
import java.util.Optional;

public interface CaseService {
    List<Case> findAllCase();

    Case saveCase(Case cases);

    Optional<Case> findCase(Integer id);

    Case updateCase(Case cases);

    boolean deleteCase(Integer id);
}
