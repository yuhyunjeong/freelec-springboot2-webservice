package com.jojoldu.book.springboot.web;


import com.jojoldu.book.springboot.service.posts.PostsService;
import com.jojoldu.book.springboot.web.dto.PostsSaveRequestDto;
import com.jojoldu.book.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping ("/api/v1/posts") // 등록
    public Long save(@RequestBody PostsSaveRequestDto requestDto){ // RequestBody : JSON 형태로 데이터 전달
        return postsService.save(requestDto); // insert 기능
    }

    @PutMapping ("/api/v1/posts/{id}") // 수정
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
        return postsService.update(id, requestDto); // update 기정
    }


}
