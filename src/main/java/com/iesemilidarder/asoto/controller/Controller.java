package com.iesemilidarder.asoto.controller;

import com.iesemilidarder.asoto.data.Pais;
import com.iesemilidarder.asoto.data.Vuelo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/Vuelos")
    public Vuelo Product(@RequestParam(value = "name", defaultValue = "no se encuentra") String name) {
        // Vuelo item = new Pais();
        //item.setName(name);
        //return item;
        return null;
    }
}
