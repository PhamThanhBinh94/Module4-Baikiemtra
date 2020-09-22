package com.codegym.format;

import com.codegym.model.Category;
import com.codegym.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.text.Format;
import java.text.ParseException;
import java.util.Locale;

public class CategoryFormater implements Formatter<Category> {
    private CategoryService categoryService;

    @Autowired
    public CategoryFormater(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @Override
    public Category parse(String text, Locale locale) throws ParseException {
        return categoryService.findById(Long.parseLong(text));
    }

    @Override
    public String print(Category object, Locale locale) {
        return "[" + object.getId() + "," + object.getName() + "]";
    }
}
