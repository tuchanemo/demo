package com.example.demo.service.impl;

import com.example.demo.dto.Post;
import com.example.demo.service.api.PostService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MemPostService implements PostService {

    private ArrayList<Post> posts=new ArrayList<Post>(Arrays.asList(
            Post.builder()
                    .title("First title")
                    .body("First body")
                    .img("/img/1.jpg")
                    .build(),
            Post.builder()
                    .title("Second title")
                    .body("Second body")
                    .img("/img/2.jpg")
                    .build(),
            Post.builder()
                    .title("Third title")
                    .body("Third body")
                    .img("/img/3.jpg")
                    .build()
        )
    );


    @Override
    public List<Post> search() {
        return posts;
    }
}
