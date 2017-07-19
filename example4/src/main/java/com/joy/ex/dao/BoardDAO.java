package com.joy.ex.dao;

import com.joy.ex.model.Board;

import java.util.List;
import java.util.Map;

/**
 * Created by heesun on 2017. 7. 19..
 */
public interface BoardDAO {
    public List<Map<String, Object>> selectBoardList();

    public void insertBoard(Board board);

    public void deleteBoard(int id);

    public void updateBoard(Board board);
}
