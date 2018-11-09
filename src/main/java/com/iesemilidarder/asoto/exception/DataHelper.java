package com.iesemilidarder.asoto.exception;

import com.iesemilidarder.asoto.data.Excursion;
import com.iesemilidarder.asoto.data.Pais;
import com.iesemilidarder.asoto.data.Product;
import com.iesemilidarder.asoto.data.Vuelo;

import java.util.ArrayList;
import java.util.List;

public class DataHelper {
    public static List<Pais> paises = new ArrayList<>();
    public static List<Product> products = new ArrayList<>();

    public DataHelper() {

        String[] actividades = new String[]{"Montañismo,", "Monumentos,", "Esquí,", "Visitas a pueblos,", "Comer", "Hotel"};
        String[] tiposactividades = new String[]{"Cultura,", "Gatronomía,", "Senderismo", "Hotel"};

        String[] excursiones = new String[]{"GR211", "GR122", "GR666", "GR122"};
        for (int x = 0; x < excursiones.length; x++) {
            Excursion a = new Excursion();
            a.setName(excursiones[x]);
            products.add(a);
        }
        for (String excursion : excursiones) {
            Excursion a = new Excursion();
            a.setName(excursion);
            a.setPais(new Pais("España"));
            products.add(a);
        }


        for (int x = 0; x < actividades.length; x++) {
            System.out.println(actividades[x]);
        }

    }

    public static List<Product> getData() {
        return null;
    }

    public static void insert(Vuelo aux) {
    }
}

