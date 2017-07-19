package com.joy.ex.service;

import com.joy.ex.dao.BoardDAO;
import com.joy.ex.model.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by heesun on 2017. 7. 10..
 */
@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardDAO mysqlDAO;

    @Override
    public List<Map<String, Object>> listBoard() {
        return mysqlDAO.selectBoardList();
    }

    @Override
    public void insertBoard(Board board) {
        mysqlDAO.insertBoard(board);
    }

    @Override
    public void deleteBoard(int id) {
        mysqlDAO.deleteBoard(id);
    }

    @Override
    public void update(Board board) {
        mysqlDAO.updateBoard(board);
    }
}
