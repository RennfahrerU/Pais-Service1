package co.edu.uceva.pais_service.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/Pais-service")
public class Pais_ServiceController {
    @GetMapping("/bienvenido")
    //Método que da la bienvenida al navegador.
    public String imprimir(){ //TODO Saludo con nombre
        return "Hola. Bienvenido a Pais Service.";

    }
}
