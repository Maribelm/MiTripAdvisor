package com.iesemilidarder.asoto;

import com.iesemilidarder.asoto.data.Pais;

public class Launcher {

    public static void main(String... args) {
        try {
            SystemUtilHelper.consolePrint("TripAdvisor nuevo App 2.0");
            Pais pais = new Pais();
            pais.setName(new) = ("España", "Alemania", "Bahamas", "Brasil", "Bélgica");
            System.out.println("Pais:" + pais.getName());
            SystemUtilHelper.consolePrint("fin");

        } catch (
                Exception e) {
            SystemUtilHelper.logError(e);

        }

    }
}


