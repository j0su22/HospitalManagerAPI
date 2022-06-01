package csf6.grupo2.HospitalManagerAPI.service;

import csf6.grupo2.HospitalManagerAPI.model.Ailment;
import csf6.grupo2.HospitalManagerAPI.repository.AilmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AilmentServiceImpl implements AilmentService {
    @Autowired
    private AilmentRepository ailmentRepository;

    @Override
    public List<Ailment> getAllAilment() {
        return ailmentRepository.findAll();
    }

    @Override
    public Ailment saveAilment(Ailment ailment) {
        return ailmentRepository.save(ailment);
    }

    @Override
    public Optional<Ailment> findAilment(Integer id) {
        return ailmentRepository.findById(id);
    }

    @Override
    public Ailment updateAilment(Ailment ailment) {
        return ailmentRepository.save(ailment);
    }

    @Override
    public boolean deleteAilment(Integer id) {
        ailmentRepository.deleteById(id);
        return true;
    }
}
