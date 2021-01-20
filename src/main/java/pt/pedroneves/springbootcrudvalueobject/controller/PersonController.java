package pt.pedroneves.springbootcrudvalueobject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pt.pedroneves.springbootcrudvalueobject.model.Person;
import pt.pedroneves.springbootcrudvalueobject.services.PersonServices;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServices services;

    @GetMapping
    public List<Person> findAll() {
        return services.findAll();
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable("id") Long id) {
        return services.findById(id);
    }

    @PostMapping
    public Person create(@RequestBody Person person) {
        return services.create(person);
    }

    @PutMapping
    public Person update(@RequestBody Person person) {
        return services.update(person);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        services.delete(id);
    }
}
