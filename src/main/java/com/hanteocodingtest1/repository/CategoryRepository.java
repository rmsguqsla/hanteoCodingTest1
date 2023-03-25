package com.hanteocodingtest1.repository;

import com.hanteocodingtest1.category.Category;
import com.hanteocodingtest1.model.Response;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository {
    Response findCategoryListById(Long id);

    Category findCategoryById(Long id);
}
