package sk.stuba.fei.uim.oop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService implements IAnimalService {
    @Autowired
    private IAnimalRepository repository;

    @Override
    public List<Animal> getAll() {
        return this.repository.findAll();
    }
}
