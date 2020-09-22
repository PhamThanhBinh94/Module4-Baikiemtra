package com.codegym.service;

import com.codegym.model.Category;
import com.codegym.model.User;
import org.springframework.ui.Model;

import javax.jws.soap.SOAPBinding;

public interface CategoryService {
    Iterable<Category> findAll();

    Category findById(Long id);

    void save(Category category);

    void remove(Long id);
}
