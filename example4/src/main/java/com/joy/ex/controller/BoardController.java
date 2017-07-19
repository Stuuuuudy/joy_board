package com.joy.ex.controller;

import com.joy.ex.model.Board;
import com.joy.ex.service.BoardService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private BoardService boardService;

    @GetMapping(value = "/list")
    public ResponseEntity listBoard() {
        List<Map<String, Object>> list = boardService.listBoard();
        return ResponseEntity.ok(list);
    }

    @PostMapping(value = "/insert")
    public void insertBoard(@RequestBody Board board) {
        boardService.insertBoard(board);
    }

    @PutMapping(value = "/update")
    public void updateBoard(@RequestBody Board board) {
        boardService.update(board);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteBoard(@PathVariable int id) {
        boardService.deleteBoard(id);
    }
}
