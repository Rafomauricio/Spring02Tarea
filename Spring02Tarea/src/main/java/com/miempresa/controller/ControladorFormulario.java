package com.miempresa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class ControladorFormulario {

    
    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("solicitudTarjeta", new FormularioDTO());
        return "formulario";
    }

    
    @PostMapping("/formulario")
    public String procesarFormulario(@Valid @ModelAttribute("solicitudTarjeta") FormularioDTO solicitudTarjeta,
                                     BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "formulario";
        }
        model.addAttribute("solicitudTarjeta", solicitudTarjeta);
        return "confirmacion";
    }
}
