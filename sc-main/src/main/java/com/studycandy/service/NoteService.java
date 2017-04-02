package com.studycandy.service;

import com.studycandy.mapper.CommentNoteMapper;
import com.studycandy.mapper.NoteMapper;
import com.studycandy.model.CommentNote;
import com.studycandy.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/4/3 0003.
 */
@Service
public class NoteService {
    @Autowired
    NoteMapper mapper;

    public int save(Note entity) {
        return mapper.insert(entity);
    }

    public List<Note> getAllNote() {
        return mapper.selectAll();
    }

    public List<Note> getUserNoteList(Integer userId){
        return mapper.selectByUserId(userId);
    }

    public int deleteById(Integer id){
        return  mapper.deleteByPrimaryKey(id);
    }

    public int modifyNote(Note note){
        return mapper.updateByPrimaryKey(note);
    }

    public Note getNoteById(Integer id){
        return mapper.selectByPrimaryKey(id);
    }


}
