package com.leoskart.ecom_app.service;

import com.leoskart.ecom_app.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getCategories();
    String createCategory(Category category);

    String deleteCategory(Long categoryId);

    String updateCategory(Long categoryId, Category category);
}
