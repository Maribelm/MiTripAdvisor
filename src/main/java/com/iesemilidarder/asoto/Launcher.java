package com.iesemilidarder.asoto;

import com.iesemilidarder.asoto.data.Pais;

import java.util.ArrayList;
import java.util.List;

public class Launcher {

    public static void main(String... args) {
        try {
            SystemUtilHelper.consolePrint("TripAdvisor nuevo App 2.0");
            List<Pais> listaPaises = new ArrayList<>();
            listaPaises.add(new Pais("España"));
            listaPaises.add(new Pais("Bahamas"));
            //listaPaises.add(new Pais("Brasil"));
            Pais i = new Pais("Brasil");
            i.setPopulation(5000);
            listaPaises.add(i);
            listaPaises.add(new Pais("Bélgica"));
            System.out.println("Paises en el sistema:" + listaPaises.size());
            SystemUtilHelper.consolePrint("fin");

        } catch (
                Exception e) {
            SystemUtilHelper.logError(e);

        }

    }
}


