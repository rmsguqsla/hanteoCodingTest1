package com.hanteocodingtest1.category;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SongBoardCategory implements Category {

    private Long id;
    private String categoryName;
    private Long parentId;
}
