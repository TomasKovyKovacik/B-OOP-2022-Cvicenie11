package sk.stuba.fei.uim.oop.person;

import lombok.Getter;

@Getter
public class PersonResponse {
    private Long id;
    private String name;
    public PersonResponse(Person person) {
        this.id = person.getId();
        this.name = person.getName();
    }
}
