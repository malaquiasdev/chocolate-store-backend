package com.github.mmalaquiasdev.chocolatestore.category;

import com.github.mmalaquiasdev.chocolatestore.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Integer id) {
        return repository
                .findById(id)
                .orElseThrow(ResourceNotFoundException::new);
    }

    public Category save(Category category) {
        return repository.save(category);
    }

    public void delete(Integer id){
        Category category = findById(id);
        repository.delete(category);
    }
}
