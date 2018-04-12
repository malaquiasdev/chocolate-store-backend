package com.github.mmalaquiasdev.chocolatestore.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
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
        return repository.findById(id);
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

    public void initDatabase() {
        Category cacao = Category.builder().name("Cacao").build();
        Category chocolateLiquor = Category.builder().name("Chocolate Liquor").build();
        Category unsweetenedChocolate = Category.builder().name("Unsweetened Chocolate").build();
        Category bittersweetChocolate = Category.builder().name("Bittersweet Chocolate").build();
        Category sweetChocolate = Category.builder().name("Sweet Chocolate").build();
        Category milkChocolate = Category.builder().name("Milk Chocolate").build();
        Category whiteChocolate = Category.builder().name("White Chocolate").build();
        Category cocoa = Category.builder().name("Cocoa").build();
        Category groundChocolate = Category.builder().name("Ground Chocolate").build();
        Category bakingChocolate = Category.builder().name("Baking Chocolate").build();
        Category chocolateCoating = Category.builder().name("Chocolate Coating").build();
        Category couverture = Category.builder().name("Couverture").build();
        Category gianduja = Category.builder().name("Gianduja").build();
        Category singleBeanChocolate = Category.builder().name("Single Bean Chocolate").build();
        Category cocoaButter = Category.builder().name("Cocoa Butter").build();
        Category chocolates = Category.builder().name("Chocolates").build();
        Category chocolateExtract = Category.builder().name("Chocolate Extract").build();
        Category chocolateOil = Category.builder().name("Chocolate Oil").build();

        repository.saveAll(Arrays.asList(cacao, chocolateLiquor, unsweetenedChocolate, bittersweetChocolate,
                sweetChocolate, milkChocolate, whiteChocolate, cocoa, groundChocolate, bakingChocolate,
                chocolateCoating, couverture, gianduja, singleBeanChocolate, cocoaButter, chocolates,
                chocolateExtract, chocolateOil));
    }
}
