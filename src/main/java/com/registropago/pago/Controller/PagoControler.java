package com.registropago.pago.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.registropago.pago.Models.Service.Empleado;
import com.registropago.pago.Models.Service.Pago;





@Controller

public class PagoControler {

    @Autowired
    private Pago pag;


    @GetMapping("/vista")
    public String clientes(ModelMap model) {
        model.addAttribute("titulo", "Registro de Empresa");
        model.addAttribute("registro", pag);
       
   
           /*  for(int i=0;i<strEmpleado.length;i++){
                System.out.println(strEmpleado[i]);
            }*/
      
        return "index.html";
    }
   
    @PostMapping("/vista/pago")
    public String info(@RequestParam(name="nombre") String saludo,ModelMap model) {
       
        model.addAttribute("nombre", saludo);
        model.addAttribute("registro", pag);
      
       model.addAttribute("info", pag.emp);
        
        return "Pago.html";
    }

  

}
