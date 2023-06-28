package com.example.JavaCurso;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("hacer-algo")
    public String primeraPrueba(){
        //mi-dominio.com/hacer-algo
        return "Hola Mundo!";
    }

    @GetMapping("gen-password")
    public String genPassword(){
        double num = Math.random()*100000;
        return "P" + Math.round(num);
    }

    @GetMapping("translate-to-morse")
    public String transToMorse(){
        String texto = "ABAABBA";
        String salida = "";

        String [] letras = {"A","B","C"};
        String [] morse = {".-","-...",".-."};

        for(int i = 0; i < texto.length(); i++){
            char letra = texto.charAt(i);
        }

        return salida;
    }
}
