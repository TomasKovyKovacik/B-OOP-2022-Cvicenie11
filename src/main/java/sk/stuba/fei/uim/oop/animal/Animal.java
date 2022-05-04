package sk.stuba.fei.uim.oop.animal;

import lombok.Data;
import sk.stuba.fei.uim.oop.person.Person;

import javax.persistence.*;

@Data
@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String species;

    private String name;

    @OneToOne
    private Person person;
}
