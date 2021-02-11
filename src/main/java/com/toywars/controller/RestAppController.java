package com.toywars.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.UUID;

@RestController
public class RestAppController {

    @RequestMapping(value= "/rest/do/Action")//Devuelve mensaje JSON
    @RequestMapping(value= "/rest/getCurrentStatus")////Devulve mensaje Status en JSON
    @RequestMapping(value= "/rest/getStats")//Devuelve mensaje Stats
    @RequestMapping(value= "/rest/render/RenderType")//Devuelve String como body
    @RequestMapping(value= "/rest/new")//Devolver LifeBeing
    @RequestMapping(value = "/rest/getActions")//Devolver listado IActions

    /**
     * Check it works perfectly
     *
     * @param uuid
     * @return
     */

    // TODO ¿Qué hay que poner en lugar de uuid?
    @RequestMapping(value = "/get/{uuid}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<RegisterItem>> getRegisterById(@PathVariable UUID uuid) {
        try {
            return new ResponseEntity<>(analysisService.getDataRegisterById(uuid), HttpStatus.OK);
        } catch (Exception e) {
            log.error("register:get/", e);
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
