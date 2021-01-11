package com.engadori.blog.dao;

import com.engadori.blog.dto.BlogDTO;
import lombok.AllArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@AllArgsConstructor
@Repository
public class BlogDAO {

    private SqlSession sqlSession;

    public void insertData(BlogDTO blogDTO){
        sqlSession.selectOne("BlogMapper.insertData",blogDTO);
    }

    public void deleteData(BlogDTO blogDTO){
        sqlSession.selectOne("BlogMapper.deleteData",blogDTO);
    }




}
