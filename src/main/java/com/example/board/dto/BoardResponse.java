package com.example.board.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BoardResponse {
    private final String title;
    private final String content;
    private final String fileName;
    private final String filePath;


}
