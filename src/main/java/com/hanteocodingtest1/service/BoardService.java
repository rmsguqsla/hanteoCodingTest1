package com.hanteocodingtest1.service;

import com.hanteocodingtest1.board.Board;
import com.hanteocodingtest1.model.Response;

import java.util.ArrayList;

public interface BoardService {
    Response getCategoryListById(Long id);

    Response getCategoryListByCategoryName(String categoryName);
}
