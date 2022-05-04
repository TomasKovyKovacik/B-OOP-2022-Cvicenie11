package sk.stuba.fei.uim.oop.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService implements IPersonService{

    private IPersonRepository repository;

    @Autowired
    public PersonService(IPersonRepository repository) {
        this.repository = repository;

        this.repository.save(new Person("Jakub"));
        this.repository.save(new Person("Tomas"));
        this.repository.save(new Person("Martin"));
    }
}
