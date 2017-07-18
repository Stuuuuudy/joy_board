package com.joy.ex.dao;

import com.joy.ex.model.Board;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by heesun on 2017. 7. 14..
 */
@Repository
public class CrudDAO extends AbstractDAO {
    private Board board;

    @SuppressWarnings("unchecked")
    public List<Map<String, Object>> selectBoardList() {

        return (List<Map<String, Object>>) selectList("crud.selectBoardList", board);
    }

    public void insertBoard(Map<String, Object> board) {
        insert("crud.insertBoard", board);
    }

    public void deleteBoard(int id) {
        delete("crud.deleteBoard", id);
    }

    public void updateBoard(Board board) {
        update("crud.updateBoard", board);
    }
}
