package com.example.board.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "fileName")
    private String fileName;

    @Column(name = "filePath")
    private String filePath;


    @Builder
    public Board(String title, String content, String fileName, String filePath){
        this.title = title;
        this.content = content;
        this.fileName = fileName;
        this.filePath = filePath;
    }


}
