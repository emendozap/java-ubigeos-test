package biz.rogasoft.facturacion.ubigeos.sunat.java.be.ubigeos_microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.MediaType;

import biz.rogasoft.facturacion.ubigeos.sunat.java.be.ubigeos_microservice.service.UbigeoService;

@RestController
@RequestMapping("/api/ubigeos")
public class UbigeoController {
  
  @Autowired
  private UbigeoService ubigeoService;

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public String getAllUbigeos() {
      return ubigeoService.getAllUbigeos();
  }
}
