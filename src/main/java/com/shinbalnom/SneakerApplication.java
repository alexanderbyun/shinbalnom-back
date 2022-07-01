package com.shinbalnom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class SneakerApplication {

    @Autowired
    private SneakerRepository sneakerRepository;

    public static void main(String[] args) {
        SpringApplication.run(SneakerApplication.class, args);
    }

    // Get sneaker
    @GetMapping("/releases")
    public Iterable<Sneaker> index() {
        return sneakerRepository.findAll();
    }

    // Add sneaker
    @PostMapping("/releases")
    public Iterable<Sneaker> create (@RequestBody Sneaker sneakerData) {
        sneakerRepository.save(sneakerData);
        return sneakerRepository.findAll();
    }

    // Delete sneaker
    @DeleteMapping("/releases/{id}")
    public Iterable<Sneaker> delete(@PathVariable int id) {
        sneakerRepository.deleteById(id);
        return sneakerRepository.findAll();
    }

    // Update sneaker
    @PutMapping("/releases/{id}")
    public Iterable<Sneaker> update(@PathVariable int id, @RequestBody Sneaker sneakerData) {
        sneakerData.setId(id);
        sneakerRepository.save(sneakerData);
        return sneakerRepository.findAll();
    }
}
