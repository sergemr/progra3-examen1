package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/inicio")
public class WebController {
        @GetMapping()
    public String index() {
        return "index-inicio";
    }

}
