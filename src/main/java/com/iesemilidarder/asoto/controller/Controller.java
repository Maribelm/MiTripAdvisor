package com.iesemilidarder.asoto.controller;

import com.iesemilidarder.asoto.data.Hotel;
import com.iesemilidarder.asoto.data.Pais;
import com.iesemilidarder.asoto.data.Product;
import com.iesemilidarder.asoto.data.Vuelo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/Vuelo")
    public Vuelo Product(@RequestParam(value = "name", defaultValue = "no se encuentra") String name) {
        // Vuelo item = new Pais();
        //item.setName(name);
        //return item;
        return null;
    }

    @RequestMapping("/getProductType")
    public Product Product(@RequestParam(value = "name", defaultValue = "no se encuentra") String name) {

        return null;
    }

    @RequestMapping("/getProduct/id")
    public Product Product(@RequestParam(value = "name", defaultValue = "no se encuentra") String name) {

        return null;
    }

    @RequestMapping("/addProduct")
    public Product Product(@RequestParam(value = "name", defaultValue = "no se encuentra") String name) {

        return null;
    }
}




