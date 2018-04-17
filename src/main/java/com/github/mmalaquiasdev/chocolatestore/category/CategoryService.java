package com.github.mmalaquiasdev.chocolatestore.category;

import com.github.mmalaquiasdev.chocolatestore.exception.ResourceNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Optional<Category> findById(Integer id) {
        Optional<Category> optionalCategory = repository.findById(id);
        if(!optionalCategory.isPresent()) throw new ResourceNotFound("Category not found");
        return optionalCategory;
    }

    public Optional<Category> findByName(String name){
        return repository.findByName(name);
    }
    
    public Category save(Category category) {
        return repository.save(category);
    }

    public void delete(Integer id){
        Optional<Category> category = findById(id);
        if(category.isPresent()) repository.delete(category.get());
    }
    
}
