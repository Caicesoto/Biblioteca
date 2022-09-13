package com.Biblioteca.Prestamos.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller //porque se va a comunicar directamente con el controlador
public class vistaLibroControlador {

    @GetMapping("/Prueba/{nombre}") //llamo URL, le envío parametro el me tiene que retornar libro o sea pagina web
    public String prueba(@PathVariable("nombre") String nombre, Model model){
       model.addAttribute("nombre",nombre);
       return"Libros";

}


        //deben retornar el String porque lo que van a retornar es la pagina html
    //siempre tengo que enviarle un modelo


}
