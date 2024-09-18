package com.singleton.singleton;

/* Criando um controlador REST para testar o serviço Singleton*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class Controlador {

    private ServicoSingleton servicoSingleton;

    @Autowired

    public Controlador(ServicoSingleton servicoSingleton){
        this.servicoSingleton = servicoSingleton;
    }

    @GetMapping("/message")

    public String geMessage(){
        return servicoSingleton.getMessage();
    }

    @GetMapping("/set-message")

    public String setMessage(String newMessage){
        servicoSingleton.setMessage(newMessage);
        return "Mensagem Atualizada!";
    }
}