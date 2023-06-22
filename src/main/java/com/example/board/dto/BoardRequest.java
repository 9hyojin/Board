package com.example.board.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardRequest {

    private Long id;
    private String title;

    private String content;

    private String fileName;

    private String filePath;





}
