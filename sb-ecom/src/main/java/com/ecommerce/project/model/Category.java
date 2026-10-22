package com.ecommerce.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "categories") // Entidade que pode ser armazenada em um banco de dados relacional.
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id // Indica que o campo categoryId é a chave primária da entidade.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que o valor do campo categoryId será gerado
                                                        // automaticamente pelo banco de dados.
    private Long categoryId;

    @NotBlank // Indica que o campo categoryName não pode ser nulo ou vazio.
    private String categoryName;

}
