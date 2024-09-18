package com.singleton.singleton;
/*Criando  um serviço singleton*/
import org.springframework.stereotype.Service;
@Service
public class ServicoSingleton {

    private String message;

    public ServicoSingleton(){
        this.message = "Bem vindo ao Serviço do Singleton";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
