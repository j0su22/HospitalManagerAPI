package csf6.grupo2.HospitalManagerAPI.repository;

import csf6.grupo2.HospitalManagerAPI.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
}
