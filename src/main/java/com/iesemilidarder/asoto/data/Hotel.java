package com.iesemilidarder.asoto.data;

public class Hotel  extends Product{

    public Hotel(String hoteles) {
        super();
    }

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
