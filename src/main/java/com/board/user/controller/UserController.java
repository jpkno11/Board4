package com.board.user.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
@RequestMapping("/Users")
public class UserController {
  @Autowired
  private UserMapper userMapper;

    // /Users/List
  @RequestMapping("/List")
   public ModelAndView list() {
	  //사용자목록 조회
	  List<UserVo> userList= userMapper.getUswerList();
	  ModelAndView mv = new ModelAndView();
	  mv.addObject("userList",userList);
      mv.setViewName("users/List");
          return mv; 
  }
  // / Users/WriteForm
      @RequestMapping("/writeForm")
       public ModelAndView writeForm() {
    	  ModelAndView mb = new ModelAndView();
    	  mv.setViewName("users/wirte");
    	  return mv;
      }
    //  /Users/Write
      @RequestMapping("/wirte")
       public ModelAndView write(UserVo userVo) {
    	  //저장
    	  userMapper.insertUswer(userVo);
    	  //데이터를 가지고 이동한다
    	  ModelAndView mv = new ModelAndView();
    	  mv.setViewName("redirect:/Uswers/List");
    	  return mv;
      }
  //  http://localhost:9090/Users/View?userid=aa
      @RequestMapping("/View")
      public ModelAndView view(UserVo userVo) {
    	  //user_id=aa db 조회
    	  HashMap<String Object> map = userMapper.getUswer(userVo);
    	  // System.out.println(vo);
    	  log.info("map:{}",map);
    	  // map.get("userid")
    	  ModelAndView mv = new ModelAndView();
    	  mv.addAllObjects("vo",map);
    	  mv.setViewName("users/view");
    	  return mv;
      }
      // /Uswers / UpdateForm?user_id=sky
      @RequestMapping("/updateForm")
      public ModelAndView updateForm(UserVo userVo) {
    	  //아이디로 수정할 한면의 데이털ㄹ 조회
    	  HashMap<String,Object> map= userMapper.getUser(userVo);
    	  //Model에 담는다
       ModelAndview mv = new ModelAndView();
       mv.addobJECT("vo,"map);
      //이동한다
       mv.setViewName("users/updaate");
        return mv;
      }
      // /users/Update
      @RequestMapping("/Update")
      public ModelAndView update(UserVo userVo) {
    	  log.info("userVo:{}",userVo);
    	  //수정
    	  userMapper.updateUser(userVo);
         ModelAndView mv = new ModelAndView();
         mv.setViewName("redirect"/Users/List);
         return mv;
         
      }
       // /Users/Delete?userid=aa
      @RequestMapping("/Delete")
     public ModelAndView delete(UserVo userVo) {
    	  //삭제
    	  userMapper.deleteUser(userVo);
       ModelAndView mv = new ModelAndView();
       mv.setViewName("redirect:/Uswrs/List");
       return mv;
       
       
      }
}
