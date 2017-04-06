package com.studycandy.mapper;

import com.studycandy.model.Post;
import javafx.geometry.Pos;

import java.util.List;

public interface PostMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Post record);

    Post selectByPrimaryKey(Integer id);

    List<Post> selectAll();

    int updateByPrimaryKey(Post record);

    List<Post> selectByUserId(Integer userId);

    List<Post> selectAllDayPost();

    List<Post> selectAllNightPost();

}