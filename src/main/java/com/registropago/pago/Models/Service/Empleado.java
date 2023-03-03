package com.registropago.pago.Models.Service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Empleado {

    @Autowired
    @Qualifier("registrarItemFacturasacturas")
    public Personas per;

    public int tipo;

    public int hora;

    //

    public Empleado(int hora,int tipo, Personas per) {
        this.tipo = tipo;
        this.per = per;
        this.hora = hora;
    }

    public Empleado() {
       
    }
///

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Personas getPer() {
        return per;
    }

    public void setPer(Personas per) {
        this.per = per;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

///Fun

public int calculo(int a){
int n=0;
switch (a) {
    case 1:
     n=getHora()*100;
    case 2:
    n=getHora()*200;
    case 3:
    n=getHora()*300;
}
return n;
}


}
