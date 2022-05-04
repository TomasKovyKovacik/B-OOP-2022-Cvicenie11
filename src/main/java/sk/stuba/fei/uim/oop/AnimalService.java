package sk.stuba.fei.uim.oop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService implements IAnimalService {

    private IAnimalRepository repository;

    @Autowired
    public AnimalService(IAnimalRepository repository) {
        this.repository = repository;
        Animal a1 = new Animal();
        a1.setSpecies("Pes");
        Animal a2 = new Animal();
        a2.setSpecies("Macka");
        this.repository.save(a1);
        System.out.println(a2.getId());
        a2 = this.repository.save(a2);
        System.out.println(a2);
    }

    @Override
    public List<Animal> getAll() {
        return this.repository.findAll();
    }
}
