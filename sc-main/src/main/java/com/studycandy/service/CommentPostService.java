package com.studycandy.service;

import com.studycandy.mapper.CommentPostMapper;
import com.studycandy.model.CommentPost;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/22
 */
public class CommentPostService {
    @Autowired
    private CommentPostMapper mapper;

    public List<CommentPost> getCommentPostListByPostId(Integer postId){
        return mapper.selectByPostId(postId);
    }

    public List<CommentPost> getCommentPostListByUserId(Integer userId){
        return mapper.selectByUserId(userId);
    }

    public CommentPost getCommentPost(Integer id){
        return mapper.selectByPrimaryKey(id);
    }

    public int saveCommentPost(CommentPost commentPost){
        return mapper.insert(commentPost);
    }

    public int deleteCommentPost(Integer id){
        return mapper.deleteByPrimaryKey(id);
    }

    public int modify(CommentPost commentPost){
        return mapper.updateByPrimaryKey(commentPost);
    }
}
