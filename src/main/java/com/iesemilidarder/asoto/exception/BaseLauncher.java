package com.iesemilidarder.asoto.exception;

import com.iesemilidarder.asoto.data.Product;
import com.iesemilidarder.asoto.data.Vuelo;

import java.util.List;

public class BaseLauncher {
    public static void main(String... args) {
        Vuelo aux = new Vuelo();
        aux.setName("vuelo");
        DataHelper.insert(aux);
        List<Product> data = DataHelper.getData();
        // JAVA8
        for (Product v : data) {
            System.out.println(v.getName());
            System.out.println(v.getClass().toString());
        }
    }
}
