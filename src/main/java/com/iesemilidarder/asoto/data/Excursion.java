package com.iesemilidarder.asoto.data;

import java.util.ArrayList;
import java.util.List;

public class Excursion extends Product {
    private String name;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}

