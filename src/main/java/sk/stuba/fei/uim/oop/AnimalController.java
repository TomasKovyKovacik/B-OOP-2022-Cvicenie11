package sk.stuba.fei.uim.oop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/animal")
public class AnimalController {
    @Autowired
    private AnimalService service;

    @GetMapping()
    public List<AnimalResponse> getAllAnimals() {
        return this.service.getAll().stream().map(AnimalResponse::new).collect(Collectors.toList());
    }

    @PostMapping()
    public ResponseEntity<AnimalResponse> addAnimal(@RequestBody AnimalRequest request) {
        return new ResponseEntity<>(new AnimalResponse(this.service.create(request)), HttpStatus.CREATED);
    }

    @GetMapping("/{name}")
    public List<AnimalResponse> getAllAnimalsByName(@PathVariable("name") String name) {
        return this.service.getAllByName(name).stream().map(AnimalResponse::new).collect(Collectors.toList());
    }
}
