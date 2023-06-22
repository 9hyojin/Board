package com.example.board.dto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class BoardResponseTest {

    @DisplayName("lombok 테스트")
    @Test
    public void lombok(){
        //given
        String title = "title";
        String content = "content";
        String fileName = "fileName";
        String filePath = "filePath";

        //when
        BoardResponse boardResponse = new BoardResponse(title,content,fileName,filePath);

        //then
        assertThat(boardResponse.getTitle()).isEqualTo(title);
        assertThat(boardResponse.getContent()).isEqualTo(content);
        assertThat(boardResponse.getFileName()).isEqualTo(fileName);
        assertThat(boardResponse.getFilePath()).isEqualTo(filePath);
    }
}