package com.iesemilidarder.asoto.data;

public class Pais  /*extends Vuelos */ {

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
    /*
    public static void main(String[] args) {
        String actividades = new String[] = ("Montañismo,"+ "Monumentos,"+ "Esquí,"+ "Visitas a pueblos,"+ "Comer");
        String tiposactividades = new String[] = ("Cultura,"+ "Gatronomía,"+ "Senderismo");

        for (int x = 0; x < (actividades).length(); x++) {
            System.out.println(actividades);
        }
    }*/
}

