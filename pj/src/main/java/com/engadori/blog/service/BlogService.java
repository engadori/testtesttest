package com.engadori.blog.service;

import com.engadori.blog.dao.BlogDAO;
import com.engadori.blog.dto.BlogDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BlogService {

    private final BlogDAO blogDAO;

    public BlogDTO insertData(BlogDTO blogDTO){

        blogDAO.insertData(blogDTO);
        return blogDTO;
    }
}
