package com.iesemilidarder.asoto.data;

public class Vuelo extends Product {
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    private String name;


}
