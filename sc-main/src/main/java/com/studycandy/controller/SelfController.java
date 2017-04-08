package com.studycandy.controller;

import com.studycandy.core.BaseController;
import com.studycandy.model.CommentNote;
import com.studycandy.model.Note;
import com.studycandy.model.User;
import com.studycandy.service.CommentNoteService;
import com.studycandy.service.NoteService;
import com.studycandy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/3 0003.
 */

/*
 * 自习室首页：selfStudyRoom
 * 笔记详细界面:noteView
 * 笔记修改界面：modifyView
 * 笔记所有回复界面：notecomments
 *
 *
 *
 */
@Controller
@RequestMapping(value = "/selfstudy")
public class SelfController extends BaseController{
    @Autowired
    private NoteService noteService;
    @Autowired
    private CommentNoteService commentNoteService;
    @Autowired
    private UserService userService;

    //访问自习室首页
    @RequestMapping(value = {"","/"})
    public String selfstudy(HttpServletRequest request, HttpServletResponse response, Model model){
        List<Note> l = noteService.getAllNote();
        Map<Integer,String> m = new HashMap<Integer, String>();
        String nickname="";
        for(Note n : l){
            if(userService.getUserById(n.getUserId())!=null)
                nickname=userService.getUserById(n.getUserId()).getUserNickname();
            else
                nickname="null";
            m.put(n.getUserId(),nickname);
        }
        model.addAttribute("allnotelist", l);
        model.addAttribute("noteusername",m);
        return "classroom/selfStudyRoom";
    }

    //切换到我的自习室
    @RequestMapping(value = "myNotes")
    public String mineNote(HttpServletRequest request, HttpServletResponse response, Model model){
        Integer UserId = this.getCurrentUser(request).getId();
        List<Note> myNotes = noteService.getUserNoteList(UserId);
        String username = userService.getUserById(UserId).getUserNickname();
        if(username==null)username=userService.getUserById(UserId).getUserUsername();
        model.addAttribute("myNotes",myNotes);
        model.addAttribute("userName",username);
        return "classroom/myNote";
    }
    //访问笔记详细界面
    @RequestMapping(value = "noteView/{id}")
    public String noteView(HttpServletRequest request, HttpServletResponse response, Model model,
                           @PathVariable("id")Integer id){
        model.addAttribute("note",noteService.getNoteById(id));
        return "noteview";
    }
    //添加做笔记
    @RequestMapping(value = "addNote",method = POST)
    public String addNote(HttpServletRequest request, HttpServletResponse response, Model model,
                          @RequestParam String noteTitle,
                          @RequestParam String noteContent){
        Note entity = new Note();
        entity.setNoteTitle(noteTitle);
        entity.setNoteContent(noteContent);
        entity.setGmtCreate(new Timestamp(new Date().getTime()));
        entity.setGmtModified(new Timestamp(new Date().getTime()));
        try{
            if(this.getCurrentUser(request)==null) throw new Exception("请您先登录");
            entity.setUserId(this.getCurrentUser(request).getId());
            noteService.save(entity);
            model.addAttribute("note",entity);
            //TODO return "noteview"; //详细界面
            return ajaxReturn(response, null, "笔记发布成功！", 0);
        }catch (Exception e){
            return ajaxReturn(response, null, e.getMessage(), -1);
        }
    }
    //删除笔记
    @RequestMapping(value = "deleteNote", method = POST)
    public String deleteNote(HttpServletRequest request, HttpServletResponse response, Model model,
                             @RequestParam Integer id){
        Note t = noteService.getNoteById(id);
        if(t.getUserId()==this.getCurrentUser(request).getId())
            noteService.deleteById(id);
        return "redirect:/selfstudy";
    }
    //进入修改笔记界面
   @RequestMapping(value = "modifyview", method = POST)
    public String modifyNoteview(HttpServletRequest request, HttpServletResponse response, Model model,
                             @RequestParam Integer id){
       Note t = noteService.getNoteById(id);
        if(t.getUserId()==this.getCurrentUser(request).getId()){
            model.addAttribute("Note",t);
                return "modifyView";
        }
       return "redirect:/selfstudy";
   }
   //修改笔记
    @RequestMapping(value = "modify", method = POST)
    public String modifyNote(HttpServletRequest request, HttpServletResponse response, Model model,
                             @RequestParam String noteTitle,
                             @RequestParam String noteContent){
        Note entity = new Note();
        entity.setNoteTitle(noteTitle);
        entity.setNoteContent(noteContent);
        entity.setGmtModified(new Timestamp(new Date().getTime()));
        noteService.modifyNote(entity);
        model.addAttribute("note",entity);
        return "noteview";
    }
    /*评论功能 Start*/
    //获取笔记的所有回复
    @RequestMapping(value = "/notecomments/{noteId}")
    public String noteComments(HttpServletRequest request, HttpServletResponse response, Model model,
                               @PathVariable("noteId") Integer id){
        model.addAttribute("notecmments",commentNoteService.getCommentNoteListByNoteId(id));
        return "notecomments";
    }
    //添加回复
    @RequestMapping(value = "addcomment",method = POST)
    public String addcomment(HttpServletRequest request, HttpServletResponse response, Model model,
                             @RequestParam Integer noteId,
                             @RequestParam String commentContent,
                             @RequestParam Integer followId){
        CommentNote entity = new CommentNote();
        entity.setNoteId(noteId);
        entity.setFollowId(followId);
        entity.setUserId(this.getCurrentUser(request).getId());
        entity.setGmtCreate(new Timestamp(new Date().getTime()));
        entity.setGmtModified(new Timestamp(new Date().getTime()));
        entity.setCommentContent(commentContent);
        commentNoteService.saveCommentNote(entity);
        return "notecomments";
    }
    //删除回复
    @RequestMapping(value = "deletecomment",method = POST)
    public String deleteComment(HttpServletRequest request, HttpServletResponse response, Model model,
                                @RequestParam Integer commentId){
        CommentNote t = commentNoteService.getCommentNote(commentId);
        //判断是否是帖子主人要进行修改
        if(this.getCurrentUser(request).getId()==t.getUserId())
            commentNoteService.deleteCommentNote(commentId);
        return "postcomments";
    }
    /*评论功能 End*/

}
