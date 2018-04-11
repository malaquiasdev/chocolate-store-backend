package com.github.mmalaquiasdev.chocolatestore.category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface CategoryRepository extends JpaRepository<Category, Integer> {
   Optional<Category> findByName(String name);
}
