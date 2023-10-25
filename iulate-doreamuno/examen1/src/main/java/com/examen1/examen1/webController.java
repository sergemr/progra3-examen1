package com.examen1.examen1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/descripcion")
public class webController {
    
    @GetMapping
    public String descripcion(){
        return "descripcion";
    }

}
