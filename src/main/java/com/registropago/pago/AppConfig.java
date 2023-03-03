package com.registropago.pago;

/*import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;*/

import java.util.Arrays;
import java.util.List;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.registropago.pago.Models.Service.Empleado;
import com.registropago.pago.Models.Service.Personas;

@Configuration
public class AppConfig {
    
    
    @Primary
    @Bean
    public List<Empleado> registrarItemFacturasacturas() {
        Personas pre1 = new Personas("Josward", "Pulido");
        Personas pre2 = new Personas("Carlos", "La Roche");

        Empleado linea1 = new Empleado(4,2, pre1);
        Empleado linea2 = new Empleado(5,3, pre2);
        return Arrays.asList(linea1, linea2);
    }

 /*try {
    File arch= new File("C:\\ persona.txt");
    FileReader fr = new FileReader(arch);
    BufferedReader br = new BufferedReader(fr);
    String linea;
    while ((linea=br.readLine())!=null) {
    String linea2;
    linea.split(",");
    }
} catch (FileNotFoundException e) {
    e.printStackTrace();
}

*/
    

}
