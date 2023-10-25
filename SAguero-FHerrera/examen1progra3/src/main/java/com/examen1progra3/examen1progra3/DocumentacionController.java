package com.examen1progra3.examen1progra3;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/intro")

public class DocumentacionController {
    @GetMapping()
    public String index() {
        return "index";
    }
}