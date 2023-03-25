package com.hanteocodingtest1.repository;

import com.hanteocodingtest1.board.Board;
import com.hanteocodingtest1.board.SongBoard;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongBoardRepository implements BoardRepository {
    private List<Board> boardList = new ArrayList<>();

    public SongBoardRepository() {
        boardList.add(new SongBoard(1L, 6L));
        boardList.add(new SongBoard(2L, 7L));
        boardList.add(new SongBoard(3L, 8L));
        boardList.add(new SongBoard(4L, 9L));
        boardList.add(new SongBoard(5L, 10L));
        boardList.add(new SongBoard(6L, 11L));
        boardList.add(new SongBoard(6L, 14L));
        boardList.add(new SongBoard(7L, 12L));
        boardList.add(new SongBoard(8L, 13L));
        boardList.add(new SongBoard(9L, 15L));
    }
}
