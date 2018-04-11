package com.github.mmalaquiasdev.chocolatestore.category.api.v1;

import com.github.mmalaquiasdev.chocolatestore.category.Category;
import com.github.mmalaquiasdev.chocolatestore.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

@RestController
@RequestMapping("/v1/categories")
class CategoryRestService {

    @Autowired
    private CategoryService service;

    @PostConstruct
    private void initDataBase() {
        service.initDatabase();
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Category> findAll(){
        return service.findAll();
    }

    @GetMapping("{name}")
    @ResponseStatus(HttpStatus.OK)
    public Category findByName(@PathVariable String name){
        return service.findByName(name)
                .orElse(Category.builder().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Category save(@Valid @RequestBody Category category){
        return service.save(category);
    }

    @PutMapping("{name}")
    @ResponseStatus(HttpStatus.OK)
    public Category update(@PathVariable String name, @RequestBody Category category){
        return service.save(category);
    }

    @DeleteMapping("{name}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String name){
        service.delete(name);
    }
}
