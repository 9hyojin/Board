package com.example.board.service;

import com.example.board.entity.Board;
import com.example.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public void write(Board board, MultipartFile file) throws Exception {

        // 파일 업로드 처리 시작
        String projectPath = System.getProperty("user.dir") // 프로젝트 경로를 가져옴
                + "/Users/koo/saltydate2_img/"; // 파일이 저장될 폴더의 경로

        UUID uuid = UUID.randomUUID(); // 랜덤으로 식별자를 생성

        String fileName = uuid + "_" + file.getOriginalFilename(); // UUID와 파일이름을 포함된 파일 이름으로 저장

        File saveFile = new File(projectPath, fileName); // projectPath는 위에서 작성한 경로, name은 전달받을 이름

        file.transferTo(saveFile);

        board.setFilename(fileName);
        board.setFilepath("/files/" + fileName); // static 아래부분의 파일 경로로만으로도 접근이 가능
        // 파일 업로드 처리 끝

        boardRepository.save(board); // board를 저장소에 save
    }

    // 게시글 리스트 처리
    public List<Board> boardList() {
        return boardRepository.findAll();
    }

    // 특정 게시글 불러오기
    public Board boardView(Long id) {
        return boardRepository.findById(id).get();
    }

    // 특정 게시글 삭제
    public void boardDelete(Long id) {
        boardRepository.deleteById(id);
    }



}
