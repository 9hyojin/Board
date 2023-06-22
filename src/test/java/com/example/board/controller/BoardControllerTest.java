package com.example.board.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
class BoardControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @DisplayName("hello리턴")
    @Test
    public void hello() throws Exception{
        String hello = "hello";

        mockMvc.perform(
                        MockMvcRequestBuilders.get("/board"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));

    }

}