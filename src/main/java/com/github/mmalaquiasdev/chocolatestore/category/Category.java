package com.github.mmalaquiasdev.chocolatestore.category;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Category implements Serializable {

    @Id @GeneratedValue
    private Integer id;
    @NotBlank
    @Column(unique = true)
    private String name;
}
