package com.github.mmalaquiasdev.chocolatestore.category.api.v1;

import com.github.mmalaquiasdev.chocolatestore.category.Category;
import com.github.mmalaquiasdev.chocolatestore.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/categories")
class CategoryRestService {

    @Autowired
    private CategoryService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Category> findAll(){
        return service.findAll();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public Category findByName(@PathVariable Integer id){
        return service.findById(id).orElse(new Category());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Category save(@Valid @RequestBody Category category){
        return service.save(category);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public Category update(@PathVariable Integer id, @RequestBody Category category){
        return service.save(category);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
