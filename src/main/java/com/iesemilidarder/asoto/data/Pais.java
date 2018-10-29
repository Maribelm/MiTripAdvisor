package com.iesemilidarder.asoto.data;

public class Pais  {

    private String name;
    private int population;

    public Pais(String name){
        this.name = name;
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

