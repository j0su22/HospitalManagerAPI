package csf6.grupo2.HospitalManagerAPI.service;

import csf6.grupo2.HospitalManagerAPI.model.Hospital;
import csf6.grupo2.HospitalManagerAPI.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalServiceImpl implements HospitalService {
    @Autowired
    private HospitalRepository hospitalRepository;

    @Override
    public Hospital saveHospital(Hospital hospital) {
        return hospitalRepository.save(hospital);
    }

    @Override
    public List<Hospital> getAllHospitals() {
        return hospitalRepository.findAll();
    }

    @Override
    public Optional<Hospital> findHospital(Integer id) {
        return hospitalRepository.findById(id);
    }
}
