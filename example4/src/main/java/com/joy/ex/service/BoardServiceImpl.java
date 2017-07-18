package com.joy.ex.service;

import com.joy.ex.dao.CrudDAO;
import com.joy.ex.model.Board;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by heesun on 2017. 7. 10..
 */
@Service
public class BoardServiceImpl implements BoardService {

    @Resource
    private CrudDAO crudDao;

    @Override
    public List<Map<String, Object>> listBoard() {
        return crudDao.selectBoardList();
    }

    @Override
    public void insertBoard(Map<String, Object> board) {
        crudDao.insertBoard(board);
    }

    @Override
    public void deleteBoard(int id) {
        crudDao.deleteBoard(id);
    }

    @Override
    public void update(Board board) {
        crudDao.updateBoard(board);
    }
}
