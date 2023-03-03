package com.registropago.pago.Models.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Pago {
    
  @Autowired
   public List<Empleado> emp;




public List<Empleado> getEmp() {
    return emp;
}

public void setEmp(List<Empleado> emp) {
    this.emp = emp;
}

  


}
