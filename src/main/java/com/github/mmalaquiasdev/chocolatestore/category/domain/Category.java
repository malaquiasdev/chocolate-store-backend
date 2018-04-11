package com.github.mmalaquiasdev.chocolatestore.category.domain;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Builder
@Entity
public class Category implements Serializable {

    @Id @GeneratedValue
    private Integer id;
    private String name;
}
