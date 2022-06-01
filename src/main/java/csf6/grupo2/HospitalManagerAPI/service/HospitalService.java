package csf6.grupo2.HospitalManagerAPI.service;

import csf6.grupo2.HospitalManagerAPI.model.Hospital;

import java.util.List;
import java.util.Optional;

public interface HospitalService {
    Hospital saveHospital(Hospital hospital);

    List<Hospital> getAllHospitals();

    Optional<Hospital> findHospital(Integer id);

    Hospital updateHospital(Hospital hospital);

    Boolean deleteHospital(Integer id);
}
