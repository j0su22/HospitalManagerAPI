package csf6.grupo2.HospitalManagerAPI.service;

import csf6.grupo2.HospitalManagerAPI.model.Ailment;

import java.util.List;
import java.util.Optional;

public interface AilmentService {
    List<Ailment> getAllAilment();

    Ailment saveAilment(Ailment ailment);

    Optional<Ailment> findAilment(Integer id);

    Ailment updateAilment(Ailment ailment);

    boolean deleteAilment(Integer id);
}
