package com.arief.boot.Controllers;

import com.arief.boot.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Arief on 8/16/2017.
 */
@Controller
public class MainController {




    private ArrayList<String> list(){
        ArrayList<String> data =new ArrayList<String>();
        data.add("Item 1");
        data.add("Item 2");
        data.add("Item 3");

        return data;
    }

    @RequestMapping("/")
    public String indexPage(){
        return "hello";
    }

    @RequestMapping("/main-page")
    public String mainPage(Model m ){
        m.addAttribute("judul","Thymeleaf template page");
        m.addAttribute("pesan","AriefKahfi");
        return "main-menu";
    }


    /*@RequestMapping("/pojo-request")
    public String pojoView(Model m){
        Person p = p();
        m.addAttribute("person",p);
        m.addAttribute("date",new Date());
        return "pojo";
    }*/


    @RequestMapping("/open-form")
    public String formView(Model m){
        m.addAttribute("person",new Person());
        return "form";
    }


    @RequestMapping("/result")
    public String returnForm(@ModelAttribute("person") Person p){
        return "result";
    }

    @RequestMapping("/for")
    public String forView(){
        return "for";
    }

    @RequestMapping("/list")
    public String listView(Model m){
        m.addAttribute("data",list());
        return "list";
    }

}
