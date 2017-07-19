package com.joy.ex.dao;

import com.joy.ex.model.Board;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by heesun on 2017. 7. 19..
 */
@Repository
public class MysqlDAO extends AbstractBoardDAO {
    private Board board;

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    @SuppressWarnings("unchecked")
    public List<Map<String, Object>> selectBoardList() {
        printQueryId("crud.selectBoardList");
        return sqlSession.selectList("crud.selectBoardList", board);
    }

    @Override
    public void insertBoard(Board board) {
        printQueryId("crud.insertBoard");
        sqlSession.insert("crud.insertBoard", board);

    }

    @Override
    public void deleteBoard(int id) {
        printQueryId("crud.deleteBoard");
        sqlSession.delete("crud.deleteBoard", id);
    }

    @Override
    public void updateBoard(Board board) {
        printQueryId("crud.updateBoard");
        sqlSession.update("crud.updateBoard", board);

    }
}
