package csf6.grupo2.HospitalManagerAPI.repository;

import csf6.grupo2.HospitalManagerAPI.model.Case;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseRepository extends JpaRepository <Case, Integer> {
}
