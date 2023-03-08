package co.edu.uceva.pais_service.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/Pais-service")
public class PaisRestController {
    /**
     * Endpoint para recibir un saludo
     * @param nombre Es el nombre que envian desde la URL
     * @return un saludo
     */
    @GetMapping("/bienvenido/{nombre}")
    public String holamundo(@PathVariable("nombre") String nombre){
        return "Hola " + nombre";
    }
}
