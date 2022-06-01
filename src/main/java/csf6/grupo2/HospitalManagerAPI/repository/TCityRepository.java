package csf6.grupo2.HospitalManagerAPI.repository;

import csf6.grupo2.HospitalManagerAPI.model.TCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TCityRepository extends JpaRepository<TCity, Integer> {

}
