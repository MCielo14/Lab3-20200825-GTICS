package com.example.lab3_20200825.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    @GetMapping(value = {" ", "/principal"})
    public String listar() {
        return "principal";
    }

}
