package com.iesemilidarder.asoto.controller;

import com.iesemilidarder.asoto.data.*;
import com.iesemilidarder.asoto.exception.DataHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @RequestMapping("/Vuelo")
    public Vuelo Product(@RequestParam(value = "name", defaultValue = "no se encuentra") String name) {
        // Vuelo item = new Pais();
        //item.setName(name);
        //return item;
        return null;
    }

    @RequestMapping("/getAll")
    public List<Product> getAll() {
        return DataHelper.products;
    }

    @RequestMapping("/excursion")
    public Excursion getActivity(@RequestParam(value = "name", defaultValue = "World") String activityKind) {
        Excursion excursion = new Excursion();
        excursion.setName(activityKind);
        DataHelper.products.add(excursion);
        return excursion;
    }

    @RequestMapping("/pais")
    public Pais getActivity(@RequestParam(value = "name", defaultValue = "World") String activityKind) {
        Pais pais = new Pais();
        pais.setName(activityKind);
        DataHelper.products.add(pais);
        return pais;
    }

    @RequestMapping("/pais")
    public Hotel getActivity(@RequestParam(value = "name", defaultValue = "World") String activityKind) {
        Hotel hotel = new Hotel();
        hotel.setName(activityKind);
        DataHelper.products.add(hotel);
        return pais;
    }

}




