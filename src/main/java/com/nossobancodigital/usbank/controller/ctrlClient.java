package com.nossobancodigital.usbank.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(/clients)
public class ctrlClient {

    @RequestMapping(value="/novo", method = RequestMethod.GET)
    public ModelAndView novo(Clients client) {
        ModelAndView mv = new ModelAndView("CadastroCliente");
        return mv;
    }

    @RequestMapping(value = "novo", method = RequestMethod.POST)
    public ModelAndView salvar(Clients client, RedirectAttributes attributes) {
        ModelAndView mv = new ModelAndView("redirect:/clients/novo");
        attributes.addFlashAttribute("mensagem","Seus dados foram enviados para análise e em breve retornaremos a sua solicitação de abertura de conta");
        return mv;
    }
    
    
}
