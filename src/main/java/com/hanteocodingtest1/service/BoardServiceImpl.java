package com.hanteocodingtest1.service;

import com.hanteocodingtest1.model.Response;
import com.hanteocodingtest1.repository.BoardRepository;
import com.hanteocodingtest1.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    private final BoardRepository boardRepository;
    private final CategoryRepository categoryRepository;

    @Override
    public Response getCategoryListById(Long id) {
        Response categories = categoryRepository.findCategoryListById(id);

        return null;
    }

    @Override
    public Response getCategoryListByCategoryName(String categoryName) {
        return null;
    }
}
