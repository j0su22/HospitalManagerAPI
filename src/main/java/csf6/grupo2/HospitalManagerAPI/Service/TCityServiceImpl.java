package csf6.grupo2.HospitalManagerAPI.Service;

import csf6.grupo2.HospitalManagerAPI.model.TCity;
import csf6.grupo2.HospitalManagerAPI.repository.TCityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TCityServiceImpl implements TCityService {

    @Autowired
    private TCityRepository tCityRepository;

    @Override
    public TCity saveCity(TCity city) {
        return tCityRepository.save(city);
    }
}
