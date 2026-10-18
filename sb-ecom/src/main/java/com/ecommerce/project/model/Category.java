package com.ecommerce.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "categories") // Entidade que pode ser armazenada em um banco de dados relacional.
public class Category {

    @Id // Indica que o campo categoryId é a chave primária da entidade.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que o valor do campo categoryId será gerado
                                                        // automaticamente pelo banco de dados.
    private Long categoryId;
    private String categoryName;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
