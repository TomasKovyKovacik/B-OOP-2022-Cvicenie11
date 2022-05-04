package sk.stuba.fei.uim.oop;

public class AnimalResponse {
    private Long id;

    private String species;

    AnimalResponse(Animal a) {
        this.id = a.getId();
        this.species = a.getSpecies();
    }
}
