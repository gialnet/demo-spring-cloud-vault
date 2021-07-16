package com.vivaldi.spring.demospringcloudvault.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PropertiesController {

    Map<String, Object> response = new HashMap<>();
    private final Environment environment;

    public PropertiesController(Environment environment) {
        this.environment = environment;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = {"application/JSON"} )
    public ResponseEntity<?> CheckVersion(){

        response.clear();
        response.put("version", "Vault 1.7.0 Spring Boot 2.5.1");
        response.put("status", "spring-cloud-starter-vault-config 3.0.3");
        response.put("data",  "Backend Version 0.3 Release June 2021" );
        response.put("CAMINO", environment.getProperty("PropertyCamino") );

        return new ResponseEntity<>(response, HttpStatus.OK);

    }

    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = {"application/JSON"} )
    public ResponseEntity<?> getUser(){

        response.clear();

        response.put("data",  environment.getProperty("user") );
        response.put("cc-global",  environment.getProperty("infra.conf.kafka") );
        response.put("certificates",  environment.getProperty("camino") );


        return new ResponseEntity<>(response, HttpStatus.OK);

    }
}
