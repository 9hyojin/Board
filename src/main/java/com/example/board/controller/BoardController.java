package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BoardController {

    @ResponseBody
    @GetMapping("/board")
    public String board(){
        return "hello";
    }
}


