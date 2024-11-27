package flowers.repositories;

import flowers.entities.NameOfFlower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameOfFlowerRepository extends JpaRepository<NameOfFlower, Long> {
}
