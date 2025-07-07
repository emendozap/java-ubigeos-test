package biz.rogasoft.facturacion.ubigeos.sunat.java.be.ubigeos_microservice.service;

import org.springframework.stereotype.Service;

@Service
public class UbigeoService {

  public String getAllUbigeos() {
    // Retornando JSON de prueba directamente
    return """
        [
          {
            "id": 1,
            "codigo": "150101",
            "departamento": "Lima",
            "provincia": "Lima",
            "distrito": "Lima"
          },
          {
            "id": 2,
            "codigo": "150102",
            "departamento": "Lima",
            "provincia": "Lima",
            "distrito": "Ancón"
          },
          {
            "id": 3,
            "codigo": "150103",
            "departamento": "Lima",
            "provincia": "Lima",
            "distrito": "Ate"
          },
          {
            "id": 4,
            "codigo": "150104",
            "departamento": "Lima",
            "provincia": "Lima",
            "distrito": "Barranco"
          },
          {
            "id": 5,
            "codigo": "150141",
            "departamento": "Lima",
            "provincia": "Lima",
            "distrito": "Surquillo"
          }
        ]
        """;
  }

}
