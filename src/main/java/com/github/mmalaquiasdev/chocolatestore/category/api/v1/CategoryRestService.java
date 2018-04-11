package com.github.mmalaquiasdev.chocolatestore.category.api.v1;

import com.github.mmalaquiasdev.chocolatestore.category.domain.Category;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/v1/categories")
public class CategoryRestService {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Category> findAll(){
        Category info = Category.builder().id(1).name("info").build();
        Category room = Category.builder().id(2).name("room").build();
        return Arrays.asList(info, room);
    }
}
