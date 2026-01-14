package com.dramalog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dramalog.model.User;

import org.springframework.ui.Model;
import jakarta.servlet.http.HttpSession;

@Controller
public class PageController {

    // 로그인 페이지
    @GetMapping("/login")
    public String loginPage() {
        return "login"; 
        // -> templates/login.html
    }

 // 홈
    @GetMapping("/")
    public String home(HttpSession session, Model model) {

        User currentUser = (User) session.getAttribute("currentUser");

        String name = (currentUser != null && currentUser.getName() != null && !currentUser.getName().isBlank())
                ? currentUser.getName()
                : "홍길동";
        
        int level = (currentUser != null && currentUser.getLevel() != null)
                ? currentUser.getLevel()
                : 1; // 기본 1
        
        if (level < 1) level = 1;   // 0이면 1로 (DB 연결 문제 해결)
        if (level > 3) level = 3;


        model.addAttribute("userName", name);
        model.addAttribute("level", level);

        return "home";
    }
    
    // 드라마 상세 페이지 
    @GetMapping("/drama/{dramaId}")
    public String dramaDetailPage(@PathVariable Integer dramaId) {
        return "drama-detail";
    }
}