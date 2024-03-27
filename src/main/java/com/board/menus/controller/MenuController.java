package com.board.menus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Menus")
public class MenuController {
      @Autowired
      private MenuMapper menuMapper;
      //메뉴 목록조회
      @RequestMapping("/List")
      public String list(Model model) {
    	  // 조회결과를 ArrayList 로 돌려준다
    	  List<MenuVo> menuList = menuMapper.getMenuList();
    	  // 조회결과를 넘겨준다(Model)
    	  model.addAttribute("menuList",menuList);
    	   //System.out.println("MenuController list() menuList:"+menuList);
    	     return "menus/list";
    	     
      }
    // 메뉴 입력받는 화면 /Menus/WriteForm
      // @ReqeuestMapping("/Menus/WriteForm")
      @RequestMapping("/writeForm") // Menus/WriteForm
      public String ("/WriteForm") {
    	  return "menus/write"; // WEB-INF/viewS/ +menus/wirte+ .jsp
    	  
      }
      //메뉴저장
   // 메뉴 저장
  	// /Menus/Write?menu_id=MENU02&menu_name=JSP&menu_seq=2
  	//@RequestMapping("/Menus/Write")
   @RequestMapping("/Menus/Write")
 //public   String   write( 
 	// 		String menu_id, String menu_name, int menu_seq) { 
 	 // 인식안됨(error)     menu_id 를 찾을 수 없다
   public String write(MenuVo menuVo, Model model) { // vo 로 작업해야한다
	   // 넘어온데이터를 db에 저장하고
	   menuMapper.insertMenu(menuVo);
	   //menuMapper.insertMenu(menu_id, menu_name menu_seq); //error
	   return "redirect:/Menus/List";
	 //List<MenuVo>  menuList = menuMapper.getMenuList();
	 		//model.addAttribute("menuList", menuList);
	 		
	 	    //	return "menus/list";    // menus/list.jsp 
   }
  // ------------------------
   @RequestMapping("/WriteForm2")
   public String writeForm2() {
	   return "menus/write2
   }
}
