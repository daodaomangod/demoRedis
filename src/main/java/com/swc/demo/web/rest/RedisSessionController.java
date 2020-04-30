package com.swc.demo.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/api")
public class RedisSessionController {


    @GetMapping("/setSession")
    public String testSessionTimeOut(String message, HttpSession session) {
        System.out.println("sessionId-------->" + session.getId());
        session.setAttribute("daoKey", message);
        return session.getId();
    }

    @GetMapping("/getSession")
    public String testSessionGet(HttpSession session) {
        System.out.println("sessionId-------->" + session.getId());
        System.out.println("get sessionId-------->" + session.getAttribute("daoKey"));
        return session.getId()+"get sessionId-------->" + session.getAttribute("daoKey");
    }


}
