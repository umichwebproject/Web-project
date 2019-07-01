package com.umichwebproject.webproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(ModelMap map){
        map.addAttribute("host","233");
        List<String> color = new ArrayList<>();
        color.add("R");
        color.add("G");
        color.add("B");
        map.addAttribute("color",color);
        return "index";
    }
}

