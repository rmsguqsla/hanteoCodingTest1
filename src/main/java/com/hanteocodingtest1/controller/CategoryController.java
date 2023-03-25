package com.hanteocodingtest1.controller;

import com.hanteocodingtest1.model.Response;
import com.hanteocodingtest1.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
public class CategoryController {

    private final BoardService boardService;

    @GetMapping("/category/{id}")
    public ResponseEntity<Response> getCategoryListById(@PathVariable Long id) {
        return ResponseEntity.ok(boardService.getCategoryListById(id));
    }

    @GetMapping("/category/{categoryName}")
    public ResponseEntity<Response> getCategoryListById(@PathVariable String categoryName) {
        return ResponseEntity.ok(boardService.getCategoryListByCategoryName(categoryName));
    }
}
