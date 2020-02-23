package com.zenghui.service.impl;

import com.zenghui.entity.Category;
import com.zenghui.mapper.CategoryMapper;
import com.zenghui.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zeng
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;


    @Override
    public int addCategory(Category category) {
        return categoryMapper.insert(category);
    }

    @Override
    public int deleteCategoryById(int id) {
        return categoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateCategory(Category category) {
        return categoryMapper.updateByPrimaryKeySelective(category);
    }

    @Override
    public Category get(int id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Category> queryAll() {
        return categoryMapper.queryAllCategory();
    }

}
