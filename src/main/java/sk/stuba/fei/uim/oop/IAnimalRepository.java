package sk.stuba.fei.uim.oop;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAnimalRepository extends JpaRepository<Animal, Long> {

}
