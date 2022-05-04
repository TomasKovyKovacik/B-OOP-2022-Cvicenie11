package sk.stuba.fei.uim.oop;

import lombok.Getter;

@Getter
public class AnimalResponse {
    private Long id;

    private String species;

    AnimalResponse(Animal a) {
        this.id = a.getId();
        this.species = a.getSpecies();
    }
}
