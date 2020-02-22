package com.zenghui.service;

import com.zenghui.entity.Category;

import java.util.List;

public interface CategoryService {

    int addCategory(Category category);

    int deleteCategoryById(int id);

    int updateCategory(Category category);

    Category get(int id);

    List<Category> queryAll();

}

