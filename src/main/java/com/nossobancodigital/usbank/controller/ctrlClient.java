package com.nossobancodigital.usbank.controller;

import javax.validation.Valid;

import com.nossobancodigital.usbank.model.Clients;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/clientes")
public class ctrlClient {

    @RequestMapping(value = "/novo", method = RequestMethod.GET)
    public ModelAndView novo(Clients client) {
        ModelAndView mv = new ModelAndView("Cadastro");
        return mv;
    }

    @RequestMapping(value = "novo", method = RequestMethod.POST)
    public ModelAndView salvar(@Valid Clients client, BindingResult result, RedirectAttributes attributes) {
        if (result.hasErrors()){
            return novo(client);
        }
        ModelAndView mv = new ModelAndView("redirect:/clientes/novo");
        attributes.addFlashAttribute("mensagem","Seus dados foram enviados para análise e em breve retornaremos a sua solicitação de abertura de conta");
        return mv;
    }
    
    
}
