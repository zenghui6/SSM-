package com.zenghui.controller;

import com.zenghui.entity.Category;
import com.zenghui.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @RequestMapping("/allCategory")
    public String list(Model model){
        List<Category> list  = categoryService.queryAll();
        model.addAttribute("list",list);
        return "allCategory" ;
    }

    @RequestMapping("/toAddCategory")
    public String toAddCategory(){
        return "addCategory";
    }

    @RequestMapping("/addCategory")
    public String addCategory(Category category){
        categoryService.addCategory(category);
        System.out.println("add:"+category);
        return "redirect:/category/allCategory";
    }

    @RequestMapping("/toUpdateCategory")
    public String toUpdateCategory(Model model,int id){
        Category category = categoryService.get(id);
        System.out.println(category);
        model.addAttribute("category",category);
        return "updateBook";
    }

    @RequestMapping("/updateCategory")
    public String updateCategory(Model model,Category category){
        System.out.println(category);
        categoryService.updateCategory(category);

        return "redirect:/category/allCategory";
    }

    @RequestMapping("/del/{cid}")
    public String delCategory(@PathVariable("cid") int cid){
        int delId = categoryService.deleteCategoryById(cid);
        System.out.println("del: "+delId);
        return "redirect:/category/allCategory";
    }
}
