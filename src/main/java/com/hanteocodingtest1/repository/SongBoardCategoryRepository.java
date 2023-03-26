package com.hanteocodingtest1.repository;

import com.hanteocodingtest1.category.Category;
import com.hanteocodingtest1.category.SongBoardCategory;
import com.hanteocodingtest1.model.Response;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongBoardCategoryRepository implements CategoryRepository {
    private List<Category> categoryList = new ArrayList<>();

    public SongBoardCategoryRepository() {
        categoryList.add(new SongBoardCategory(1L, "남자", null));
        categoryList.add(new SongBoardCategory(2L, "여자", null));
        categoryList.add(new SongBoardCategory(3L, "엑소", 1L));
        categoryList.add(new SongBoardCategory(4L, "방탄소년단", 1L));
        categoryList.add(new SongBoardCategory(5L, "블랙핑크", 2L));
        categoryList.add(new SongBoardCategory(6L, "공지사항", 3L));
        categoryList.add(new SongBoardCategory(7L, "첸", 3L));
        categoryList.add(new SongBoardCategory(8L, "백현", 3L));
        categoryList.add(new SongBoardCategory(9L, "시우민", 3L));
        categoryList.add(new SongBoardCategory(10L, "공지사항", 4L));
        categoryList.add(new SongBoardCategory(11L, "익명게시판", 4L));
        categoryList.add(new SongBoardCategory(12L, "뷔", 4L));
        categoryList.add(new SongBoardCategory(13L, "공지사항", 5L));
        categoryList.add(new SongBoardCategory(14L, "익명게시판", 5L));
        categoryList.add(new SongBoardCategory(15L, "로제", 5L));
    }

    @Override
    public Response findCategoryListById(Long id) {
        Response result = new Response();
        recursion(result, id);

        return result;
    }

    private void recursion(Response result, Long id) {
        if (id == null) {
            Response response = new Response(id);
            result.getResponseList().add(response);
            return;
        }
        Long currentId = id;
        for (int i = 0; i < categoryList.size(); i++) {
            SongBoardCategory category = (SongBoardCategory) categoryList.get(i);
            if (category.getParentId().equals(currentId)) {
                currentId = category.getId();
                recursion(result, currentId);
            }
        }
    }

    @Override
    public Category findCategoryById(Long id) {
        for (int i = 0; i < categoryList.size(); i++) {
            SongBoardCategory category = (SongBoardCategory) categoryList.get(i);
            if (category.getId().equals(id)) {
                return category;
            }
        }
        return null;
    }


}
