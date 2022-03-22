package com.zinzun.book.springboot.service;

import com.zinzun.book.springboot.web.domain.posts.PostsRepository;
import com.zinzun.book.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return  postRepository.save(requestDto.toEntity()).getId();
    }
}
