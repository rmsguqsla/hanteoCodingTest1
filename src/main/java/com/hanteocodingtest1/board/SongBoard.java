package com.hanteocodingtest1.board;

public class SongBoard implements Board{

    private Long id;
    private Long categoryId;

    public SongBoard(Long id, Long categoryId) {
        this.id = id;
        this.categoryId = categoryId;
    }
}
