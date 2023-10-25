package com.examen1.examen1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*Se crea el WebController que contiene la descripción del proyecto */
@Controller
@RequestMapping("/descrip")
public class WebController {
    
    @GetMapping()
        public String descripcion(){
            return "proyecto";
        }
}
