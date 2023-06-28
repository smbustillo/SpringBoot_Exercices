package com.example.JavaCurso;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("translate-to-morse/{texto}")
    public String transToMorse(@PathVariable String texto){
        String salida = "";

        String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z","_"};
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..","   "};


        for(int i = 0; i < texto.length(); i++){
            String letra = "" + texto.charAt(i);

            for(int j=0; j< morse.length; j++) {
                if(letra.equalsIgnoreCase(letras[j])){
                    salida += morse[j] + " ";
                }
            }
        }

        return salida;
    }
}
