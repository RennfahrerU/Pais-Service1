package co.edu.uceva.pais_service.controller;

import co.edu.uceva.pais_service.model.entities.Pais;
import co.edu.uceva.pais_service.model.service.IPaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/pais-service")
public class PaisController {
    /**
     * Endpoint para recibir un saludo
     * @param nombre Es el nombre que envian desde la URL
     * @return un saludo
     *  public String holamundo(@PathVariable("nombre") String nombre){
     *         return "Hola " + nombre;
     *     }
     */
    @Autowired
    IPaisService paisService;

    @GetMapping("/paises")
    public List<Pais>listar(){
        return paisService.findAll();
    }

    @GetMapping("/paises/{id}")
    public Pais buscarPais(@PathVariable("id") Long id){
        return paisService.findById(id);
    }

}
