package com.example.lab3_20200825.controlador;

import com.example.lab3_20200825.entidad.Jugador;
import com.example.lab3_20200825.repositorio.JugadorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/jugador")
public class JugadorController {
    final JugadorRepository jugadorRepository;
    public JugadorController(JugadorRepository jugadorRepository) {
        this.jugadorRepository=jugadorRepository;
    }
    @GetMapping(value =  "")
    public String listar(Model model) {
        model.addAttribute("listaj", jugadorRepository.findAll());
        return "jugador/list";
    }
    @GetMapping("/new")
    public String crear() {
        return "newform";
    }
    @GetMapping("/borrar")
    public String borrar(@RequestParam("id") int id) {

        Optional<Jugador> optional = jugadorRepository.findById(id);

        if (optional.isPresent()) {
            jugadorRepository.deleteById(id);
        }

        return "redirect:/";
    }

}
