package com.studycandy.service;

import com.studycandy.mapper.PostMapper;
import com.studycandy.model.Post;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/22
 */
@Service
public class PostService {
    @Autowired
    private PostMapper mapper;

    public int save(Post entity) {
        return mapper.insert(entity);
    }

    public List<Post> getAllPost() {
        return mapper.selectAll();
    }

    public List<Post> getUserPostList(Integer userId){
        return mapper.selectByUserId(userId);
    }

    public int deleteById(Integer id){
        return  mapper.deleteByPrimaryKey(id);
    }

    public int modifyPost(Post post){
        return mapper.updateByPrimaryKey(post);
    }

    public Post getPostById(Integer id){
        return mapper.selectByPrimaryKey(id);
    }
}
