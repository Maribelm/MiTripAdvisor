package com.iesemilidarder.asoto.data;

import java.util.ArrayList;
import java.util.List;

public class DataHelper {
    public static List<Pais> paises = new ArrayList<>();
    public static List<Product> products = new ArrayList<>();

    public DataHelper() {

    }

    public static void main(String[] args) {
        String[] actividades = new String[]{"Montañismo,", "Monumentos,", "Esquí,", "Visitas a pueblos,", "Comer", "Hotel"};
        String[] tiposactividades = new String[]{"Cultura,", "Gatronomía,", "Senderismo", "Hotel"};

        String[] excursiones = new String[]{"GR211", "GR122", "GR666", "GR122"};
        for (int x = 0; x < excursiones.length; x++) {
            Excursion a = new Excursion();
            a.setName(excursiones[x]);
            products.add(a);
        }
        for (String excursion:excursiones){
            Excursion a = new Excursion();
            a.setName(excursion);
            a.setPais(new Pais("España"));
            products.add(a);
        }


        for (int x = 0; x < actividades.length; x++) {
            System.out.println(actividades[x]);
        }

    }
}
