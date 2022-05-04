package sk.stuba.fei.uim.oop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService implements IAnimalService {
    @Autowired
    private IAnimalRepository repository;
}
