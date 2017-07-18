package com.joy.ex.service;

import com.joy.ex.model.Board;

import java.util.List;
import java.util.Map;

/**
 * Created by heesun on 2017. 7. 10..
 */
public interface BoardService {

    public List<Map<String, Object>> listBoard();

    public void insertBoard(Map<String, Object> board);

    void deleteBoard(int id);

    void update(Board board);
}
