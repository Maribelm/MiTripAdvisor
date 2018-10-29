package com.iesemilidarder.asoto;

import com.iesemilidarder.asoto.data.Pais;

import java.util.ArrayList;
import java.util.List;

public class Launcher {

    public static void main(String... args) {
        try {
            SystemUtilHelper.consolePrint("TripAdvisor nuevo App 2.0");
            List<Pais> listaPaises = new ArrayList<>();
            listaPaises.add(new Pais("Brasil"));
            listaPaises.add(new Pais("Bélgica"));
            listaPaises.add(new Pais("España"));
            listaPaises.add(new Pais("Bahamas"));
            //listaPaises.add(new Pais("Brasil"));
            Pais i = new Pais("Brasil");
            i.setPopulation(210000000);
            listaPaises.add(i);
            //listaPaises.add(new Pais("Bélgica"));
            Pais a = new Pais("Bélgica");
            a.staPaises.add(a);
            a.setPopulation(12000000);
            listaPaises.add(a);
            //listaPaises.add(new Pais("España"));
            Pais e = new Pais("España");
            e.staPaises.add(e);
            e.setPopulation(47000000);
            listaPaises.add(e);
            //listaPaises.add(new Pais("Bahamas"));
            Pais o = new Pais("Bahamas");
            o.staPaises.add(o);
            o.setPopulation(400000);
            listaPaises.add(o);
            //Fin de la lista. Se imprime por pantalla los paises
            System.out.println("Paises en el sistema:" + listaPaises.size());
            SystemUtilHelper.consolePrint("fin");
        } catch (
                Exception e) {
            SystemUtilHelper.logError(e);

        }

    }
}


