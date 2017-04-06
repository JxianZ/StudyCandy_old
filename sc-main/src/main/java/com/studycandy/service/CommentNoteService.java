package com.studycandy.service;

import com.studycandy.mapper.CommentNoteMapper;
import com.studycandy.model.CommentNote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/4/3 0003.
 */
@Service
public class CommentNoteService {
    @Autowired
    CommentNoteMapper mapper;

    public List<CommentNote> getCommentNoteListByNoteId(Integer noteId){
        return mapper.selectByNoteId(noteId);
    }

    public List<CommentNote> getCommentNoteListByUserId(Integer userId){
        return mapper.selectByUserId(userId);
    }

    public CommentNote getCommentNote(Integer id){
        return mapper.selectByPrimaryKey(id);
    }

    public int saveCommentNote(CommentNote commentNote){
        return mapper.insert(commentNote);
    }

    public int deleteCommentNote(Integer id){
        return mapper.deleteByPrimaryKey(id);
    }

    public int modify(CommentNote commentNote){
        return mapper.updateByPrimaryKey(commentNote);
    }


}
