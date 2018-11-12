package com.iesemilidarder.asoto.data;

import java.util.List;

public class Pais extends Product {

    public List<Pais> staPaises;
    private String name;
    private int population;

    public Pais(String name){
        this.name = name;
    }

    public Pais() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}

