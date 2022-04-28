package com.noel.freelec.controller;

import com.noel.freelec.domain.posts.PostsRepository;
import com.noel.freelec.dto.PostsResponseDto;
import com.noel.freelec.dto.PostsSaveRequestDto;
import com.noel.freelec.dto.PostsUpdateRequestDto;
import com.noel.freelec.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {
        return postsService.findById(id);
    }
}
