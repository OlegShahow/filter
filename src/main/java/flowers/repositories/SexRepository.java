package flowers.repositories;

import flowers.entities.Sex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SexRepository extends JpaRepository<Sex, Long> {
}
