package com.joy.ex.controller;

import com.joy.ex.model.Board;
import com.joy.ex.service.BoardService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by heesun on 2017. 7. 1..
 */
@RestController
@RequestMapping(value = "/board")
public class BoardController {

    @Resource
    private BoardService boardService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity listBoard() {
        List<Map<String, Object>> list = boardService.listBoard();
        return ResponseEntity.ok(list);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.PUT)
    public void insertBoard(@RequestBody Map<String, Object> board) {
        boardService.insertBoard(board);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public void updateBoard(@RequestBody Board board) {
        boardService.update(board);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public void deleteBoard(@PathVariable int id) {
        boardService.deleteBoard(id);
    }
}
