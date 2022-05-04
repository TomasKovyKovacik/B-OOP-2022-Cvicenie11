package sk.stuba.fei.uim.oop.animal;

import lombok.Getter;
import sk.stuba.fei.uim.oop.person.Person;
import sk.stuba.fei.uim.oop.person.PersonResponse;

@Getter
public class AnimalResponse {
    private Long id;

    private String species;

    private String name;

    private PersonResponse person;

    AnimalResponse(Animal a) {
        this.id = a.getId();
        this.species = a.getSpecies();
        this.name = a.getName();
        this.person = a.getPerson() == null ? null : new PersonResponse(a.getPerson());
    }
}
