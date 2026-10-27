package com.ecommerce.project.payload;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // This annotation generates getters, setters, toString, equals and hashCode
      // methods for the class
@NoArgsConstructor // This annotation generates a no-argument constructor for the class
@AllArgsConstructor // This annotation generates a constructor with all the fields of the class as
                    // parameters
public class CategoryDTO {

    private Long categoryId;
    @NotBlank
    @Size(min = 5, message = "Category name must contain at least 5 characters")
    private String categoryName;
}
