package sk.stuba.fei.uim.oop.animal;

import lombok.Data;
import sk.stuba.fei.uim.oop.person.Person;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String species;

    private String name;

    @OneToMany
    private List<Person> person;

    public Animal() {
        this.person = new ArrayList<>();
    }
}
